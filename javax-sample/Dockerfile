FROM jboss/wildfly

USER root
RUN yum install -y maven
COPY . /tmp/javax-sample/
RUN chown -R jboss:jboss /tmp/javax-sample/

USER jboss
WORKDIR /tmp/javax-sample/
RUN mvn clean install
RUN cp target/javax-sample-1.0-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/
