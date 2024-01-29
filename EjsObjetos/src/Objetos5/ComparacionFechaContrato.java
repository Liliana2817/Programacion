package Objetos5;
import java.util.Date;
public class ComparacionFechaContrato {

	public static void main(String[] args) {
		//Crea dos objetos Empleado con fechas de contrato diferentes.
	       Empleado Empleado3 = new Empleado("Anto", 2021, 3,3,3);
	       Empleado Empleado4 = new Empleado("Mat", 2020,4,4,4);
	       
	       //Obtener las fechas del contrato de ambos
	       Date FechaContratoEmpleado3 = Empleado3.dameFechaContrato();
	       Date FechaContratoEmpleado4 = Empleado4.dameFechaContrato();
	       
	       //Comparacion de las fechas de contrato
	       
	       if(FechaContratoEmpleado3.before(FechaContratoEmpleado4)) {
	    	   System.out.println("Mat fue contratado  antes que Anto.");
	       } else if (FechaContratoEmpleado3.after(FechaContratoEmpleado4)) {
	    	   System.out.println("Anto fue contratado despues que Mat");
	       } else {
	    	   System.out.println("Ambos empleados fueron contratados el misma fecha");
	       }
	}

}
