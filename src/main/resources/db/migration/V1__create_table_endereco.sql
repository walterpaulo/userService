create schema if not exists endereco;

CREATE TABLE endereco (
    id bigserial NOT NULL,
    bairro varchar(255),
    complemento varchar(255),
    numero varchar(255),
    rua varchar(255),
    usuario_id bigint,
    PRIMARY KEY (id)
);