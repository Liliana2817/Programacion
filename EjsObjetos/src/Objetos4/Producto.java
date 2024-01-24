package Objetos4;

public class Producto {
	//valores
   private String Nombre;
   private int Cantidad;
   private double Precio;
   //contructor
   public Producto(){
	   this.Nombre = Nombre;
	   this.Cantidad = Cantidad;
	   this.Precio = Precio;
   }
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public int getCantidad() {
	return Cantidad;
}
public void setCantidad(int cantidad) {
	Cantidad = cantidad;
}
public double getPrecio() {
	return Precio;
}
public void setPrecio(double Precio) {
	this.Precio = Precio;
}
   
    
}
