package AbstractSobrecarga;

public abstract class Empleado {
	// Propiedades comunes
    protected String Nombre;
    protected int Id;
    protected double Salario;

    // Constructor con sobrecarga
    public Empleado(String nombre, int id) {
        this.Nombre = nombre;
        this.Id = id;
    }

    // Constructor con sobrecarga
    public Empleado(String nombre, int id, double salario) {
        this(nombre, id);
        this.Salario = salario;
    }

    // Método abstracto para calcular salario
    public abstract double calcularSalario();

    // Método abstracto para mostrar detalles
    public abstract void mostrarDetalles();
}

// Clase concreta EmpleadoPermanente
class EmpleadoPermanente extends Empleado {
    // Propiedad específica
    private double beneficiosAdicionales;

    // Constructor con sobrecarga
    public EmpleadoPermanente(String nombre, int id) {
        super(nombre, id);
    }

    // Constructor con sobrecarga
    public EmpleadoPermanente(String nombre, int id, double salario) {
        super(nombre, id, salario);
    }

    // Constructor con sobrecarga
    public EmpleadoPermanente(String nombre, int id, double salario, double beneficiosAdicionales) {
        super(nombre, id, salario);
        this.beneficiosAdicionales = beneficiosAdicionales;
    }

    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return Salario + beneficiosAdicionales;
    }

    // Implementación del método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado Permanente:");
        System.out.println("Nombre: " + Nombre);
        System.out.println("ID: " + Id);
        System.out.println("Salario: " + Salario);
        System.out.println("Beneficios Adicionales: " + beneficiosAdicionales);
        System.out.println("Salario Total: " + calcularSalario());
    }
}

// Clase concreta EmpleadoTemporal
class EmpleadoTemporal extends Empleado {
    // Propiedad específica
    private int periodoContrato;

    // Constructor con sobrecarga
    public EmpleadoTemporal(String nombre, int id, int periodoContrato) {
        super(nombre, id);
        this.periodoContrato = periodoContrato;
    }

    // Constructor con sobrecarga
    public EmpleadoTemporal(String nombre, int id, double salario, int periodoContrato) {
        super(nombre, id, salario);
        this.periodoContrato = periodoContrato;
    }

    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return Salario;
    }

    // Implementación del método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado Temporal:");
        System.out.println("Nombre: " + Nombre);
        System.out.println("ID: " + Id);
        System.out.println("Salario: " + Salario);
        System.out.println("Periodo de Contrato: " + periodoContrato + " meses");
    }
}

// Clase concreta EmpleadoContratista
class EmpleadoContratista extends Empleado {
    // Propiedad específica
    private int periodoContrato;

    // Constructor con sobrecarga
    public EmpleadoContratista(String nombre, int id, int periodoContrato) {
        super(nombre, id);
        this.periodoContrato = periodoContrato;
    }

    // Constructor con sobrecarga
    public EmpleadoContratista(String nombre, int id, double salario, int periodoContrato) {
        super(nombre, id, salario);
        this.periodoContrato = periodoContrato;
    }

    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return Salario;
    }

    // Implementación del método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado Contratista:");
        System.out.println("Nombre: " + Nombre);
        System.out.println("ID: " + Id);
        System.out.println("Salario: " + Salario);
        System.out.println("Periodo de Contrato: " + periodoContrato + " meses");
    }
}
