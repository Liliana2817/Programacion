package AbstractSobrecarga;

import java.awt.Color;

public abstract class FiguraGeometrica {
	// Propiedades comunes
    protected Color colorLinea;
    protected Color colorRelleno;

    // Constructor con sobrecarga
    public FiguraGeometrica(Color colorLinea, Color colorRelleno) {
        this.colorLinea = colorLinea;
        this.colorRelleno = colorRelleno;
    }

    // Constructor con sobrecarga
    public FiguraGeometrica() {
        this(Color.BLACK, Color.WHITE); // Colores por defecto
    }

    // Método abstracto para dibujar
    public abstract void dibujar();

    // Método abstracto para calcular el área
    public abstract double calcularArea();
}

// Clase concreta Circulo
class Circulo extends FiguraGeometrica {
    // Propiedad específica
    private double radio;

    // Constructor con sobrecarga
    public Circulo(double radio, Color colorLinea, Color colorRelleno) {
        super(colorLinea, colorRelleno);
        this.radio = radio;
    }

    // Constructor con sobrecarga
    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    // Implementación del método dibujar
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo con radio " + radio + ", color de línea: " + colorLinea + ", color de relleno: " + colorRelleno);
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase concreta Rectangulo
class Rectangulo extends FiguraGeometrica {
    // Propiedades específicas
    private double base;
    private double altura;

    // Constructor con sobrecarga
    public Rectangulo(double base, double altura, Color colorLinea, Color colorRelleno) {
        super(colorLinea, colorRelleno);
        this.base = base;
        this.altura = altura;
    }

    // Constructor con sobrecarga
    public Rectangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método dibujar
    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo con base " + base + " y altura " + altura + ", color de línea: " + colorLinea + ", color de relleno: " + colorRelleno);
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return base * altura;
    }
}

// Clase concreta Triangulo
class Triangulo extends FiguraGeometrica {
    // Propiedades específicas
    private double base;
    private double altura;

    // Constructor con sobrecarga
    public Triangulo(double base, double altura, Color colorLinea, Color colorRelleno) {
        super(colorLinea, colorRelleno);
        this.base = base;
        this.altura = altura;
    }

    // Constructor con sobrecarga
    public Triangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método dibujar
    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo con base " + base + " y altura " + altura + ", color de línea: " + colorLinea + ", color de relleno: " + colorRelleno);
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
