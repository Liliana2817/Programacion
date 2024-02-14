package Abstracto;

public class Uso_FiguraGeometrica {

	public static void main(String[] args) {
		 //array
		FiguraGeometrica[] Figuras = new FiguraGeometrica[2];
		   
		   Figuras[0] = new Circulo(6.0);
	       Figuras[1] = new Rectangulo(4.0, 6.0);
	       
	       for (FiguraGeometrica FiguraGeometrica : Figuras) {
	            System.out.println("El Área del " + FiguraGeometrica.obtenerNombre() + " es : " + FiguraGeometrica.calcularArea());
	        }

	}

}
