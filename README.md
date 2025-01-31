Clínica Odontológica 🦷

Este proyecto es un sistema de gestión para una clínica odontológica, desarrollado con tecnologías modernas como Java, Spring Boot, Thymeleaf, MySQL y Bootstrap. El objetivo es proporcionar una aplicación web funcional que permita administrar pacientes, odontólogos y turnos de manera eficiente.
Tecnologías utilizadas 💻

    Java: Lenguaje de programación principal.

    Spring Boot: Framework para el desarrollo del backend.

    Thymeleaf: Motor de plantillas para la creación de vistas dinámicas.

    MySQL: Base de datos para almacenar la información.

    Bootstrap: Framework CSS para el diseño responsive y moderno de la interfaz.

    IntelliJ IDEA: Entorno de desarrollo integrado (IDE) utilizado.

Funcionalidades principales 🛠️

    Gestión de Pacientes:

        Registrar nuevos pacientes.

        Listar, editar y eliminar pacientes.

    Gestión de Odontólogos:

        Registrar nuevos odontólogos.

        Listar, editar y eliminar odontólogos.

    Gestión de Turnos:

        Programar nuevos turnos.

        Listar, editar y eliminar turnos.

        Validación de turnos para evitar solapamientos.

Capturas de pantalla 🖼️


![Captura de pantalla 2025-01-27 113940](https://github.com/user-attachments/assets/07058956-0456-41c1-96f0-825c17aefc5f)
![Captura de pantalla 2025-01-27 143856](https://github.com/user-attachments/assets/eebcd717-7c3c-44f6-999d-c5ebf00c0e5e)
![Captura de pantalla 2025-01-27 114236](https://github.com/user-attachments/assets/a74e0520-f856-4527-8d51-acaef39a09d1)
![Captura de pantalla 2025-01-27 114204](https://github.com/user-attachments/assets/c0526b52-8bc2-4c84-bb58-f759d0acf82b)
![Captura de pantalla 2025-01-27 114120](https://github.com/user-attachments/assets/2d82dcfb-d8e3-4679-afa0-a8165c0946e8)
![Captura de pantalla 2025-01-27 114052](https://github.com/user-attachments/assets/9fbc583f-493d-4928-b625-13c22245bd77)
![Captura de pantalla 2025-01-27 114035](https://github.com/user-attachments/assets/25d49002-8644-4638-afa0-96ec296a25d8)
![Captura de pantalla 2025-01-27 114007](https://github.com/user-attachments/assets/33801448-0eac-49c1-bf2d-f848a6e2fe5a)

Requisitos previos 📋

Para ejecutar este proyecto en tu máquina local, necesitas:

    Java JDK 11 o superior.

    MySQL instalado y configurado.

    Maven para la gestión de dependencias.

    Un IDE como IntelliJ IDEA o Eclipse.

Instalación y configuración ⚙️

Clona el repositorio:

    git clone https://github.com/luka-raffo/Clinica-Odontologica.git

Configura la base de datos:

  Crea una base de datos en MySQL llamada clinica_odontologica.
  Ajusta las credenciales de la base de datos en el archivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/clinica_odontologica
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

Compila y ejecuta el proyecto:

Abre el proyecto en tu IDE.

Ejecuta la clase principal ClinicaOdontologicaApplication.java.

Accede a la aplicación:

Abre tu navegador y visita http://localhost:8080.

Estructura del proyecto 📂

    Clinica-Odontologica/
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── ejemplo/
    │   │   │           └── clinicaodontologica/
    │   │   │               ├── controller/         # Controladores de la aplicación
    │   │   │               ├── model/              # Entidades y modelos de datos
    │   │   │               ├── repository/         # Repositorios para acceso a datos
    │   │   │               ├── service/            # Lógica de negocio y servicios
    │   │   │               └── ClinicaOdontologicaApplication.java  # Clase principal
    │   │   ├── resources/
    │   │   │   ├── static/                         # Archivos estáticos (CSS, JS, imágenes)
    │   │   │   ├── templates/                      # Plantillas Thymeleaf
    │   │   │   └── application.properties          # Configuración de la aplicación
    │   └── test/                                   # Pruebas unitarias y de integración
    └── pom.xml                                     # Archivo de configuración de Maven

Contribuciones 🤝

¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto, sigue estos pasos:

Haz un fork del repositorio.

Crea una rama para tu feature (git checkout -b feature/nueva-funcionalidad).

Realiza tus cambios y haz commit (git commit -m 'Añade nueva funcionalidad').

Haz push a la rama (git push origin feature/nueva-funcionalidad).

Abre un Pull Request.

