package br.com.Byte;

public class PrimeiraConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 250;
		primeiraConta.saldo += 100 ;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 500;
		System.out.println(segundaConta.saldo);
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
	}	
}
