package Objetos4;

public class Empleado {
  private String Nombre;
  private int Horas;
  private double Tarifas;
  
  //Construtor
  public Empleado() {
  this.Nombre = Nombre;
  this.Horas = Horas;
  this.Tarifas = Tarifas;
  }

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public int getHoras() {
	return Horas;
}

public void setHoras(int horas) {
	Horas = horas;
}

public double getTarifas() {
	return Tarifas;
}

public void setTarifas(double tarifas) {
	Tarifas = tarifas;
}
  public double CalcularSalario() {
	  return Horas * Tarifas;
  }
}
