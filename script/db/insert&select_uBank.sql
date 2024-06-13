
INSERT INTO tbl_Pessoa (nome, cpf, dataNascimento, idade, email, login, senha)
VALUES
    ('Gerente Aux', '12345678901', '1990-05-15', 31, 'gerente.auxiliar@email.com', 'admin', 'adm123'),
    ('Cliente Aux', '98765432109', '1985-08-20', 36, 'cliente.auxiliar@email.com', 'hobbit', '123456');
	
INSERT INTO tbl_ContaBancaria (idConta,saldoAtual)
VALUES
	(1,10000);
	
INSERT INTO tbl_Cliente (idCliente, statusCliente, cpf, idConta)
VALUES
    (2, true, '98765432109', 2);

INSERT INTO tbl_Gerente (idGerente, cpf)
VALUES
    (1, '12345678901');

select*from tbl_Cliente;
select*from tbl_Gerente;
select*from tbl_ContaBancaria;
select*from tbl_Pessoa;

--===================================================================
--NÃO RODAR OS COMANDOS A BAIXO SÓ DEVE SER USADO COMO COMANDO NO JAVA 
select*from tbl_Gerente where idGerente=?;
select*from tbl_ContaBancaria where idConta=?;
select*from tbl_Cliente where cpf=?;
select*from tbl_Pessoa where cpf=?;
--===================================================================