INSERT INTO EMPLEADO (CVE_EMPLEADO, nombre, paterno, materno) values ('KRS22-89772', 'Ximena', 'Ballesteros', 'Roldan');
INSERT INTO EMPLEADO (CVE_EMPLEADO, nombre, paterno, materno) values ('JJQ00-32120', 'Augusto', 'Fonseca', 'Zarate');
INSERT INTO EMPLEADO (CVE_EMPLEADO, nombre, paterno, materno) values ('MM002-41290', 'Rodolfo', 'Huerta', 'Aquino');
INSERT INTO EMPLEADO (CVE_EMPLEADO, nombre, paterno, materno) values ('WH3I3-45882', 'Joaquin', 'Ramos', 'Pimentel');

INSERT INTO AREA (CVE_AREA, descripcion) values ('VNTS', 'Ventas');
INSERT INTO AREA (CVE_AREA, descripcion) values ('INVT', 'Inventario');
INSERT INTO AREA (CVE_AREA, descripcion) values ('ALMCN', 'Almacen');

INSERT INTO EMPLEADO_AREA (ID_EMPLEADO,CVE_AREA) VALUES (4,'VNTS');
INSERT INTO EMPLEADO_AREA (ID_EMPLEADO,CVE_AREA) VALUES (2,'INVT');
INSERT INTO EMPLEADO_AREA (ID_EMPLEADO,CVE_AREA) VALUES (1,'ALMCN');
