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

## Correr el CI environment
Para correr este demo basta con clonar el repositorio:
```
git clone https://github.com/VictorCabello/CI_Docker_Env.git
```

Compilar el código:
```
cd CI_Docker_Env
docker build -t mycompan/jenkins .
```

Y Correr nuestras nuevas instancias:
```
docker run --name myjenkins -p 8080:8080 mycompany/jenkins
```


## Objetivos

### Alcanzados

* Generar un Jenkins container con la lista de plugins requeridos.
* Crear un mecanismo que permita representar los Jenkins jobs en forma de código.
* Crear un primer draft de un simple pipeline

### Por hacer

* Mover la lista de objetivos a los GitHub Issues para dar más claridad al avance.
* Integrar Jeknis GitHub
* Configurar Docker Compose para arrancar el ambiente de forma sencilla
* Almacenar el resultado del build en Nexus (Crear un contenedor para Nexus)
* Incluir un application server (por ejemplo tomcat) para hacer deploy de la aplicación.
* Configurar un Selenium Grid para correr smoke test.


