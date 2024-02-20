package Herencia;

public class Uso_DispositivoElectronico {

	public static void main(String[] args) {
Smartphone Movil = new Smartphone("Samsung", 2023);
		
		System.out.println("Fabricante: " + Movil.getFabricante());
		System.out.println("Año de fabricación: " + Movil.getAñoDeFabricacion());
		System.out.println();
		
	    Movil.llamar("679245163");
	    Movil.recibirLlamadas();
	    Movil.instalarAplicacion("WhatsApp");

	}

}
