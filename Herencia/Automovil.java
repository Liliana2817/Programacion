package Herencia;

public class Automovil extends Vehiculo{
private String tipoCombustible;
	
	//constructor
	public Automovil(String Marca, String Modelo, int Año, String tipoCombustible) {
		super(Marca, Modelo, Año);
		this.tipoCombustible = tipoCombustible;
	}
	public void mostrarInfo() {
	     //llamar a los métodos de la clase Vehiculo
	     mostrarMarca();
	     mostrarModelo();
	     mostrarAño();
	     System.out.println("El tipo de combustible del automovil es de :" + tipoCombustible);
	 }
}
