FROM openjdk

WORKDIR /app

COPY target/SpringRestProjectByDurgesh-0.0.1-SNAPSHOT.jar "SpringRestProjectByDurgesh-0.0.1-SNAPSHOT.jar"

EXPOSE 9090

ENTRYPOINT ["java","-jar","SpringRestProjectByDurgesh-0.0.1-SNAPSHOT.jar"]