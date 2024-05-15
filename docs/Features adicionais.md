# FEATURES ADICIONAIS DO SISTEMA
## Manipulação da interface
### Alternar entre modos claro/escuro

## Classe "Cartao"
Classe Cartao com função débito/crédito
-nomeTitular
-limiteCartao
+gerarCartao()

### Gerar cartão de débito/crédito válidos aos clientes
Método "gerarCartao" 

Esse método deve ser chamado automaticamente após o cliente criar a conta

Após o cliente já ter gerado solicitar um novo cartão, limitado a 3 cartões 

### Gerar cartão virtual
Após aberta a conta, o cliente pode solicitar até 10 cartões virtuais para compras on-line, assinaturas, etc...

-nomeCartaoVirtual
+autoDestruirCartao

O cartão virtual também pode ser auto-destruído nas seguintes situações (escolha do cliente)
- Após a primeira compras
- Após 24 horas
