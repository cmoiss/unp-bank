INSERT INTO tbl_Pessoa (nome, cpf, dataNascimento, idade, email, genero)
VALUES
    ('Gerente Aux', '12345678901', '1990-05-15', 31, 'gerente.auxiliar@email.com', 'Masculino'),
    ('Cliente Aux', '98765432109', '1985-08-20', 36, 'cliente.auxiliar@email.com', 'Feminino');
	
INSERT INTO tbl_ContaBancaria (idConta,saldoAtual)
VALUES
	(1,10000);
	
INSERT INTO tbl_Cliente (idCliente, statusCliente, cpf,login,senha, idConta)
VALUES
    (2, true, '03608200770','hobbit', '123456' ,1);

INSERT INTO tbl_Gerente (idGerente, cpf,login,senha)
VALUES
    (1, '37155273902','admin', 'adm123');

select*from tbl_Cliente;
select*from tbl_Gerente;
select*from tbl_ContaBancaria;
select * from tbl_pessoa;


-- Gerente
SELECT p.nome, p.cpf, p.dataNascimento, p.idade, p.email, p.genero, g.idGerente, g.login, g.senha
FROM tbl_Pessoa p
INNER JOIN tbl_Gerente g ON p.cpf = g.cpf;


-- Cliente
SELECT p.nome, P.cpf, p.dataNascimento, p.idade, p.email, p.genero, c.idCliente, c.statusCliente, c.idConta, cb.saldoAtual, c.login, c.senha
FROM tbl_Pessoa p
INNER JOIN tbl_Cliente c ON p.cpf = c.cpf
INNER JOIN tbl_ContaBancaria cb ON c.idConta = cb.idConta;


--===================================================================
--NÃO RODAR OS COMANDOS A BAIXO SÓ DEVE SER USADO COMO COMANDO NO JAVA 
select*from tbl_Gerente where idGerente=?;
select*from tbl_ContaBancaria where idConta=?;
select*from tbl_Cliente where cpf=?;
select*from tbl_Pessoa where cpf=?;
--===================================================================