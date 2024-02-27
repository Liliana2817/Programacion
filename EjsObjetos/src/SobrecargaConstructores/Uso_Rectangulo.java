package SobrecargaConstructores;

public class Uso_Rectangulo {

	public static void main(String[] args) {
		// Se crea instancias del Rectangulo con diferentes constructores
        Rectangulo Rect1 = new Rectangulo(5.0, 3.0); // Rectángulo con ancho 5 y altura 3
        Rectangulo Rect2 = new Rectangulo(4.0); // Rectángulo con ancho y altura 4 (cuadrado)
        Rectangulo Rect3 = new Rectangulo(); // Rectángulo con ancho y altura 1 (cuadrado)

        // Muestra áreas de los rectángulos
        System.out.println("Área del rectángulo 1: " + Rect1.calcularArea());
        System.out.println("Área del rectángulo 2: " + Rect2.calcularArea());
        System.out.println("Área del rectángulo 3: " + Rect3.calcularArea());

	}

}
