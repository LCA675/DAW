-- *************************************************************
-- * SISTEMA DE GESTIÓN VETERINARIA (Estructura espejo Tienda) *
-- *************************************************************

-- *******************************************
-- * PASO 0: Eliminación de tablas existentes *
-- *******************************************

DECLARE tabla_no_existe EXCEPTION; PRAGMA EXCEPTION_INIT(tabla_no_existe, -942); BEGIN EXECUTE IMMEDIATE 'DROP TABLE DETALLE_CITA CASCADE CONSTRAINTS'; EXCEPTION WHEN tabla_no_existe THEN NULL; END;
/
DECLARE tabla_no_existe EXCEPTION; PRAGMA EXCEPTION_INIT(tabla_no_existe, -942); BEGIN EXECUTE IMMEDIATE 'DROP TABLE CITAS CASCADE CONSTRAINTS'; EXCEPTION WHEN tabla_no_existe THEN NULL; END;
/
DECLARE tabla_no_existe EXCEPTION; PRAGMA EXCEPTION_INIT(tabla_no_existe, -942); BEGIN EXECUTE IMMEDIATE 'DROP TABLE SERVICIOS CASCADE CONSTRAINTS'; EXCEPTION WHEN tabla_no_existe THEN NULL; END;
/
DECLARE tabla_no_existe EXCEPTION; PRAGMA EXCEPTION_INIT(tabla_no_existe, -942); BEGIN EXECUTE IMMEDIATE 'DROP TABLE CLIENTES CASCADE CONSTRAINTS'; EXCEPTION WHEN tabla_no_existe THEN NULL; END;
/
DECLARE tabla_no_existe EXCEPTION; PRAGMA EXCEPTION_INIT(tabla_no_existe, -942); BEGIN EXECUTE IMMEDIATE 'DROP TABLE VETERINARIOS CASCADE CONSTRAINTS'; EXCEPTION WHEN tabla_no_existe THEN NULL; END;
/

-- *********************************
-- * PASO 1: Creación de las tablas *
-- *********************************

-- 1. Tabla CLIENTES (Dueños)
CREATE TABLE CLIENTES (
    codigo_cliente NUMBER(10) PRIMARY KEY,
    dni VARCHAR2(10) UNIQUE NOT NULL,
    nombre VARCHAR2(30) NOT NULL,
    direccion VARCHAR2(50),
    telefono VARCHAR2(15),
    codigo_recomendador NUMBER(10)
);

-- 2. Tabla SERVICIOS
CREATE TABLE SERVICIOS (
    codigo_servicio NUMBER(10) PRIMARY KEY,
    nombre VARCHAR2(50) NOT NULL,
    precio NUMBER(10, 2) NOT NULL
);

-- 3. Tabla VETERINARIOS
CREATE TABLE VETERINARIOS (
    codigo_veterinario NUMBER(10) PRIMARY KEY,
    nombre VARCHAR2(30) NOT NULL,
    especialidad VARCHAR2(30)
);

-- 4. Tabla CITAS
CREATE TABLE CITAS (
    codigo_cita NUMBER(10) PRIMARY KEY,
    codigo_cliente NUMBER(10) NOT NULL,
    codigo_veterinario NUMBER(10), -- Puede ser NULL (Cita sin asignar)
    fecha DATE NOT NULL,
    CONSTRAINT fk_cita_cliente FOREIGN KEY (codigo_cliente) REFERENCES CLIENTES(codigo_cliente),
    CONSTRAINT fk_cita_vet FOREIGN KEY (codigo_veterinario) REFERENCES VETERINARIOS(codigo_veterinario)
);

-- 5. Tabla DETALLE_CITA (Relación N:M entre Citas y Servicios)
CREATE TABLE DETALLE_CITA (
    codigo_cita NUMBER(10) NOT NULL,
    codigo_servicio NUMBER(10) NOT NULL,
    cantidad NUMBER(5) NOT NULL,
    precio_aplicado NUMBER(10, 2) NOT NULL,
    PRIMARY KEY (codigo_cita, codigo_servicio),
    CONSTRAINT fk_det_cita FOREIGN KEY (codigo_cita) REFERENCES CITAS(codigo_cita),
    CONSTRAINT fk_det_servicio FOREIGN KEY (codigo_servicio) REFERENCES SERVICIOS(codigo_servicio)
);

-- 6. Auto-referencia para recomendaciones
ALTER TABLE CLIENTES
ADD CONSTRAINT fk_cli_recomendador
FOREIGN KEY (codigo_recomendador) REFERENCES CLIENTES(codigo_cliente);


-- **********************************
-- * PASO 2: Inserción de datos *
-- **********************************

-- 1. Inserción de Clientes
INSERT INTO CLIENTES VALUES (1, '12345678X', 'Roberto Carlos', 'Av. Principal 10', '912344556', NULL);
INSERT INTO CLIENTES VALUES (2, '87654321Y', 'Lucia Mendez', 'Calle Mayor 5', '655443322', NULL);
INSERT INTO CLIENTES VALUES (3, '11223344Z', 'Marcos Polo', 'Paseo del Prado 2', '600000001', 1);
INSERT INTO CLIENTES VALUES (4, '55667788K', 'Sara Vegas', 'Calle Luna 9', '611223344', 2);

-- 2. Inserción de Servicios
INSERT INTO SERVICIOS VALUES (1, 'Vacuna Rabia', 45.00);
INSERT INTO SERVICIOS VALUES (2, 'Limpieza Dental', 120.50);
INSERT INTO SERVICIOS VALUES (3, 'Consulta General', 35.00);
INSERT INTO SERVICIOS VALUES (4, 'Desparasitacion', 15.00);
INSERT INTO SERVICIOS VALUES (5, 'Radiografia', 80.00);

-- 3. Inserción de Veterinarios
INSERT INTO VETERINARIOS VALUES (101, 'Dr. Aranda', 'Cirugia');
INSERT INTO VETERINARIOS VALUES (102, 'Dra. Beltran', 'Dermatologia');
INSERT INTO VETERINARIOS VALUES (103, 'Dr. Castillo', 'General');

-- 4. Inserción de Citas (Una sin veterinario asignado igual que en tu script)
INSERT INTO CITAS (codigo_cita, codigo_cliente, fecha) VALUES (1, 1, TO_DATE('2026-01-10', 'YYYY-MM-DD'));
INSERT INTO CITAS (codigo_cita, codigo_cliente, fecha) VALUES (2, 2, TO_DATE('2026-01-12', 'YYYY-MM-DD'));
INSERT INTO CITAS (codigo_cita, codigo_cliente, fecha) VALUES (3, 3, TO_DATE('2026-01-15', 'YYYY-MM-DD'));

-- 5. Asignación de Veterinarios
UPDATE CITAS SET codigo_veterinario = 101 WHERE codigo_cita = 1;
UPDATE CITAS SET codigo_veterinario = 102 WHERE codigo_cita = 2;
-- Cita 3 se queda NULL (sin veterinario)

-- 6. Inserción de Detalles (Servicios realizados por cita)
INSERT INTO DETALLE_CITA VALUES (1, 1, 1, 45.00);
INSERT INTO DETALLE_CITA VALUES (1, 4, 1, 15.00);
INSERT INTO DETALLE_CITA VALUES (2, 2, 1, 120.50);
INSERT INTO DETALLE_CITA VALUES (2, 3, 1, 35.00);
INSERT INTO DETALLE_CITA VALUES (3, 5, 2, 160.00);

COMMIT;