package Objetos2;

public class CuentaBancaria {
	// Declarar las variables
	private String titular;
	private double saldo;
	
public CuentaBancaria() {
	// construtor: Se define un constructor sin parámetros que establece un titular predeterminado
	titular="Lili";
	saldo=5000;
}
	
	public String dime_titular(){//GETTER
		//metodo:  Devuelve una cadena que contiene información sobre el titular de la cuenta.
		return " El titular de la cuenta es  " + titular + " .";
	}
	public void establece_titular(){//SETTER
		// metodo: Establece el titular de la cuenta
		titular = "Lili";
	}
	
	public String dime_saldo(){
		return " El titular de la cuenta es  " + saldo + " .";
		
	}
	public void establece_saldo(){
		/*Intenta establecer el saldo de la cuenta. Verifica si el saldo es no negativo antes de establecerlo. Si el saldo proporcionado es negativo, imprime un mensaje de advertencia.*/
		if (saldo >= 0) {
			saldo = saldo;
 
		} else {
			System.out.println("El saldo no puede ser negativo.");
		}
	}
}

