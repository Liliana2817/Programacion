package Objetos3;
import java.util.ArrayList;
public class Hotel {
	ArrayList<Habitacion> Habitaciones;

	// Constructor
	public Hotel() {
		this.Habitaciones = new ArrayList<>();
	}

	// Métodos
	public void reservar(int Num) {
		if (verificar(Num)) {
			for (Habitacion Ha : Habitaciones) {
				if (Ha.getNum() == Num) {
					Ha.setOcupada(true);
					System.out.println("Reserva exitosa.");
					break;
				}
			}
		} else {
			System.out.println("No se puede hacer la reserva.");
		}
	}

	public void cancelar(int Num) {
		if (!verificar(Num)) {
			for (Habitacion Ha : Habitaciones) {
				if (Ha.getNum() == Num) {
					Ha.setOcupada(false);
					System.out.println("Reserva cancelada");
					break;
				}
			}
		} else {
			System.out.println("La habitación no está reservada.");
		}

	}

	public boolean verificar(int Num) {
		for (Habitacion Ha : Habitaciones) {
			if (Ha.getNum() == Num) {
				return !Ha.getOcupada();
			}
		}
		System.out.println("No existe dicha habitación.");
		return false;
	}
}
