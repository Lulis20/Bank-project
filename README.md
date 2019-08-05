# Bank-project


Crie um programa para um banco que tem como objetivo gerencia-lo. 

O banco possui 2 tipos de Conta:
[] a Conta Corrente 
[] a Conta Poupança. 

Ao realizar qualquer saque através da conta corrente ou poupança é cobrada 
uma taxa em cima do valor sacado:

[] 1% para a conta poupança 
[] 0,5% para a conta corrente

Ao realizar o saque é importante:
[] verificar se a conta possui saldo suficiente.

Verificou-se que nesse banco existem 4 tipos de pessoas:

[] o Cliente
[] o Funcionário - cp 0,7% e cc 0,4%
[] o Gerente - cp 0,5% e cc 0,2%
[] o Gerente Geral - sem desconto
 
	* O cliente paga a taxa total dos saques.
	* O Funcionário tem um desconto de 0,3% para saques na conta poupança e 0,1% para saques na conta corrente
	* o Gerente possui um desconto de 0,5% para saques na conta poupança e 0,3% para saques na conta corrente
	* o Gerente Geral possui desconto total então o mesmo não precisa pagar nenhuma taxa ao sacar.

O desconto é aplicado em cima do valor definido nas contas.


Você está livre para definir as características de cada cargo.

lembrando que cada pessoa possui :

[] um identificador (O CPF pode ser usado como identificador)
[] nome 
[] aniversário



Utilizando os seus conhecimentos em Java 8 elabore um programa legível (Em inglês se possível) usando os padrões
 de desenvolvimento que você conhece. É necessário mostrar a execução do código, apresentando o que achar necessário 
para comprovar que o mesmo funciona com as regras apresentadas.
