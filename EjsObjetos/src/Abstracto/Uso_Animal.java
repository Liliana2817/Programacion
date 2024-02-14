package Abstracto;

public class Uso_Animal {

	public static void main(String[] args) {
		//Se crea un perro
		Animal Perro = new Perro();
		Perro.HaceSonido();
		Perro.Moverse();
		
		//Se crea el gato
		Animal Gato = new Gato();
		Gato.HaceSonido();
		Gato.Moverse();

	}

}
