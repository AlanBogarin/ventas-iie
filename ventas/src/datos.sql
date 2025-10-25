USE ventas;

INSERT INTO clasificacion (nombre)
VALUES
("Bebida"),
("Lacteo"),
("Panificado"),
("Dulce");

INSERT INTO articulo (nombre, precio, stock, clasificacion_id)
VALUES
("Galletita Oreo", 5000, 50, 4),
("Galletitas pepas", 5000, 10, 4),
("Leche Trebol 1L", 8000, 25, 2),
("Leche Lactolanda 1L", 6000, 15, 2),
("Gaseosa Coca Cola 500L", 6000, 10, 1),
("Gaseosa Pepsi 2L", 12000, 40, 1),
("Felipito", 8000, 20, 3),
("Blandita", 8000, 20, 3);

INSERT INTO ciudad (nombre)
VALUES
("Concepcion"),
("Asuncion");

INSERT INTO barrio (nombre, ciudad_id)
VALUES
("Belen", 1),
("Concepcion", 1),
("Horqueta", 1),
("Santa Maria", 2),
("Santa Rosa", 2),
("Villa Mora", 2);

INSERT INTO cliente (nombre, ruc, ciudad_id, barrio_id)
VALUES
("Anonimo", "0000000", 1, 1);

-- INSERT INTO venta (cliente_id, fecha)
-- VALUES
-- ();

-- INSERT INTO venta_articulo (venta_id, articulo_id, cantidad, precio)
-- VALUES
-- ();
