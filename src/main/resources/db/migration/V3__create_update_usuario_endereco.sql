INSERT INTO usuario (cpf, data_cadastro, email, nome, sobrenome)
VALUES ('123', '2023-09-23 12:34:56', 'walter@walter.com.br', 'Walter', 'Paulo');

SELECT currval(pg_get_serial_sequence('usuario', 'id')) INTO id_usuario_1;

INSERT INTO endereco (bairro, complemento, numero, rua, usuario_id)
VALUES ('Paraiso', NULL, '3', 'rua a', id_usuario_1);

INSERT INTO usuario (cpf, data_cadastro, email, nome, sobrenome)
VALUES ('567', '2023-09-23 12:45:00', 'walter@walter.com.br', 'Walter', 'Paulo');

SELECT currval(pg_get_serial_sequence('usuario', 'id')) INTO id_usuario_2;

INSERT INTO endereco (bairro, complemento, numero, rua, usuario_id)
VALUES ('Paraiso', NULL, '3', 'rua a', id_usuario_2);
