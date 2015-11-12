# CI_Docker_Env
Este repositorio fue creado con la intención de compartir y  difundir conocimiento relativo a DevOps con un foco muy particular en lo que es “Infraestructure as  Code”, pretendiendo mostrar como inclusive un pipeline  puede ser representado en términos de código, con las ventajas que esto conlleva. 
En esta práctica en particular ejercitaremos las tecnologías:
* Jenkins
* Docker
* Nexus
* Maven
* Tomcat

## Pre requisitos

* Docker, el siguiente enlace describe como instalar Docker: http://docs.docker.com/v1.8/installation/
* Docker compose, si docker se instalo sobre windows, docker compose debe instalarse en la maquina virtual donde se instalo docker, el siguiente enlace describe como instalarlo: https://docs.docker.com/compose/install/

## Correr el CI environment
Para correr este demo basta con clonar el repositorio:
```
git clone https://github.com/VictorCabello/CI_Docker_Env.git
```

Correr el ambiente uttilizamos docker-compose de la siguiente manera:
```
cd CI_Docker_Env
docker-compose up
```


## Objetivos

### Alcanzados

* Generar un Jenkins container con la lista de plugins requeridos.
* Crear un mecanismo que permita representar los Jenkins jobs en forma de código.
* Crear un primer draft de un simple pipeline
* Configurar Docker Compose para arrancar el ambiente de forma sencilla

### Por hacer

* Integrar Jeknis GitHub
* Almacenar el resultado del build en Nexus (Crear un contenedor para Nexus)
* Incluir un application server (por ejemplo tomcat) para hacer deploy de la aplicación.
* Configurar un Selenium Grid para correr smoke test.


