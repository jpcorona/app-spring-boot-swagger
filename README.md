# app-bice

La aplicación consiste el una aplicación de reservas con sus respectivo CRUD con servicios REST que está documentado con swagger.
Se uso framework thymeleaf para implementar plantilla html.

Antes de ejecutar se debe tener configurado las variables de entorno en el equipo (JAVA_HOME y PATH
Para ejecutar el Spring tools Suite:

1)Descargar proyecto maven

2)Importar como proyecto maven

3)Eejecutar con maven build : clean install spring-boot:run

4)Abir el navegador localhost:8080

5) acceder con user:bice password:bicevida

6) En el enlace del home se encuentra la documentación con Swagger de los servicios REST creados. 


nota: si los puertos están ocupados ejecutar los siguientes comandos:

•	netstat -ao |find /i “listening” --> Identificas el Id del proceso.

•	Taskkill /F /IM <Id del Proceso del Puerto 8080> Terminas el proceso



#####################EJECUTAR APLIACION DESCARGANDO IAMEGEN VERSIONADA EN DOCKER HUB############################
Para ejecutar la app dockerizada y versionada en Docker HUB:
Descargar imagen:

Abrir una consola de comandos y ejecutar docker pull jcoronanavarro/bice-test:latest
Generar contenedor:


docker run -d --name app-docker-bice-test --add-host=postgres_server:[IP DE SU COMPUTADOR] -p 8080:8080 jcoronanavarro/app-bice-test:latest



Se desarrolla un CRUD con servicios REST considerando y tulizando las siguientes características:

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

############################################################################################
Si queremos dockerizar nuestra app (El proyecto ya contiene el Dockerfile de configuración)

docker build -t "app-bice-test" .

Preparar imagen para subir:
docker tag bice-test jcoronanavarro/bice-test:latest

Para subir a dockerhub:
docker push jcoronanavarro/bice-test:latest

nota: reemplazar jcoronanavarro por su id en docker hub.
###############################################################################################


Notas si no exoste configuración en el equipo:

Descargar e instalar jdk 8 de acuerdo al tipo de arquitectura del pc(en mi caso es de 64 bits)
En esta instalación también se instala el JRE EL CUÁL NOS SIRVE PARA EJECUTAR APLICACIONES JAVA,
SE DEJA LA CAPRETA POR DEFECTO DE INSTALACIÓN.

Luego configuramos las variables de entorno:
Abrir una consola para verfificar que variables existen configuradas:
echo $JAVA_HOME

En Windows, para crear la variable JAVA_HOME se pueden seguir los siguientes pasos:

Hacer clic en el botón derecho de "Equipo"
Seleccionar "Propiedades"
Pinchar en "Configuración avanzada del sistema" > "Variables de entorno"
Pulsar en el botón "Nueva..." (variable del sistema)
En el "Nombre de la variable" escribir JAVA_HOME y en el "Valor de la variable" poner la ruta donde se instalo jdk 8.
En mi caso es C:\Program Files\Java\jdk1.8.0_202

Configurar PATH

Hacer clic en el botón derecho de "Equipo"
Seleccionar "Propiedades"
Pinchar en "Configuración avanzada del sistema" > "Variables de entorno"
Seleccionar la variable PATH
Pulsar en el botón "Editar"
En el "Valor de la variable" –sin borrar lo que ya hay– añadir al final un punto y coma ";" seguido de la ruta donde se encuentre el archivo javac.exe. Por ejemplo:
;C:\Program Files\Java\jdk1.8.0_151\bin



Instalar Maven
Descaragr versión 3.6.3 de MAVEN
Luego de descargar copiar en el disco c y descomprimir
Luego creamos la Varuable de entorno para MAVEN:

Hacer clic en el botón derecho de "Equipo"
Seleccionar "Propiedades"
Pinchar en "Configuración avanzada del sistema" > "Variables de entorno"
Click en el botón "Nueva..." (variable del sistema)
En el "Nombre de la variable" escribir MVN_HOME y en el "Valor de la variable" poner la ruta donde está la carpeta bin de maven.
En mi caso es C:\apache-maven-3.6.3\bin



