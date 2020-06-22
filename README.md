# app-bice
Se desarrollar un CRUD con servicios REST considerando y tulizando las siguientes características:

1-App Spring Boot e Hibernate Servicios Rest
2-Patrón de diseño MVC
3-JPA (hibernate) -> Maneja sólo BD Relacionales.
4-Optimización de Pojos con Lombok
5-Se añadio JPA Repository para trabaja sobre una capa de abstracción un poco más alta en las operaciones CRUD
6-Implementar servicio de negocio para las operaciones CRUD y para indicar que las clases son un bean de la capa de negocios se utilizo la anotación @Service.
7-Para manejar la transaccionalidad de un servicio de negocio de utilizo la anotación @Transactional.
8-Se utilizo Swagger para documentar los servicios
9-Se utilizo la arquitectura REST para construir servicios web.
10-Para manejar la seguridad se utlizó Spring Security y la referencia de vulnerabilidas recientes el proyecto open source OWASP


Si queremos dockerizar nuestra app (El proyecto ya contiene el Dockerfile de configuración)
docker build -t "app-bice-test" .

Preparar imagen para subir:
docker tag bice-test jcoronanavarro/bice-test:latest

Para subir a dockerhub:
docker push jcoronanavarro/bice-test:latest

nota: reemplazar jcoronanavarro por su id en docker hub.

Para ejecutar el Spring tools Suite:
1)Descargar proyecto maven
2)Importar como proyecto maven
3)Eejecutar con maven build : clean install spring-boot:run
4)Abir el navegador localhost:8080
5) acceder con user:bice password:bicevida
6) En el enlace del home se encuentra la documentación con Swagger de los servicios REST creados. 

Para ejecutar la app dockerizada y versionada en Docker HUB:
Descargar imagen:
Abrir una consola de comandos y ejecutar docker pull jcoronanavarro/bice-test:latest
Generar contenedor:
docker run -d --name app-docker-bice-test --add-host=postgres_server:[IP DE SU COMPUTADOR] -p 8080:8080 jcoronanavarro/app-bice-test:latest


Para ejecutar la aplicacion en Spring tools Suite que consume la API https://www.indecon.online/
1)Descargar proyecto maven
2)Importar como proyecto maven
3)Eejecutar con maven build : clean install spring-boot:run
4)Abir el navegador localhost:2410
5) Se traeran los valores de "Plata" - "cobre" - "oro"



