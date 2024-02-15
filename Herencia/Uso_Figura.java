package Herencia;

public class Uso_Figura {

	public static void main(String[] args) {
		
		   //array
		   Figura[] Figuras = new Figura[2];
		   
		   Figuras[0] = new Circulo(6.0);
	       Figuras[1] = new Rectangulo(4.0, 6.0);
	       
	       for (Figura Figura : Figuras) {
	            System.out.println("El Área del " + Figura.obtenerNombre() + " es : " + Figura.calcularArea());
	        }
	}

}
