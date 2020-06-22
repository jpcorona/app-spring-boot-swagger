# app-bice
App Spring Boot e Hibernate Servicios Rest

Si queremos dockerizar nuestra app (El proyecto ya contiene el Dockerfile de configuración)

docker build -t "app-bice-test" .

Para subir a dockerhub:

docker tag app-bice-test jcoronanavarro/app-bice-test:latest

docker push jcoronanavarro/app-bice-test:latest
