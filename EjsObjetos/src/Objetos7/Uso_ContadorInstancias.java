package Objetos7;

public class Uso_ContadorInstancias {

	public static void main(String[] args) {
		//Instancias de ContadorInstancias.
		ContadorInstancias instancia1 = new ContadorInstancias();
		ContadorInstancias instancia2 = new ContadorInstancias();
		ContadorInstancias instancia3 = new ContadorInstancias();

		
		
		
		//Se Obtiene y muestra el numero de la instancia.
		int NumInstancias = ContadorInstancias.ObtenerNumIntancias();
		System.out.println("El número de instancias creadas son: " + NumInstancias);
	}

}
