package Aplicacao;

import Classes.ContaCorrente;

public class AplicContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero ="123456";
		conta.agencia = "5623";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = 10;
		
		System.out.println("Saldo da conta "+ conta.numero + " = " + conta.saldo);
		
		boolean saqueEfetuado = conta.realizarSaque(30);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}
		else {
			System.out.println("Saque não realizado. Saldo insuficiente");
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}
		else {
			System.out.println("Saque não realizado. Saldo insuficiente");
		}
		System.out.println("Deposito de 600 reais");
		conta.depositar(600);
		conta.consultarSaldo();
		
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}
		else {
			System.out.println("Não está usando cheque especial");
		}
		
	}
	

}
