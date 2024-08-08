drop database if exists db_ubank;

CREATE DATABASE IF NOT EXISTS db_ubank
default charset utf8mb4
default	collate utf8mb4_unicode_ci;
USE db_ubank;

CREATE TABLE IF NOT EXISTS tbl_Pessoa(
    nome VARCHAR(50),
	cpf VARCHAR(11) NOT NULL ,
	dataNascimento DATE,
	email VARCHAR(40) NOT NULL,
    genero enum('M', 'F', 'O') NOT NULL,
    primary key(cpf)
) charset = utf8mb4
collate = utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS tbl_ContaBancaria(
	idConta int NOT NULL auto_increment,
	saldoAtual DECIMAL(10,2),
    primary key(idConta)
);

CREATE TABLE IF NOT EXISTS tbl_Cliente(
	idCliente int NOT NULL auto_increment,
	statusCliente BOOLEAN NOT NULL default true,
	cpf VARCHAR(11) NOT NULL,
	login VARCHAR(20) NOT NULL,
	senha VARCHAR(6) NOT NULL,
	idConta int,
    primary key(idCliente),
	FOREIGN KEY (cpf) REFERENCES tbl_Pessoa (cpf),
	FOREIGN KEY (idConta) REFERENCES tbl_ContaBancaria(idConta)
) charset = utf8mb4
collate = utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS tbl_Gerente(
	idGerente int NOT NULL auto_increment,
	cpf VARCHAR(11) NOT NULL,
	login VARCHAR(20) NOT NULL,
	senha VARCHAR(6) NOT NULL,
    primary key(idGerente),
	FOREIGN KEY (cpf) REFERENCES tbl_Pessoa (cpf)
) charset = utf8mb4
collate = utf8mb4_unicode_ci;

