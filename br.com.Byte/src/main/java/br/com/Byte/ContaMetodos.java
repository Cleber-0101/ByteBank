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
	 
	 Conta contaMarcelo = new Conta();
	 contaMarcelo.deposita(1000);
	 
	 if(contaMarcelo.transfere(300, contaDoCleber)) {
		 System.out.println("tranferencia realizada com sucesso");
	 } else {
		 System.out.println("faltou dinheiro");
	 }
	 
	 
	 contaDoCleber.titular = "Cleber Batista";
	 System.out.println(contaDoCleber.titular);
 }
}
