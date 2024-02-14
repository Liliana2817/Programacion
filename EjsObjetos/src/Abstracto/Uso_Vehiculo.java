package Abstracto;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		//Se crea un automovil
		Vehiculo Automovil = new Automovil();
		Automovil.Acelerar();
		Automovil.Frenar();
		
		//Se crea una Motocicleta
		Vehiculo Motocicleta = new Motocicleta();
		Motocicleta.Acelerar();
		Motocicleta.Frenar();

	}

}
