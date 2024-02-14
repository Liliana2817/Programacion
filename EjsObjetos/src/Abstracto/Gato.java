package Abstracto;

public class Gato extends Animal{
	@Override
	void HaceSonido() {
		System.out.println("El gato del vecino maulla mucho por las noches.");
	}
	@Override
	void Moverse(){
		System.out.println("El gato camina por toda la casa.");
	}
}
