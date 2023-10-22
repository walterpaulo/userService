create schema if not exists usuario;

CREATE TABLE usuario (
    id bigserial NOT NULL,
    cpf varchar(255),
    data_cadastro timestamp(6),
    email varchar(255),
    nome varchar(255),
    sobrenome varchar(255),
    PRIMARY KEY (id)
);

ALTER TABLE endereco
ADD CONSTRAINT fk_usuario
FOREIGN KEY (usuario_id)
REFERENCES usuario (id);