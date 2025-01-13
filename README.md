Proyecto Escuela

Este repositorio contiene el código fuente y la documentación de un sistema cliente-servidor desarrollado en Java, enfocado en la gestión de actividades extracurriculares para estudiantes universitarios. El proyecto utiliza sockets para la comunicación bidireccional entre cliente y servidor y proporciona una interfaz gráfica amigable creada con Swing.

Descripción del Proyecto

El sistema está diseñado para resolver los problemas de ineficiencia en la asignación de horarios de actividades extracurriculares, como talleres y deportes, en una universidad. Los estudiantes pueden enviar solicitudes desde una aplicación cliente, que son procesadas por el servidor para asignar horarios de manera eficiente.

Características Principales

Modelo Cliente-Servidor:

El servidor administra las solicitudes de los estudiantes y asigna horarios.

El cliente permite a los estudiantes registrar sus preferencias.

Comunición con Sockets:

Implementación de flujos de entrada y salida para transmitir datos entre cliente y servidor.

Serialización de objetos para enviar información estructurada.

Interfaces Gráficas (GUI):

Diseño de formularios para cliente y servidor utilizando Swing.

Concurrencia:

Manejo de hilos para garantizar la comunicación asíncrona y eficiente entre cliente y servidor.

Validaciones:

Verificación de datos antes del envío de solicitudes.

Estructura del Proyecto

ProyectoEscuela/
|-- src/
|   |-- proyectoescuela/
|       |-- FormularioClienteEstudiante.java
|       |-- FormularioServidorEscuela.java
|       |-- ProyectoEscuela.java
|       |-- SolicitudEstudiante.java
|-- build/
|-- dist/
|   |-- ProyectoEscuela.jar
|-- .vscode/
|-- nbproject/
|-- solicitud_estudiante.txt
|-- README.md

src/: Contiene los archivos fuente del proyecto.

dist/: Incluye el archivo ejecutable ProyectoEscuela.jar.

.vscode/ y nbproject/: Configuraciones del entorno de desarrollo.

Requisitos

Java Development Kit (JDK) 8 o superior.

IDE compatible con proyectos Java (NetBeans recomendado).

Conexión a la misma red para probar cliente y servidor.

Instrucciones de Ejecución

Compilación:

Abrir el proyecto en NetBeans o cualquier IDE compatible.

Compilar los archivos fuente en el directorio src/.

Ejecución del Servidor:

Ejecutar el archivo FormularioServidorEscuela.

El servidor estará disponible en el puerto configurado (por defecto, 5000).

Ejecución del Cliente:

Ejecutar el archivo FormularioClienteEstudiante.

Conectar al servidor usando la IP y puerto configurados.

Interacción:

Registrar una solicitud en el cliente y enviarla al servidor.

El servidor procesará la solicitud y enviará una respuesta al cliente.

Tecnologías Utilizadas

Lenguaje de Programación: Java

Frameworks: Swing para la interfaz gráfica

Modelo Cliente-Servidor: Sockets

Contribución

Las contribuciones son bienvenidas. Para contribuir:

Realiza un fork del repositorio.

Crea una rama para tu función (‘feature/nueva-funcion’).

Realiza los cambios necesarios y haz un commit.

Envía un pull request.

Autores

Sergio Meneses Hernández

Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más información.

Referencias

Oracle. Documentación oficial de clases y sockets en Java.

Joyanes, L. (2011). Programación en Java 6.

Sánchez, J. (2004). Programación en red con Java.

