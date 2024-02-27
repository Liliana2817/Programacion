package SobrecargaConstructores;

public class Rectangulo {
	private double Ancho;
    private double Altura;
    //Constructor
	public Rectangulo(double ancho, double altura) {
		super();
		this.Ancho = ancho;
		this.Altura = altura;
	}
    //Constructor solo ancho
	public Rectangulo(double ancho) {
		this( ancho,ancho);  
	}
	//Constructor sin parámetros
	public Rectangulo() {
		this(1.0,1.0);//Se llama al ancho y la altura iguales a 1.
	}
	//Getter and Setter
	public double getAncho() {
		return Ancho;
	}
	public void setAncho(double ancho) {
		this.Ancho = ancho;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		this.Altura = altura;
	}
	// Método para calcular el área del rectángulo
    public double calcularArea() {
        return Ancho * Altura;
    }
}
