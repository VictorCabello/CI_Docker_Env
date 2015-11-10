println "initializing...."

job('Build'){
  steps {
    shell( 'echo \'Building code\'')
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
