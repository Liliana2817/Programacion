package Abstracto;

public class EmpleadoTiempoCompleto extends Empleado{
	 private double SalarioMensual;

	    // Constructor
	    public EmpleadoTiempoCompleto(double SalarioMensual) {
	        this.SalarioMensual = SalarioMensual;
	    }

	    @Override
	    double CalcularSalario() {
	        return SalarioMensual;
	    }
}
