package Objetos3;

public class Uso_Habitacion_Hotel {

	public static void main(String[] args) {
		// 
		Hotel hotel = new Hotel();
		Habitacion h1 = new Habitacion(100, "simple");
		Habitacion h2 = new Habitacion(101, "doble");
		Habitacion h3 = new Habitacion(102, "suite");

		// Añadir Habitaciones al hotel
		hotel.Habitaciones.add(h1);
		hotel.Habitaciones.add(h2);
		hotel.Habitaciones.add(h3);

		// Reservar una Habitación
		hotel.reservar(102);
	}

}
