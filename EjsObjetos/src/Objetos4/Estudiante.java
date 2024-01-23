package Objetos4;

import javax.swing.JOptionPane;

public class Estudiante {
  private String Nombre;
  private int Edad;
  private String Grado;
  
  
  // Construtor
  public Estudiante() {
	  this.Nombre = Nombre;
	  this.Edad = Edad;
	  this.Grado = Grado;
  }
  
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public int getEdad() {
	return Edad;
}
public void setEdad(int edad) {
	Edad = edad;
}
public String getGrado() {
	return Grado;
}
public void setGrado(String grado) {
	this.Grado = grado;
}
  
public void mostrarInformacion() {
	JOptionPane.showMessageDialog(null, "Nombre: " + Nombre + "\nEdad: " + Edad + "\nGrado: " + Grado);
}
}
