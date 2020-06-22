# app-bice
App Spring Boot e Hibernate Servicios Rest

Si queremos dockerizar nuestra app (El proyecto ya contiene el Dockerfile de configuración)

docker build -t "app-bice-test" .


Preparar imagen para subir:
docker tag app-bice-test jcoronanavarro/app-bice-test:latest


Para subir a dockerhub:
docker push jcoronanavarro/app-bice-test:latest
