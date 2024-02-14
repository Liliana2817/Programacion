package Abstracto;

public class Circulo extends FiguraGeometrica{
	//Variable
			private double Radio;

			//Constructor
			public Circulo(double Radio) {
				this.Radio = Radio;
			}
			//Implementar el método para calcular el área del círculo
			@Override
			double calcularArea() {
				return Radio * Radio * 3.14159;
			}
			//Implementar el método para obtener el nombre de la figura
			@Override
		    String obtenerNombre() {
		        return "Círculo";
			}
}