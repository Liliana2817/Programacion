package SobrecargaConstructores;

public class Uso_Empleado {

	public static void main(String[] args) {
	    //inctancias creadas de empleados con distintos construtores.
		Empleado Emp1 = new Empleado("Juana", 2500.0, "Ventas");
        Empleado Emp2 = new Empleado("Mar", 3000.0);
        Empleado Emp3 = new Empleado("Carlota");
		
      //Mostrar la informacion de los empleados
        System.out.println("Información del empleado 1:");
        Emp1.mostrarInformacion();
        System.out.println();

        System.out.println("Información del empleado 2:");
        Emp2.mostrarInformacion();
        System.out.println();

        System.out.println("Información del empleado 3:");
        Emp3.mostrarInformacion();
	}

}
