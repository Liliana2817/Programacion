package Objetos7;

public class ContadorInstancias {
//
	private static int Contador = 0;
	
	
	public static int getContador() {
		return Contador;
	}


	public static void setContador(int contador) {
		Contador = contador;
	}

	public ContadorInstancias(){
		Contador++;	//incrementa el contador
	}
	public static int ObtenerNumIntancias() {
		return Contador;// Metodo  para obtener el numero al actual de instancias
	}
}
