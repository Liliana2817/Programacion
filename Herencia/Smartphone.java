package Herencia;

//hereda del DispositivoElectronico
public class Smartphone extends DispositivoElectronico{
	//constructor
		public Smartphone(String Fabricante, int añoDeFabricacion) {
	        super(Fabricante, añoDeFabricacion);
	    }

		//métodos para implementar la clase Telefono
		public void llamar(String Numero) {
		    System.out.println("Llamando al número : " + Numero);
		}
		
		public void recibirLlamadas() {
		    System.out.println("Recibiendo llamadas...");
		}
		
		//método de la clase Smartphone
		public void instalarAplicacion(String Aplicacion) {
		    System.out.println("Instalando la aplicación : " + Aplicacion);
		}

}
