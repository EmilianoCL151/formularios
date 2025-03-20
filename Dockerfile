# Usa una imagen base oficial de OpenJDK (versión 17 en este caso)
FROM openjdk:23-jdk-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /formularios

# Copia el archivo JAR al contenedor
COPY target/formularios-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que la aplicación escucha (puerto 8080 es común para Spring Boot)
EXPOSE 8080

# Comando para ejecutar la aplicación Java
CMD ["java", "-jar", "app.jar"]
