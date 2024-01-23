package Objetos4;

import javax.swing.JOptionPane;

public class Uso_Empleado {

	public static void main(String[] args) {
		Empleado[] Empleados = new Empleado[5];
		 for (int i = 0; i < Empleados.length; i++) {
	            Empleado Empleado = new Empleado();
	            
	            //introducir el nombre del empleado
	            Empleado.setNombre(JOptionPane.showInputDialog("Introduce el nombre del empleado " + (i + 1) + ":"));
	            
	            //introducir las horas trabajadas
	            Empleado.setHoras(Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas trabajadas por el empleado " + (i + 1) + ":")));
	            
	            //introducir la tarifa por hora
	            Empleado.setTarifas(Double.parseDouble(JOptionPane.showInputDialog("Introduce la tarifa por hora del empleado " + (i + 1) + ":")));
	            
	            //guardar el empleado en el array
	            Empleados[i] = Empleado;
	        }

	        //calcular y mostrar el salario de cada empleado
		 for (int i = 0; i < Empleados.length; i++) {
	            Empleado Empleado = Empleados[i];
	            double Salario = Empleado.CalcularSalario();
	            JOptionPane.showMessageDialog(null, "Empleado " + (i + 1) + ": " + Empleado.getNombre() + "\nSalario: " + Salario); //null es para que el mensaje aparezca en el centro de la pantalla
	        }
	    }
	}