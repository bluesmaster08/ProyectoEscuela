# Proyecto Escuela

Este proyecto es una aplicación desarrollada en Java que implementa un sistema de gestión para solicitudes escolares. Incluye componentes cliente-servidor y formularios interactivos para los usuarios.

## Características principales

- **Formulario de Cliente Estudiante**: Permite a los estudiantes realizar solicitudes al sistema.
- **Formulario de Servidor Escuela**: Gestiona las solicitudes recibidas desde el lado del servidor.
- **Interfaz gráfica**: Diseñada con formularios para facilitar la interacción.
- **Estructura cliente-servidor**: Implementa comunicación entre los formularios cliente y servidor.

## Requisitos del sistema

- **Java Development Kit (JDK)**: Versión 8 o superior.
- **NetBeans IDE**: Para abrir y ejecutar el proyecto (opcional).
- **Apache Ant**: Para construir el proyecto.

## Estructura del proyecto

```
ProyectoEscuela/
├── build/                # Archivos compilados (generados automáticamente)
├── build.xml             # Script de construcción de Apache Ant
├── dist/                 # Artefactos distribuidos, como archivos JAR
├── nbproject/            # Configuración específica de NetBeans
├── src/                  # Código fuente del proyecto
│   └── proyectoescuela/
│       ├── FormularioClienteEstudiante.form
│       ├── FormularioClienteEstudiante.java
│       ├── FormularioServidorEscuela.form
│       ├── FormularioServidorEscuela.java
│       ├── ProyectoEscuela.java
│       └── SolicitudEstudiante.java
└── test/                 # Archivos para pruebas
```

## Instalación y configuración

1. **Clonar el repositorio**:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd ProyectoEscuela
   ```

2. **Abrir el proyecto en NetBeans** (opcional):
   - Desde NetBeans, selecciona `File > Open Project` y selecciona la carpeta `ProyectoEscuela`.

3. **Construir el proyecto con Ant**:
   ```bash
   ant clean
   ant jar
   ```

4. **Ejecutar el archivo JAR generado**:
   ```bash
   java -jar dist/ProyectoEscuela.jar
   ```

## Uso

### Cliente
- Abre el formulario de cliente (`FormularioClienteEstudiante`) para realizar solicitudes.

### Servidor
- Usa el formulario de servidor (`FormularioServidorEscuela`) para gestionar solicitudes recibidas.

## Contribuciones

1. Realiza un fork del repositorio.
2. Crea una rama para tus cambios:
   ```bash
   git checkout -b feature/nueva-funcionalidad
   ```
3. Realiza un commit de tus cambios:
   ```bash
   git commit -m "Agrega nueva funcionalidad"
   ```
4. Sube los cambios a tu rama:
   ```bash
   git push origin feature/nueva-funcionalidad
   ```
5. Abre un Pull Request en GitHub.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
## Autor
Sergio Meneses Hernández

