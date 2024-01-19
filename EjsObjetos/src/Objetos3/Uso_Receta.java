package Objetos3;
import java.util.Scanner;
public class Uso_Receta {

	public static void main(String[] args) {
		
		Receta receta = new Receta();

		cargarReceta(receta);
		receta.mostrarReceta();
	}

	private static void cargarReceta(Receta receta) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Para generar la receta ingresa la cantidad de ingredietes que vas a tener que utilizar:");
		int cantidadIngrediente = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cantidadIngrediente; i++) {
			System.out.print("Ingresa los ingredientes:");
			receta.setAñadirIngrediente(sc.nextLine());
		}
		System.out.print("Ingresa la cantidad de pasos que vas a utilizar : ");
		int cantidadPasos = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cantidadPasos; i++) {
			System.out.print("Ingrese el paso " + (i + 1) + ":");
			receta.addPaso(sc.nextLine());
		}
		sc.close();
	}
	

}
