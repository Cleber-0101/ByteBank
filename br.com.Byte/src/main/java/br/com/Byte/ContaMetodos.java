package br.com.Byte;

public class ContaMetodos {
 public static void main(String[] args) {
	 Conta contaDoCleber = new Conta();
	 contaDoCleber.saldo = 500 ;
	 contaDoCleber.deposita(100);
	 System.out.println(contaDoCleber.saldo);
	 
	 boolean saqueRealizadoComSucesso = contaDoCleber.saca(200);
	 System.out.println(contaDoCleber.saldo);
	 System.out.println(saqueRealizadoComSucesso);
 }
}
