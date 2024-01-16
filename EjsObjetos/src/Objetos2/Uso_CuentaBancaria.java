package Objetos2;

public class Uso_CuentaBancaria {

	public static void main(String[] args) {
		CuentaBancaria cuentaLili = new  CuentaBancaria();
		cuentaLili.establece_titular();
		System.out.println(cuentaLili.dime_titular());
		
		cuentaLili.establece_saldo();
		System.out.println(cuentaLili.dime_saldo());
	}

}
