package Abstracto;

public class Uso_Empleado {

	public static void main(String[] args) {
		// Crear un empleado a tiempo completo con un salario mensual 
        Empleado EmpleadoTiempoCompleto = new EmpleadoTiempoCompleto(2000);
        System.out.println("Salario del empleado a tiempo completo: " + EmpleadoTiempoCompleto.CalcularSalario()+ " $");

        // Crear un empleado a tiempo parcial que trabajó 20 horas con un salario por hora 
        Empleado EmpleadoTiempoParcial = new EmpleadoTiempoParcial(10, 15);
        System.out.println("El salario del empleado a tiempo parcial: " + EmpleadoTiempoParcial.CalcularSalario()+ " $");

	}

}
