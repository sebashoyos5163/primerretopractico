# Ejercicio práctico 1 / Api-Rest con Spring Boot

# Tabla de Contenidos

1. [Introducción](#introducción)
2. [Instalación](#instalación)
	* [Requisitos básicos](#requisitos-básicos)
	* [Elementos de configuración aplicaciones , gestores de paquetes y frameworks](#elementos-de-configuración-aplicaciones-gestores-de-paquetes-y-frameworks)
	* [Elementos de configuración del proyecto Spring Boot](#Elementos-de-configuración-del-proyecto-Spring-Boot)
3. [Pasos para la instalación <Local> del proyecto](#pasos-de-instalacion-local)
4. [Pasos para la Ejecución <Local> del proyecto](#pasos-para-ejecucion-local)
5. [Recursos](#recursos)
	* [Esquema_Usuario](#usuario)
	* [Metodos](#metodos)


---

# Introducción

El objetivo de esta api es ofrecer una capacidad api REST qué permita a partir del envío de un nombre de usuario retornar un mensaje de bienvenida.
La API manejará los siguientes recursos:
* [Esquema_Usuario](#usuario)
* [Metodos](#metodos)

Todos los pedidos son devueltos en formato String texto plano.
---

# Instalación:
### Requisitos básicos
Deberá contar con los siguientes paquetes instalados:
* Java 17 ó +
* Spring Boot Framework 2.7 ó +
* Maven
* Git

___
### Elementos de configuración aplicaciones , gestores de paquetes y frameworks
A continuación se detallan los elementos configurados para correr el release a nivel de máquina:

1. Versión de java instalada
![version_java](https://github.com/sebashoyos5163/primerretopractico/blob/824c0570bf0946b5a9fdeb89df793837c3af6bdf/version%20java.png)

2. Versión de Maven
![version_maven](https://github.com/sebashoyos5163/primerretopractico/blob/824c0570bf0946b5a9fdeb89df793837c3af6bdf/version%20maven.png)

___
### Elementos de configuración del proyecto Spring Boot

A continuación se detallan los elementos configurados para correr el release a nivel del framework de spring boot:

1. Arquitectura de folders físicos base del proyecto 
![arquitectura_carpetas_del_proyecto](https://github.com/sebashoyos5163/primerretopractico/blob/824c0570bf0946b5a9fdeb89df793837c3af6bdf/estructura%20b%C3%A1sica%20del%20proyecto.png)

2. Versión de compilado de java 
![version_compilado_java_microservicio](https://github.com/sebashoyos5163/primerretopractico/blob/fd2556b8c2b3b9b91e0c5c3a2662680eaa08e47a/version%20compilado%20java%20microservicio.png)


3. IDE de preferencia en este caso lo ejemplificaremos con Visual Studio Code 
![ide](https://github.com/sebashoyos5163/primerretopractico/blob/f8ba12c82e39bf331d7d94761597c8d2a518191c/vs%20code.png)
___
### Pasos para la instalación <Local> del proyecto


A continuación se detalla el paso a paso de clonado/instalación local del proyecto, tenga presente qué es indispensable contar con una instalación previa de Git.

1. Clonado del proyecto desde la rama remota <main>

Deberá dirigirse al repositorio de código remoto disponible en la siguiente url https://github.com/sebashoyos5163/primerretopractico/tree/main allí deberá seleccionar el button derecho disponible en la parte superior derecha de la pantalla, seleccionar <clone> y fijarse en el apartado HTTPS, ubicarse sobre el campo con la URL disponible y darle CTRL + C (windows) CMMD + C(Mac). Como se relaciona en la imagen a continuación.
![clone](https://github.com/sebashoyos5163/primerretopractico/blob/f8ba12c82e39bf331d7d94761597c8d2a518191c/vista%20principal%20repositorio%20de%20c%C3%B3digo.png).

A partir de este punto deberá continuar con el proceso de clonado local de un proyecto remoto para pruebas locales en su terminal. Como se relaciona a continuación https://docs.github.com/es/repositories/creating-and-managing-repositories/cloning-a-repository.
Como esto es un Markdown de consumo del api no entraremos en detalles de cómo hacer el clonado por eso cito la referencia.

IMPORTANTE : recuerde qué el proyecto actualmente estará disponible en la rama <main> y sobre esta deberá realizar su checkout local para probar la versión.

### Pasos para la Ejecución <Local> del proyecto


A continuación se detalla el proceso de pruebas de microservicio desde un ambiente local, tenga presente qué es indispensable contar con una instalación previa de un cliente http para correr su test, en este caso ejemplificaremos con Postman.

1. Importación del proyecto al ide

Realice la importación del proyecto a su IDE de preferencia. Una vez pueda observar disponbible la arquitectura de ficheros en su equipo dirigase a la consola de comandos y ejecute el comando.

		mvn install

Este comando le permitirá a maven (Gestor de dependencias seleccionado) instalar las mismas en su proyecto y así aprovisionar todos los elementos y librerías necesarias para qué su proyecto pueda correr.

2. Despliegue a servidor Tomcat embebido spring boot

Como uno de los features más interesantes de spring es la auto configuración de un servidor embebido para nuestras pruebas locales no es necesario qué realicemos configuración adicional alguna. El proyecto ya está versionado en el repositorio target( origen del clone ) para qué instancie los starters necesarios para qué el microservicio funcione. Rn el caso de visual studio code para correr el proyecto nos dirigimos a la parte intermedia derecha de la pantalla dónde encontraremos un ícono de spring, le daremos click y posteriormente en el apartado de apps daremos click en el ícono de <run>. Como se relaciona en la siguiente imagen:

![deployment](https://github.com/sebashoyos5163/primerretopractico/blob/f8ba12c82e39bf331d7d94761597c8d2a518191c/compilacion%20del%20proyecto.png).

Posteriormente podremos visualizar el log resultante de la compilación con maven, la cuál nos retornará un resultado exitoso y nos disponibilizará el servidor local para hacer nuestros testeos. Por defecto el puerto lógico asignado para nuestro recurso será el 8080. En su defecto para acceder a los recursos de nuestra interfaz api bastará con poner en nuestro cliente http la url http:localhost:8080 y usaremos como basePath de nuestra api el recurso /api. Como resultante tendremos http://localhost:8080/api.

![resultado_compilacion](https://github.com/sebashoyos5163/primerretopractico/blob/f8ba12c82e39bf331d7d94761597c8d2a518191c/resultado%20de%20la%20compilacion.png).

# Recursos

## Usuario
Todos los usuarios deben tener un nombre asignado, a continuación se relaciona el objeto esquema qué representa esta entidad.

### Atibutos
##### * name:
	String . Valor correspondiente al nombre del usuario qué realiza la petición

___

### Metodos
#### Retornar mensaje de bienvenida con el nombre del usuario
##### Parámetros
* name
##### Request
	 verbo http GET  http://{$PATH}/api/name/{$name} name="nombre_de_usuario"
##### Responses
Algunas de las posibles respuestas:
* 200: La cuenta ha sido generada correctamente
* 500: Error en el servidor

Si la respuesta es exitosa se devolverá el recurso en formato texto plano
Ejemplo:

		HTTP/1.1 200 OK
		Content-Length: 39
		Date: Sat, 06 Dec 2017 22:41:16 GMT
		Server: WSGIServer/0.2 CPython/3.5.3
		X-Frame-Options: SAMEORIGIN

		Hola Sebastian Bienvenido a Spring Boot
		
	
Ejemplo respuesta :	
![response_name_operation](https://github.com/sebashoyos5163/primerretopractico/blob/f8ba12c82e39bf331d7d94761597c8d2a518191c/respuesta%20microservicio.png).
#### Verificar el estado del API con actuator
##### Request
	verbo http GET http://{$PATH}/actuator/health
##### Responses
Algunas de las posibles respuestas:
* 200: En caso de que la consulta haya sido realizada con éxito y el microservicio esté disponible
* 500: Error en el servidor

En caso de que la respuesta sea exitosa, también será devuelto el recurso modificado en formato JSON
Ejemplo:

		HTTP/1.1 200 OK
		Content-Length: 133
		Content-Type: application/json
		Date: Sun, 10 Dec 2017 02:26:12 GMT
		Server: WSGIServer/0.2 CPython/3.5.3
		X-Frame-Options: SAMEORIGIN

		{
            "status": "UP"
        }
       
Ejemplo respuesta :	
![response_actuator](https://github.com/sebashoyos5163/primerretopractico/blob/f8ba12c82e39bf331d7d94761597c8d2a518191c/respuesta%20microservicio%20actuator.png).

