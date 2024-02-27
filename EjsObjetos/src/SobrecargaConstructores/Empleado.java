package SobrecargaConstructores;

public class Empleado {
	
		private String Nombre;
	    private double Salario;
	    private String Departamento;
	  //Constructor
		public Empleado(String nombre, double salario, String departamento) {
			super();
			this.Nombre = nombre;
			this.Salario = salario;
			this.Departamento = departamento;
		}
		//Constructor sin departamento
	public Empleado(String nombre, double salario) {
		this(nombre,salario, "Sin departamento");		
	}
	//Constructor sin salario ni departamento
		public Empleado(String nombre) {
			this(nombre,0.0, "sin departamento");
		}
		// Getter and Setter
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
			this.Nombre = nombre;
		}
		public double getSalario() {
			return Salario;
		}
		public void setSalario(double salario) {
			this.Salario = salario;
		}
		public String getDepartamento() {
			return Departamento;
		}
		public void setDepartamento(String departamento) {
			this.Departamento = departamento;
		}
		//Metodo principal para imprimir la informacion del los empleados.
		public void mostrarInformacion() {
	        System.out.println("Nombre: " + Nombre);
	        System.out.println("Salario: " + Salario);
	        System.out.println("Departamento: " + Departamento);
	    }
		
	    
	    
	    
}
