FROM jenkins

COPY plugins.txt /usr/share/jenkins/ref/
RUN /usr/local/bin/plugins.sh /usr/share/jenkins/ref/plugins.txt

USER root
RUN mkdir -p /var/jenkins_home/jobs/seed/workspace
COPY seed/config.xml /var/jenkins_home/jobs/seed/
COPY seed/workspace/seed.groovy /var/jenkins_home/jobs/seed/workspace/
RUN chown -R jenkins:jenkins /var/jenkins_home
RUN apt-get update && apt-get install -y maven
USER root
