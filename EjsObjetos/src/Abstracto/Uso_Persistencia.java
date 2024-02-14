package Abstracto;

public class Uso_Persistencia {

	public static void main(String[] args) {
		// Crear instancia de PersistenciaArchivo
        Persistencia persistenciaArchivo = new PersistenciaArchivo();
        persistenciaArchivo.GuardarDatos("Datos a guardar en archivo");
        persistenciaArchivo.CargarDatos();
        
        // Crear instancia de PersistenciaBaseDatos
        Persistencia persistenciaBaseDatos = new PersistenciaBaseDatos();
        persistenciaBaseDatos.GuardarDatos("Datos a guardar en base de datos");
        persistenciaBaseDatos.CargarDatos();

	}

}
