
public class testeSacaValorNegativo {
public static void main(String[] args) {
	conta Conta = new conta();
	Conta.deposita(100);
	System.out.println(Conta.saca(101)) ;
	
	Conta.saca(101);
	System.out.println(Conta.getSaldo());
}
}
