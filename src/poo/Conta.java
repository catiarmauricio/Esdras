package poo;

public class Conta {
	int numero;
	double limite;
	double saldo;

	//Metodo construtor padrão
	public Conta() {

	}

	//Metodo construtor alternativo
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.limite = 300.0D;
		this.saldo = saldo;

	}

	public double getSaldo() {
		return saldo + limite;
	}

	// metodo para nao precisar ficar repetindo sysout
	public void exibeSaldo() {
		System.out.println("Conta: "+numero+" - Saldo: "+String.format("R$ %.2f", getSaldo()));
	}

	public void deposita(double valor) {
		saldo += valor;
	}
	
	public static void deposita(Conta conta ,double valor) {
		conta.saldo += valor;
	}
	
	

//	public void saca(double valor) {
//		if (valor <=0 ) {
//			System.out.println("Operação cancelada.\nValor indisponível...");
//		}else {
//			if (valor < getSaldo()) {
//				saldo -= valor;
//			}else {
//				System.out.println("Operação invalida.\nSaldo indisponível...");
//			}
//		}
//
//	}
	
	public void saca (double valor) {
		if (validaValor(valor)) {
			this.saldo-= valor;
			
		}
	}

	public boolean validaValor(double valor) {
		if (valor<= 0) {
			System.out.println("Operação invalida.\\nValor invalido..");
			return false;
		
			
		}else if (valor > getSaldo()) {
			System.out.println("Operação invalida.\nSaldo indisponível..");
			return false;
			
		}else {
			return true;
		}
	}
	
	public void transfere (Conta conta, double valor) {
		if (validaValor(valor)) {
			saca(valor);
			conta.saldo += valor;
		}
	}

	public String toString() {
		return String.format("[numero = %d], [limite = %.2f], [saldo = %.2f]\n\n", numero, limite, saldo);
	}


}
