package Abstracto;

public class EmpleadoTiempoParcial extends Empleado{
	 private int HorasTrabajadas;
	    private double SalarioPorHora;

	    // Constructor
	    public EmpleadoTiempoParcial(int HorasTrabajadas, double SalarioPorHora) {
	        this.HorasTrabajadas = HorasTrabajadas;
	        this.SalarioPorHora = SalarioPorHora;
	    }

	    @Override
	    double CalcularSalario() {
	        return HorasTrabajadas * SalarioPorHora;
	    }
}
