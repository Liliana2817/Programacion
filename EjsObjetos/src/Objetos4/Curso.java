package Objetos4;

public class Curso {
private String Nombre;
private double Calificacion;

public Curso() {
	this.Nombre = Nombre;
	this.Calificacion = Calificacion;
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public double getCalificacion() {
	return Calificacion;
}

public void setCalificacion(double Calificacion) {
	this.Calificacion = Calificacion;
}
public String CategoriaCalificacion() {
    if (Calificacion >= 90) {
        return "A";
    } else if (Calificacion >= 80) {
        return "B";
    } else if (Calificacion >= 70) {
        return "C";
    } else if (Calificacion >= 60) {
        return "D";
    } else {
        return "F";
    }
}





}