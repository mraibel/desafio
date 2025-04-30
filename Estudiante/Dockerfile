# Usar la imagen base con JDK 21
FROM openjdk:21-jdk

# Exponer puerto (informativo)
EXPOSE 8080

# Establecer el directorio de trabajo
WORKDIR /root

# Copiar archivos de configuración de Maven
COPY ./pom.xml /root
COPY ./.mvn /root/.mvn
COPY ./mvnw /root

# Descargar dependencias sin compilar la app
RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline

# Copiar el código fuente
COPY ./src /root/src

# Compilar la aplicación sin ejecutar tests
RUN ./mvnw clean package -DskipTests

# Renombrar el jar generado a app.jar (puede usar wildcard si cambia la versión)
RUN mv target/*.jar app.jar

# Comando de inicio del contenedor
ENTRYPOINT ["java", "-jar", "app.jar"]
