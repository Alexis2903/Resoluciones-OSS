DELIMITER //

CREATE PROCEDURE sp_CrearCuenta(
    IN p_CEDULA_PERSONA varchar(45),
    IN p_ID_ACTOR varchar(45),
    IN p_NOMBRES varchar(45),
    IN p_APELLIDOS varchar(45),
    IN p_TELEFONO varchar(10),
    IN p_CORREO varchar(45),
    IN p_USUARIO varchar(45),
    IN p_CONTRASENA varchar(45),
    IN p_CARRERA varchar(45)
)
BEGIN
    DECLARE exit handler for sqlexception
    BEGIN
        -- Manejar excepciones si es necesario
        ROLLBACK;
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Error al crear la cuenta';
    END;

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
        p_ID_ACTOR,
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
