FROM openjdk:11
VOLUME /tmp
ENV _JAVA_OPTIONS "-Xms256m -Xmx1536m"
COPY target/warehouse-0.0.1-SNAPSHOT.jar /opt/app.jar
WORKDIR /opt
EXPOSE 8080
ENTRYPOINT ["java", \
"-Djava.security.egd=file:/dev/./urandom", \
"-jar", "/opt/app.jar"]
