println "initializing...."

job('Build'){
  properties {
    githubProjectUrl('VictorCabello/Maven-Spring-MVC')
  }

  scm {
      git {
          remote {
              github('VictorCabello/Maven-Spring-MVC')
              refspec('+refs/pull/*:refs/remotes/origin/pr/*')
          }
          branch('${sha1}')
      }
  }
  triggers {
      pullRequest {
          cron('* * * * *')
          permitAll()
          autoCloseFailedPullRequests()
          extensions {
              commitStatus {
                  context('perfrom test ')
                  startedStatus('test code...')
                  completedStatus('SUCCESS', 'All is well')
                  completedStatus('FAILURE', 'Something went wrong. Investigate!')
              }
          }
      }
  }

  steps {
    shell( 'mvn clean install')
  }
}

job('Deploy'){
  steps {
    shell( 'echo \'Deploying war\'')
  }
  triggers {
    upstream('Build')
  }
}

job('Testing'){
  steps {
    shell( 'echo \'Testing app\'')
  }
  triggers {
    upstream('Deploy')
  }
}



buildPipelineView('Pipeline'){
  selectedJob('Build')
}
