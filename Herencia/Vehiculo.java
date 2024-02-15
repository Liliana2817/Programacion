package Herencia;

public class Vehiculo {
	//variables
		private String Marca, Modelo;
		private int Año;
		
		//constructor
		public Vehiculo(String Marca, String Modelo, int Año) {
			this.Marca=Marca;
			this.Modelo=Modelo;
			this.Año=Año;
		}
		//métodos para mostrar la información del vehículo
		public void mostrarMarca() {
			System.out.println("La marca del vehículo es :"+ Marca);
		}
		public void mostrarModelo() {
			System.out.println("El modelo del vehículo es :"+ Modelo);
		}
		public void mostrarAño() {
			System.out.println("El año del vehículo es :"+ Año);
}
}