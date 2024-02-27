package SobrecargaConstructores;

public class Producto {
	 private String Nombre;
	    private double Precio;
	    private int CantidadStock;
	    //Constructor
		public Producto(String nombre, double precio, int cantidadStock) {
			super();
			this.Nombre = nombre;
			this.Precio = precio;
			this.CantidadStock = cantidadStock;
		}
		//Constructor nombre y precio
		public Producto(String nombre, double precio) {
			this(nombre,precio,0);
		}
		//Contructor nombre "Sin  precio ni cantidad en stock".
		public Producto(String nombre) {
			this(nombre,0.0,0);
		}
	   // Metodo Getter and Setter
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
			this.Nombre = nombre;
		}
		public double getPrecio() {
			return Precio;
		}
		public void setPrecio(double precio) {
			this.Precio = precio;
		}
		public int getCantidadStock() {
			return CantidadStock;
		}
		public void setCantidadStock(int cantidadStock) {
			this.CantidadStock = cantidadStock;
		}
		
}
