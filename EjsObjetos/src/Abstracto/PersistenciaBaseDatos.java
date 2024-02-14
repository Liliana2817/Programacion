package Abstracto;

public class PersistenciaBaseDatos extends Persistencia{
	 @Override
	    void GuardarDatos(Object datos) {
	        System.out.println("Guardando los datos en una base de datos: " + datos.toString());
	        // Específica para guardar datos en una base de datos
	    }
	    
	    @Override
	    Object CargarDatos() {
	        System.out.println("Cargando los datos desde una base de datos.");
	        // Específica para cargar datos desde una base de datos
	        return null;
	    }
}
