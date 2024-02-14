package Abstracto;

public class Rectangulo extends FiguraGeometrica{
	//variables
	private double Base;
    private double Altura;
    
    //constructor
	public Rectangulo(double Base, double Altura) {
		this.Base = Base;
		this.Altura = Altura;
	}
	//implementar el método para calcular el área del rectángulo
	@Override
	double calcularArea() {
		return Base * Altura;
	}
	//implementar el método para obtener el nombre de la figura
	@Override
    String obtenerNombre() {
        return "Rectángulo";
    }
}
