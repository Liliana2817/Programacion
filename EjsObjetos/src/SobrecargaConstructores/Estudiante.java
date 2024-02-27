package SobrecargaConstructores;

public class Estudiante {
	private String nombre;
    private int edad;
    private double promedioAcademico;

    // Constructor con todos los parámetros
    public Estudiante(String nombre, int edad, double promedioAcademico) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedioAcademico = promedioAcademico;
    }

    // Constructor con nombre y edad (promedio académico por defecto 0)
    public Estudiante(String nombre, int edad) {
        this(nombre, edad, 0.0);
    }

    // Constructor con solo nombre (edad y promedio académico por defecto 0)
    public Estudiante(String nombre) {
        this(nombre, 0, 0.0);
    }

    // Métodos para obtener y establecer valores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedioAcademico() {
        return promedioAcademico;
    }

    public void setPromedioAcademico(double promedioAcademico) {
        this.promedioAcademico = promedioAcademico;
    }
}
