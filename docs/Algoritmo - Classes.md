# Classes: 
## ContaBancaria
-numeroConta
-saldoAtual
+verificarDados(): verifica o saldo disponível
+ContaBancaria(saldoInicial)
+informarNumeroConta()
+informarSaldoAtual

+verificarSaldo():
- retornar saldoAtual;

+verificarSaque(double valorSolicitadoSaque): 
> verifica se há `saldo`
- verificarSaldo();
- Se saldoAtual for positivo:
	- retorne True
	> disponível para saque

- Se saldoAtual for negativo:
	- retorne False

+efetuarSaque(double valorSolicitadoSaque): 
- se `verificarSaque` for `True`: 
	> subtrair ao `saldo`
	- saldoAtual -= valorSolicitadoSaque




+somarSaldoAtual(double valorDepositado)
`saldoAtual` += valorDepositado;

+getSomarSaldoAtual(double valorDepositado):
- somarSaldoAtual(valorDepositado);

+getVerificarSaque(double valorSolicitadoSaque)
- verificarSaque(valorSolicitadoSaque);

+calcularIdade()
> subtrai data atual do mundo (não a da máquina)

+validaeIdade()

## Cliente
- idCliente
- nome
- CPF
- dataNascimento
- idade
- email
- idContaCorrente
- status 
> (ativo/inativo)

+efetuarDeposito(): 
- lê um valor (double) digitado pelo `Cliente` 
- armazena na variável "valorDepositado"
- verifica se é `valorDepositado` é positivo
- Se sim:
	- getSomarSaldoAtual(valorDepositado)

+solicitarSaque(): 
- lê um valor (double) digitado pelo `Cliente`
- armazena na variável "valorSolicitadoSaque"
- verifica se é `valorSolicitadoSaque` positivo
- Se sim:
	- getVerificarSaque(valorSolicitadoSaque)





