DROP DATABASE IF EXISTS ventas;
CREATE DATABASE ventas;
USE ventas;

-- Clientes: ciudades, barrios
-- Articulos: clasificaciones, stock
-- Ventas

CREATE TABLE clasificacion (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR (50) UNIQUE NOT NULL
);

CREATE TABLE articulo (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50) UNIQUE NOT NULL,
  precio INT NOT NULL,
  stock INT NOT NULL,
  clasificacion_id int not null,
  FOREIGN KEY (clasificacion_id) REFERENCES clasificacion (id)
);

CREATE TABLE ciudad (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR (50) UNIQUE NOT NULL
);

CREATE TABLE barrio (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR (50) UNIQUE NOT NULL,
  ciudad_id INT NOT NULL,
  FOREIGN KEY (ciudad_id) REFERENCES ciudad(id)
);

CREATE TABLE cliente (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) UNIQUE NOT NULL,
  ruc varchar(100) UNIQUE,
  ciudad_id INT NOT NULL,
  barrio_id INT NOT NULL,
  FOREIGN KEY (ciudad_id) REFERENCES ciudad(id),
  FOREIGN KEY (barrio_id) REFERENCES barrio(id)
);

CREATE TABLE venta (
  id INT PRIMARY KEY AUTO_INCREMENT,
  cliente_id INT NOT NULL,
  fecha DATE NOT NULL,
  FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);

CREATE TABLE venta_articulo (
  venta_id INT NOT NULL,
  articulo_id INT NOT NULL,
  cantidad INT NOT NULL,
  precio INT NOT NULL,
  PRIMARY KEY (venta_id, articulo_id),
  FOREIGN KEY (venta_id) REFERENCES venta(id),
  FOREIGN KEY (articulo_id) REFERENCES articulo(id),
  CHECK (cantidad > 0 AND precio > 0)
);
