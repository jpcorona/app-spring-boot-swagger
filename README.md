# app-bice
App Spring Boot e Hibernate Servicios Rest

Si queremos dockerizar nuestra app (El proyecto ya contiene el Dockerfile de configuración)

docker build -t "app-bice-test" .


Preparar imagen para subir:
docker tag app-bice-test jcoronanavarro/app-bice-test:latest


Para subir a dockerhub:
docker push jcoronanavarro/app-bice-test:latest


Descargar imagen:

Abrir una consola de comandos y ejecutar docker pull jcoronanavarro/reservas-bice:latest

Generar contenedor:

docker run -d --name app-docker-bice-test --add-host=postgres_server:192.168.1.89 -p 8080:8080 jcoronanavarro/app-bice-test:latest
