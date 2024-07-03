INSERT INTO tbl_Pessoa (nome, cpf, dataNascimento, email, genero)
VALUES
    ('Caio', '22672963657', '1990-05-15', 'gerente.auxiliar@email.com', 'M'),
    ('Pedro', '23314827563', '1985-08-20', 'cliente.auxiliar@email.com', 'M');
	
INSERT INTO tbl_ContaBancaria (idConta,saldoAtual)
VALUES
	(1,10000);
	
INSERT INTO tbl_Cliente (cpf,login,senha, idConta)
VALUES
    ('23314827563','hobbit', '123456' ,1);

INSERT INTO tbl_Gerente (cpf,login,senha)
VALUES
    ('22672963657','admin', 'adm123');

select * from tbl_Cliente;
select * from tbl_Gerente;
select * from tbl_ContaBancaria;
select * from tbl_Pessoa;

-- Gerente
SELECT p.nome, p.cpf, p.dataNascimento, p.email, p.genero, g.idGerente, g.login, g.senha
FROM tbl_Pessoa as p
INNER JOIN tbl_Gerente as g 
ON p.cpf = g.cpf;

-- Cliente
SELECT p.nome, p.cpf, p.dataNascimento, p.email, p.genero, c.idCliente, c.statusCliente, c.idConta, cb.saldoAtual, c.login, c.senha
FROM tbl_Pessoa as p
INNER JOIN tbl_Cliente as c 
ON p.cpf = c.cpf
INNER JOIN tbl_ContaBancaria as cb 
ON c.idConta = cb.idConta;