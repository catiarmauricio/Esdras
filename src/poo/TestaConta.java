package poo;

public class TestaConta {

	public static void main(String[] args) {

//		//Criação de objeto do tipo Conta
//		Conta c1 = new Conta();
//		c1.numero = 1000;
//		c1.limite = 500.0D;
//		c1.saldo= 2000.0D;
//
//		System.out.println(c1.numero);
//		System.out.println(c1.limite);
//		System.out.println(c1.saldo);
//
//		Conta c2 = new Conta(2000, 3000.0D);
//		System.out.println(c2.toString());
//
//		//deposito em conta
//
//		c1.deposita(2000.0D);
//
//		//		System.out.println("C1 - Saldo: "+c1.getSaldo()+"");
//		//
//		//		System.out.println("C2 - Saldo: "+c2.getSaldo());
//
//		c1.exibeSaldo();
//		c2.exibeSaldo();
//
//		c2.deposita(10000.0D);
//
//		System.out.println("C2 - Saldo: "+c2.getSaldo());
//
//		//sacqndo da conta
//
//		c2.saca(500.0D);
//		System.out.println("C2 - Saldo: "+c2.getSaldo());
//
//		c1.exibeSaldo();
//
//		
//		
//		c1.transfere(c2, 100);
//		
//		c1.exibeSaldo();
//		c2.exibeSaldo();
		
		Conta c1 = new Conta(1, 1000);
		Conta c2 = new Conta(2, 2000);
		
		c1.exibeSaldo();
		c2.exibeSaldo();
		
		c1.transfere(c2, 500);
		
		c1.exibeSaldo();
		c2.exibeSaldo();
		
		Conta.deposita(c1, 10000000);
		
		c1.exibeSaldo();
		c2.exibeSaldo();
	}

}
