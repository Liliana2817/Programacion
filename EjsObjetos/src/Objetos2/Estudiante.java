package Objetos2;

public class Estudiante {
	private  String nombre;
	private int edad;
	private double calificacion ;
	
	public String dime_nombre(){
		return " El nombre del estudiante es  " + nombre + " .";
	}
	public void establece_nombre(){
		nombre = "Lili";
	}
	
	public String dime_edad(){
		return " la edad es   " + edad + " .";
		
	}
	public void establece_edad(){
		edad = 23;
	}
	
	public String dime_calificacion(){
		return " la edad es   " + calificacion + " .";
		
	}
	public void establece_calificacion(){
		calificacion = 6;
	}
}
