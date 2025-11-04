USE ventas;

INSERT INTO clasificacion (nombre)
VALUES
("BEBIDA"),
("LACTEO"),
("PANIFICADO"),
("DULCE");

INSERT INTO articulo (nombre, precio, stock, clasificacion_id)
VALUES
("GALLETITA OREO", 5000, 50, 4),
("GALLETITA PEPAS", 5000, 10, 4),
("LECHE TREBOL 1L", 8000, 25, 2),
("LECHE LACTOLANDA 1L", 6000, 15, 2),
("GASEOSA COCA COLA 500L", 6000, 10, 1),
("GASEOSA PEPSI 2L", 12000, 40, 1),
("FELIPITO", 8000, 20, 3),
("BLANDITA", 8000, 20, 3);

INSERT INTO ciudad (nombre)
VALUES
("CONCEPCION"),
("ASUNCION");

INSERT INTO barrio (nombre, ciudad_id)
VALUES
("BELEN", 1),
("CONCEPCION", 1),
("HORQUETA", 1),
("SANTA MARIA", 2),
("SANTA ROSA", 2),
("VILLA MORA", 2);

INSERT INTO cliente (nombre, apellido, ruc, ciudad_id, barrio_id)
VALUES
("CLIENTE", "ANONIMO", "0000000", 1, 1),
("CYNTHIA", "CHAMORRO","0000001", 1, 1),
("HUGO", "GARCIA","00000002", 1, 1);

-- INSERT INTO venta (cliente_id, fecha, total, anulado)
-- VALUES
-- ();

-- INSERT INTO venta_articulo (venta_id, articulo_id, cantidad, precio)
-- VALUES
-- ();
