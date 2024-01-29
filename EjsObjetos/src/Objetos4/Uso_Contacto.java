package Objetos4;
import javax.swing.JOptionPane;
import java.util.*;
public class Uso_Contacto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				List<Contacto> LContactos = new ArrayList<>();
				boolean Continuar = true;
				do {
					int option = Integer.parseInt(JOptionPane.showInputDialog("Agenda de contactos\n"
							+ "1) Para añadir contacto\n"
							+ "2) Para buscar contacto\n"
							+ "3) Para mostrar contactos\n"
							+ "4) Para salir\n"
							+ "Elige una opción:"));
					switch(option){
						case 1:
							LContactos.add(agregarContacto());
							break;
						case 2:
							String EmailContacto = JOptionPane.showInputDialog("Ingresa el correo del contacto para realizar la busqueda");
							searchContact(EmailContacto, LContactos);
							break;
						case 3:
							JOptionPane.showMessageDialog(null, LContactos);
							break;
						case 4:
							Continuar = !Continuar;
							JOptionPane.showInputDialog("Cerrando sesión...");
							break;
						default:
							JOptionPane.showInputDialog("Opción incorrecta.");
							break;
					}
				} while(Continuar);
			}
			// Método para crear contacto
			private static Contacto agregarContacto() {
				String Nombre = JOptionPane.showInputDialog("Ingresa el nombre del contacto");
				String Movil = JOptionPane.showInputDialog("Ahora ingresa el número de télefono");
				String Email = JOptionPane.showInputDialog("Ahora ingresa el correo");
				return new Contacto(Nombre, Movil, Email);
			}
			// Método para buscar contacto en la Agenda de contactos
			private static void searchContact(String Email, List<Contacto> LContactos) {
				if (Email != null && !Email.isEmpty()){
					for (Contacto contacto : LContactos) {
						if (contacto.dimeEmail().equalsIgnoreCase(Email)) {
							JOptionPane.showInputDialog(contacto);
							return;
						}
					}
					JOptionPane.showInputDialog("No existe ningún contacto con el correo" + Email);
				}else {
					JOptionPane.showInputDialog("El correo no puede ser nulo, ni string vacío");
				}
	}

}
