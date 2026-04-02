-- ====================================================
-- SISTEMA DE GESTIÓN DE PERSONAS - TABLA PERSONA
-- Base de datos: mensesajs_db
-- ====================================================

-- 1. Crear/Usar la base de datos
CREATE DATABASE IF NOT EXISTS mensesajs_db;
USE mensesajs_db;

-- 2. Crear la tabla persona (exactamente como la tienes)
CREATE TABLE IF NOT EXISTS persona (
    id_persona INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    telefono VARCHAR(20)
);

-- 3. Insertar los datos que ya tienes registrados
INSERT INTO persona (id_persona, nombre, apellido, email, telefono) VALUES
(1, 'Juan', 'Pérez', 'jperez@email.com', '123456789'),
(2, 'Mica', 'Males', 'mmales@email.com', '123456789'),
(3, 'Juan Pablo', 'Santillan', 'psantillan@email.com', '123456789'),
(4, 'Erika Mabel', 'Quintanilla Salcedo', 'equintanilla@email.com', '123456789'),
(5, 'Erikitoski D', 'Quinta', 'equinta@email.com', '9876543210');

-- 4. Verificar que todo está correcto
SELECT * FROM persona;

-- 5. Si necesitas reiniciar el auto_increment después de insertar manualmente
ALTER TABLE persona AUTO_INCREMENT = 6;