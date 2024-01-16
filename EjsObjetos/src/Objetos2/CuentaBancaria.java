package Objetos2;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	
public CuentaBancaria() {
	titular="Lili";
	saldo=5000;
}
	
	public String dime_titular(){
		return " El titular de la cuenta es  " + titular + " .";
	}
	public void establece_titular(){
		titular = "Lili";
	}
	
	public String dime_saldo(){
		return " El titular de la cuenta es  " + saldo + " .";
		
	}
	public void establece_saldo(){
		if (saldo >= 0) {
			saldo = saldo;
 
		} else {
			System.out.println("El saldo no puede ser negativo.");
		}
	}
}

