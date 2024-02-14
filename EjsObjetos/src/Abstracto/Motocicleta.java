package Abstracto;

public class Motocicleta extends Vehiculo{
	@Override
	void Acelerar() {
		System.out.println("La Motocicleta esta acelerando");
	}
	@Override
	void Frenar() {
		System.out.println("La Motocicleta esta frenando");
	}
}
