package Objetos4;

import javax.swing.JOptionPane;

public class Uso_Curso {

	public static void main(String[] args) {
		Curso CursoCalificacion= new Curso();
		CursoCalificacion.setNombre(JOptionPane.showInputDialog("Introduzca el nombre del curso"));	
		CursoCalificacion.setCalificacion (Double.parseDouble(JOptionPane.showInputDialog("Introduzca la calificación")));	
		
		String Categoria = CursoCalificacion.CategoriaCalificacion();
		 JOptionPane.showMessageDialog(null, "Curso: " + CursoCalificacion.getNombre() +"\nCalificación: " + CursoCalificacion.getCalificacion() +"\nCategoría: " + Categoria);

	}

}
