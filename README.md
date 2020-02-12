# banco-rd-curso
Exercício de Programação Orientada a Objetos

## Exercício - Banco Santander

O Banco Santander solicita a modelagem de um novo sistema. Esse sistema será
usado para registrar as contas e os clientes do banco.

**Clientes:** os clientes serão identificados por um número de cliente, um
sobrenome, um número de RG e um CPF.

**Contas:** as contas do banco permitem fazer depósitos, sacar dinheiro e consultar
o saldo. Cada conta está associada a um cliente.

**Extensão:**

**Conta poupança:** além do saldo, as contas poupança têm uma taxa de juros.
Neste tipo de conta, é possível realizar três operações:

- Depositar dinheiro: o cliente pode depositar a quantia de dinheiro que
quiser.
- Sacar dinheiro: o cliente pode sacar dinheiro desde que não supere seu
saldo.
- Recolher juros: o cliente pode recolher os juros mensais aplicados pela
sua conta poupança.

**Conta corrente:** além do saldo, as contas correntes têm um limite autorizado de
cheque especial. Neste tipo de conta, é possível realizar três operações:

- Depositar dinheiro: o cliente pode depositar a quantia de dinheiro que
quiser.
- Depositar cheques: o cliente pode depositar cheques. Um cheque tem
um valor, um banco emissor e uma data de pagamento.
- Sacar dinheiro: o cliente pode sacar dinheiro e, caso não tenha saldo
suficiente, usar seu cheque especial.

Implemente as classes e aplique os conceitos de Herança, Classe Abstrata e
Orientação a Objetos em Java para a resolução do sistema.
