package AbstractSobrecarga;

public class Uso_FiguraGeometrica {

	public static void main(String[] args) {
		 // Ejemplo de uso
        Circulo circulo1 = new Circulo(5.0);
        circulo1.dibujar();
        System.out.println("Área del círculo: " + circulo1.calcularArea());

        System.out.println();

        Rectangulo rectangulo1 = new Rectangulo(4.0, 3.0);
        rectangulo1.dibujar();
        System.out.println("Área del rectángulo: " + rectangulo1.calcularArea());

        System.out.println();

        Triangulo triangulo1 = new Triangulo(4.0, 3.0);
        triangulo1.dibujar();
        System.out.println("Área del triángulo: " + triangulo1.calcularArea());

	}

}
