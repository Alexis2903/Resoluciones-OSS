DELIMITER //

CREATE PROCEDURE sp_CrearCuentaUsuario(
    IN p_CEDULA_PERSONA VARCHAR(45),
    IN p_NOMBRE_ACTOR VARCHAR(45),  
    IN p_NOMBRES VARCHAR(45),
    IN p_APELLIDOS VARCHAR(45),
    IN p_TELEFONO VARCHAR(10),
    IN p_CORREO VARCHAR(45),
    IN p_USUARIO VARCHAR(45),
    IN p_CONTRASENA VARCHAR(45),
    IN p_CARRERA VARCHAR(45)
)
BEGIN
    DECLARE v_ID_ACTOR VARCHAR(45);

    DECLARE exit handler for sqlexception
    BEGIN
        ROLLBACK;
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Error al crear la cuenta';
    END;

    -- Obtener el ID del actor usando el tipo
    SELECT ID_ACTOR INTO v_ID_ACTOR FROM ACTOR WHERE TIPO = p_NOMBRE_ACTOR;

    START TRANSACTION;

    INSERT INTO PERSONA (
        CEDULA_PERSONA,
        ID_ACTOR,
        NOMBRES,
        APELLIDOS,
        TELEFONO,
        CORREO,
        USUARIO,
        CONTRASENA,
        CARRERA
    ) VALUES (
        p_CEDULA_PERSONA,
        v_ID_ACTOR,  
        p_NOMBRES,
        p_APELLIDOS,
        p_TELEFONO,
        p_CORREO,
        p_USUARIO,
        p_CONTRASENA,
        p_CARRERA
    );

    COMMIT;
END //

DELIMITER ;
-- Call sp_CrearCuentaUsuario('100', 'Gestor', 'alexis', 'xd', '0986432121', 'nose', 'alex', '123', 'dds');
 Call sp_CrearCuentaUsuario('4', 'Miembros OSS', 'Sara', 'Gómez', '0997693017', 'sara@', 'Miembor Srn', '123', 'Biologia');

DELIMITER //

CREATE PROCEDURE sp_RecuperarContraseña(
    IN p_cedula VARCHAR(45),
    IN p_correo VARCHAR(45),
    IN p_nuevaContraseña VARCHAR(45),
    IN p_confirmarContraseña VARCHAR(45)
)
BEGIN
    DECLARE usuario_existente INT;

    -- Verificar si el usuario existe con la cédula y el correo proporcionados
    SELECT COUNT(*) INTO usuario_existente
    FROM PERSONA
    WHERE CEDULA_PERSONA = p_cedula AND CORREO = p_correo;

    -- Si el usuario existe, actualizar la contraseña
    IF usuario_existente > 0 AND p_nuevaContraseña = p_confirmarContraseña THEN
        UPDATE PERSONA
        SET CONTRASENA = p_nuevaContraseña
        WHERE CEDULA_PERSONA = p_cedula AND CORREO = p_correo;

        SELECT 1 AS resultado; -- Éxito
    ELSE
        SELECT 0 AS resultado; -- Fallo (usuario no existe o contraseñas no coinciden)
    END IF;
END //

DELIMITER ;


DELIMITER //

CREATE PROCEDURE CrearPersona(
    IN p_cedula VARCHAR(45),
    IN p_nombres VARCHAR(45),
    IN p_apellidos VARCHAR(45),
    IN p_telefono VARCHAR(10),
    IN p_correo VARCHAR(45)
)
BEGIN
    INSERT INTO PERSONA (CEDULA_PERSONA, NOMBRES, APELLIDOS, TELEFONO, CORREO)
    VALUES (p_cedula, p_nombres, p_apellidos, p_telefono, p_correo);
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE sp_listaPersonas()
BEGIN
    SELECT CEDULA_PERSONA, NOMBRES, APELLIDOS, TELEFONO, CORREO
    FROM PERSONA;
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE sp_BuscarPersonaPorCedula(
    IN p_cedula VARCHAR(45)
)
BEGIN
    SELECT CEDULA_PERSONA,NOMBRES, APELLIDOS, TELEFONO, CORREO
    FROM PERSONA
    WHERE CEDULA_PERSONA = p_cedula;
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE sp_ActualizarPersona(
    IN p_cedula VARCHAR(45),
    IN p_nuevosNombres VARCHAR(45),
    IN p_nuevosApellidos VARCHAR(45),
    IN p_nuevoTelefono VARCHAR(10),
    IN p_nuevoCorreo VARCHAR(45)
)
BEGIN
    START TRANSACTION;

    UPDATE PERSONA SET
        
        NOMBRES = IFNULL(p_nuevosNombres, NOMBRES),
        APELLIDOS = IFNULL(p_nuevosApellidos, APELLIDOS),
        TELEFONO = IFNULL(p_nuevoTelefono, TELEFONO),
        CORREO = IFNULL(p_nuevoCorreo, CORREO)
    WHERE CEDULA_PERSONA = p_cedula;

    COMMIT;
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE sp_EliminarPersona(
    IN p_cedula VARCHAR(45)
)
BEGIN
    START TRANSACTION;

    DELETE FROM PERSONA WHERE CEDULA_PERSONA = p_cedula;

    COMMIT;
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE sp_ExisteCedula(
    IN p_cedula VARCHAR(45),
    OUT p_existe INT
)
BEGIN
    -- Verificar si la cédula existe
    SELECT COUNT(*) INTO p_existe
    FROM PERSONA
    WHERE CEDULA_PERSONA = p_cedula;
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE sp_insertar_pedido(
    IN p_nro_pedido VARCHAR(50),
    IN p_cedula_persona INT,
    IN p_asunto VARCHAR(45),
    IN p_fecha_ingreso_oficio DATE,
    IN p_archivo_pdf VARCHAR(100)
)
BEGIN
    -- Verificar si la persona existe antes de insertar el pedido
    DECLARE persona_existente INT;
    SELECT COUNT(*) INTO persona_existente
    FROM PERSONA
    WHERE CEDULA_PERSONA = p_cedula_persona;

    IF persona_existente > 0 THEN
        -- Insertar el nuevo pedido
        INSERT INTO PEDIDO (NRO_PEDIDO, CEDULA_PERSONA, ASUNTO, FECHAINGRESO_OFICIO, ARCHIVOPDF)
        VALUES (p_nro_pedido, p_cedula_persona, p_asunto, p_fecha_ingreso_oficio, p_archivo_pdf);

        SELECT 'Pedido insertado correctamente' AS Resultado;
    ELSE
        SELECT 'La persona no existe. No se pudo insertar el pedido.' AS Resultado;
    END IF;
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE sp_obtener_datos_pedidos()
BEGIN
    -- Seleccionar datos de los pedidos
    SELECT NRO_PEDIDO, CEDULA_PERSONA, ASUNTO, FECHAINGRESO_OFICIO, ARCHIVOPDF
    FROM PEDIDO;
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE sp_BuscarPedidoPorNumero(
    IN p_numero_pedido VARCHAR(50)
)
BEGIN
    -- Seleccionar datos del pedido por número
    SELECT NRO_PEDIDO, CEDULA_PERSONA, ASUNTO, FECHAINGRESO_OFICIO, ARCHIVOPDF
    FROM PEDIDO
    WHERE NRO_PEDIDO = p_numero_pedido;
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE sp_EliminarPedido(
    IN p_numero_pedido VARCHAR(50)
)
BEGIN
    -- Eliminar el pedido de la base de datos
    START TRANSACTION;
    DELETE FROM PEDIDO WHERE NRO_PEDIDO = p_numero_pedido;
    COMMIT;
    
    SELECT 'Pedido eliminado correctamente' AS Resultado;
END //

DELIMITER ;

