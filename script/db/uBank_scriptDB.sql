CREATE DATABASE IF NOT EXISTS db_uBank;
USE db_uBank;

CREATE TABLE IF NOT EXISTS tbl_Pessoa(
    nome VARCHAR(50),
	cpf VARCHAR(11),
	dataNascimento DATE,
	idade INT,
	email VARCHAR(40) NOT NULL,
	login VARCHAR(20) NOT NULL,
	senha VARCHAR(6) NOT NULL,
	idPessoa INT PRIMARY KEY NOT NULL AUTO_INCREMENT
);

CREATE TABLE IF NOT EXISTS tbl_ContaBancaria(
	idConta INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	saldoAtual DECIMAL(10,2)
);

CREATE TABLE IF NOT EXISTS tbl_Cliente(
	idCliente INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	statusCliente BOOLEAN NOT NULL,
	idPessoa INT NOT NULL,
	idConta INT NOT NULL,
	CONSTRAINT FK_C_Pessoa FOREIGN KEY (idPessoa) REFERENCES tbl_Pessoa (idPessoa),
	CONSTRAINT FK_Conta FOREIGN KEY (idConta) REFERENCES tbl_ContaBancaria(idConta)
);

CREATE TABLE IF NOT EXISTS tbl_Gerente(
	idGerente INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	idPessoa INT NOT NULL,
	CONSTRAINT FK_G_Pessoa FOREIGN KEY (idPessoa) REFERENCES tbl_Pessoa (idPessoa)
);

