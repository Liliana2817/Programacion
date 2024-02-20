package Herencia;

public class DispositivoElectronico {
	//variables
		private String Fabricante;
		private int añoDeFabricacion;
		
		//constructor
		public DispositivoElectronico(String Fabricante, int añoDeFabricacion) {
			this.Fabricante=Fabricante;
			this.añoDeFabricacion=añoDeFabricacion;
		}
		
		//getters
		public String getFabricante() {
	        return Fabricante;
	    }

	    public int getAñoDeFabricacion() {
	        return añoDeFabricacion;
	    }
}
