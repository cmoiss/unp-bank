

```markdown
# Classes

## PESSOA:
- nome
- CPF
- dataNascimento
- idade
- email
+ verificarIdade()
+ verificarCPF()

### GERENTE: HerdaDePessoa
- idGerente
+ cadastrarCliente()
+ cadastrarGerente()
+ checarListaDeContas()
+ checarDadosDaConta()
+ verListaDeClientes()
+ excluirClientes()
+ pesquisarCliente()

#### CLIENTE: HerdaDePessoa
- idConta
- idCliente
- status
+ efetuarDeposito()
+ solicitarSaque()
+ checarDadosConta()

#### CONTA BANCÁRIA:
- idConta
- saldoAtual
+ verificarSaldo()
+ verificarSaque() 
+ verificarDeposito()
+ tranferirDinheiro()
```


