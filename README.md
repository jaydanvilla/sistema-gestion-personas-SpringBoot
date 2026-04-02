# Sistema de Gestión de Personas

API REST para la gestión completa de personas (CRUD) desarrollada con Spring Boot y MySQL.

## 🖥️ Capturas del Sistema

<img width="1339" height="664" alt="img1" src="https://github.com/user-attachments/assets/21ce88ab-28fb-4e92-acbe-ac13c79188da" />
<img width="1331" height="657" alt="img2" src="https://github.com/user-attachments/assets/7ca175dd-cdb9-4027-b62a-04a6858a1f72" />
<img width="1339" height="667" alt="img3" src="https://github.com/user-attachments/assets/a42f0fa3-d6b8-4c2a-a644-f59bf0741f95" />
<img width="1321" height="674" alt="img4" src="https://github.com/user-attachments/assets/826109a4-93db-4775-8d39-8d06ef48f708" />

## 📋 Descripción del Proyecto

Sistema backend que permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre un registro de personas. 
Desarrollado siguiendo buenas prácticas de arquitectura de software y patrones de diseño.

## 🛠️ Tecnologías Utilizadas

- **Java 17** - Lenguaje de programación
- **Spring Boot 3.x** - Framework principal
- **MySQL 8.0** - Base de datos relacional
- **Maven** - Gestor de dependencias
- **NetBeans IDE 28** - Entorno de desarrollo

## 🏗️ Arquitectura del Proyecto

El proyecto sigue una **arquitectura por capas (Layered Architecture)**:
PrimerProject/
│
├── .mvn/                          # Wrapper de Maven
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── prueba/primerspring/PrimerProject/
│   │   │       ├── Controlador.java              # REST Controller
│   │   │       ├── PrimerProjectApplication.java # Clase principal
│   │   │       │
│   │   │       ├── dao/
│   │   │       │   └── PersonaDao.java           # Repository JPA
│   │   │       │
│   │   │       ├── domain/
│   │   │       │   └── Persona.java              # Entidad JPA
│   │   │       │
│   │   │       └── service/
│   │   │           ├── PersonaService.java       # Interfaz de servicio
│   │   │           └── PersonaServiceImpl.java   # Implementación
│   │   │
│   │   └── resources/
│   │       ├── application.properties            # Configuración
│   │       ├── static/                           # Recursos estáticos (CSS, JS)
│   │       └── templates/                        # Plantillas HTML
│   │           ├── index.html                    # Página principal
│   │           └── modificar.html                # Formulario de edición
│   │
│   └── test/                        # Pruebas unitarias
│
├── target/                          # Código compilado (ignorado por Git)
├── bd-scripts/                      # Scripts de base de datos
│   └── BD_sistema_personas.sql      # Creación de BD y tablas
│
├── .gitignore                       # Archivos ignorados por Git
├── pom.xml                          # Dependencias Maven
└── nb-configuration.xml             # Configuración de NetBeans


## 👨‍💻 Autor

**Jaydan Villa**  
- GitHub: [@jaydanvilla](https://github.com/jaydanvilla)  
- Proyecto: [sistema-gestion-personas-SpringBoot](https://github.com/jaydanvilla/sistema-gestion-personas-SpringBoot)

## ⭐ ¿Te gustó este proyecto?

¡No olvides dejar una estrella en GitHub!
