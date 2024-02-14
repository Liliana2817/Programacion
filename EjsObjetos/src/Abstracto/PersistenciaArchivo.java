package Abstracto;

public class PersistenciaArchivo extends Persistencia{
@Override
void GuardarDatos(Object datos) {
	//Especifica para guardar los datos en un archivo
	System.out.println("Guardando los datos de los archivos: " + datos.toString());
}
@Override
//Especifica para cargando los datos desde un archivo
Object CargarDatos() {
System.out.println("Cargando los datos de los archivos: " );
return null;
}
}
