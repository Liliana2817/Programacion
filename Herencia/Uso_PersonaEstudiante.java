package Herencia;

import javax.swing.JOptionPane;

public class Uso_PersonaEstudiante {

	public static void main(String[] args) {
		//Introducir los datos de la persona que ingresara como estudiante
				String Nombre = JOptionPane.showInputDialog("Introduce aqui tu nombre :");
				int Edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce aqui tu edad :"));
				String Carrera = JOptionPane.showInputDialog("Introduce aqui la carrera que estás realizando :");

				Estudiante Estudiante = new Estudiante (Nombre, Edad,Carrera);

				//Mustra los datos del estudiante
				JOptionPane.showMessageDialog(null,
						"\nNombre: " + Estudiante.getNombre() +
						"\nEdad: " + Estudiante.getEdad() +
						"\nCarrera: " + Estudiante.getCarrera());

	}

}
