# CI_Docker_Env
Este repositorio fue creado con la intención de compartir y  difundir conocimiento relativo a DevOps con un foco muy particular en lo que es “Infraestructure as  Code”, pretendiendo mostrar como inclusive un pipeline  puede ser representado en términos de código, con las ventajas que esto conlleva. 
En este ejercicio en particular ejercitaremos las tecnologías:
* Jenkins
* Docker
* Nexus
* Maven
* Tomcat

## Pre requisitos

* Docker, el siguiente enlace describe como instalar docker: http://docs.docker.com/v1.8/installation/

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

Y Correr nuestras nuevas intancias:
```
docker run --name myjenkins -p 8080:8080 mycompany/jenkins
```


## Objetivos

### Alcansados

* Generar un Jenkins container que con la lista de plugins requeridos.
* Crear un mecanismo que permita representar los Jenkins job en forma de codigo.
* Crear un primer draft de un simple pipeline

### Por hacer

* Mover la lista de objectivos a los GitHub Issues para dar mas claridad al avance.
* Integrar Jeknis GitHub
* Configurar Docker Compose para arrancar el ambiente de forma sensilla
* Almacenar el resulatdo del build en Nexus (Crear un contendor para Nexus)
* Incluir un application server (por ejemplo tomcat) para hacer deploy de la applicacion.
* Configurar un Selenium Grid para correr smoke test.


