package Classes;

public class ContaCorrente {
	
	public String numero;
	public String agencia;
	public double saldo;
	public boolean especial;
	public double valorEspecialUsado;
	public double limite;
	public double limiteEspecial;
	
	public boolean realizarSaque(double quantiaSacar) {
		
		// tem saldo na conta
		if(saldo >= quantiaSacar) {
			saldo-= quantiaSacar;
			return true;
		}else { // nao tem saldo na conta
			if(especial) { // verificar se o limite especial tem saldo
				limite = limiteEspecial+saldo;
				if(limite >= quantiaSacar ) {
					saldo-=quantiaSacar;
					return true;
				}else {
					return false;
				}
			}else {
				return false; // não é especial e nao tem saldo suficiente
			}
		}
		
	}
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo atual é :" + saldo);
	}
	
	public boolean verificarUsoChequeEspecial() {
		return saldo <0;
	}
}
