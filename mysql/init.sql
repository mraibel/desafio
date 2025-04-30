CREATE TABLE IF NOT EXISTS estudiantes (
    rut INT PRIMARY KEY,
    nombre VARCHAR(100),
    apellido VARCHAR(100),
    edad INT,
    curso VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS evaluaciones (
    rut_estudiante INT PRIMARY KEY,
    semestre INT,
    asignatura VARCHAR(100),
    nota INT
);

INSERT INTO estudiantes (rut, nombre, apellido, edad, curso) VALUES
(12345678, 'Juan', 'Pérez', 20, 'Ingeniería'),
(87654321, 'Ana', 'Gómez', 22, 'Medicina'),
(11223344, 'Luis', 'Rojas', 21, 'Derecho');

INSERT INTO evaluaciones (rut_estudiante, semestre, asignatura, nota) VALUES
(12345678, 1, 'Matemáticas', 6.5),
(87654321, 2, 'Anatomía', 6.0),
(11223344, 1, 'Derecho Civil', 5.9);
