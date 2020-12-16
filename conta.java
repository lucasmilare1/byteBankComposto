

public class conta{
	double saldo;
	int agencia;
	int numero;
	cliente titular;
	
	
	void deposita(double valor) {
		
		this.saldo +=  valor;
	}
	public boolean saca (double valor) {
	if(this.saldo >= valor) {
		this.saldo -= valor;
		return true;
	} else {
		return false;
	}
	
	}
	
	public boolean transfere(double valor, conta destino) {
	  if(this.saldo >= valor) {
		 this.saldo-= valor;
		 destino.deposita(valor);
	 } 
		 return false;
	 }
	public double getSaldo() {
		return this.saldo;
	}
	 }


