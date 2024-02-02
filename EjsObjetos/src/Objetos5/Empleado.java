package Objetos5;
import java.util.Date;
public class Empleado {
	// VARIABLES
	  private String Nombre;
	  private double Sueldo;
	  private Date FechaContrato;
	  
	  //Construtor
	  public Empleado(String Nombre,double Sueldo,int year,int month,int day) {
		  this.Nombre = Nombre;
		  this.Sueldo = Sueldo;
		  this.FechaContrato = new Date(year - 2000, month - 1, day);
	  }

	public String dameNombre() {//GETTER
		return Nombre;
	}

	public void estableceNombre(String nombre) {//SETTER
	    Nombre = nombre;
	}

	public double dameSueldo() {//GETTER
		return Sueldo;
	}

	public void estableceSueldo(double Sueldo) {//SETTER
		this.Sueldo = Sueldo;
	}

	public Date dameFechaContrato() {//GETTER
		return FechaContrato;
	}

	public void estableceFechaContrato(Date fechaContrato) {//SETTER
		FechaContrato = fechaContrato;
	}

	// Metodo para subir el sueldo
		public void subeSueldo(double porcentaje) {
			double aumento = porcentaje / 100.0;
			Sueldo += Sueldo * aumento;
		}
}
