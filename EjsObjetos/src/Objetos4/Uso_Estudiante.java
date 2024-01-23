package Objetos4;

import javax.swing.JOptionPane;

public class Uso_Estudiante {

	public static void main(String[] args) {
		//Estudiante 1
				Estudiante Estudiante1 = new Estudiante();
				
				Estudiante1.setNombre(JOptionPane.
						showInputDialog("Introduzca  el nombre del estudiante 1"));	
				System.out.println(Estudiante1.getNombre());
				
				Estudiante1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduzca  la edad del estudiante 1")));	
				System.out.println(Estudiante1.getEdad());
			
				Estudiante1.setGrado(JOptionPane.showInputDialog("Introduzca el grado del estudiante 1"));	
				System.out.println(Estudiante1.getGrado());
				
				//Estudiante 2
				Estudiante Estudiante2 = new Estudiante();
				
				Estudiante2.setNombre(JOptionPane.showInputDialog("Introduzca  el nombre del estudiante 2"));	
				System.out.println(Estudiante2.getNombre());
				
				Estudiante2.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del estudiante 2")));
				System.out.println(Estudiante2.getEdad());
				
				Estudiante2.setGrado(JOptionPane.showInputDialog("Introduzca  el grado del estudiante 2"));	
				System.out.println(Estudiante2.getGrado());
				
				//estudiante3
				Estudiante Estudiante3 = new Estudiante();
				
				Estudiante3.setNombre(JOptionPane.showInputDialog("Introduzca  el nombre del estudiante 3"));	
				System.out.println(Estudiante3.getNombre());
				
				Estudiante3.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduzca  la edad del estudiante 3")));	
				System.out.println(Estudiante3.getEdad());
				
				Estudiante3.setGrado(JOptionPane.showInputDialog("Introduzca  el grado del estudiante 3"));	
				System.out.println(Estudiante3.getGrado());
				
				//mostrar los datos
				Estudiante1.mostrarInformacion();
				Estudiante2.mostrarInformacion();
				Estudiante3.mostrarInformacion();
			}
		 
		}