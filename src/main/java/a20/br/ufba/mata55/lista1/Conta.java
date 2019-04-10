package a20.br.ufba.mata55.lista1;

public class Conta {
	double saldo;
	String codigo;
	
	public Conta(String codigo, double saldo) {
		this.saldo = saldo;
		this.codigo = codigo;
	}
	
	public Conta(String codigo) {
		this.saldo = 0;
		this.codigo = codigo;
	}
	
	boolean retira(double quantia) {
		if (this.saldo>= quantia) {
			this.saldo = this.saldo - quantia;
			return true;
		}
		return false;
	}
	
	void deposita (double quantia){
		this.saldo = this.saldo + quantia;
		
	}
	
	boolean transfere(double quantia, Conta beneficiario) {
		if (this.saldo >= quantia && beneficiario != null) {
			this.saldo = this.saldo - quantia;
			beneficiario.saldo = beneficiario.saldo + quantia;
			return true;
		} 
		return false;
	}
	
}
