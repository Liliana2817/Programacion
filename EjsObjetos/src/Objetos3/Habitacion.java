package Objetos3;

public class Habitacion {
private int Num;
private String tipo;
private boolean ocupada;

// Constructor
public Habitacion(int Num, String tipo) {
	this.Num = Num;
	this.tipo = tipo;
	this.ocupada = false;
}

// Getters y Setters
public int getNum() {
	return Num;
}

public String getTipo() {
	return tipo;
}

public boolean getOcupada() {
	return ocupada;
}

public void setNumero(int NumHab) {
	if (NumHab < 1) {
		System.out.println("El número de la habitación debe ser mayor a cero");
	}else {
		this.Num = NumHab;
	}
}
// setter para tipo
public void setTipo(String tipo) {
	if (tipo.equalsIgnoreCase("simple") || tipo.equalsIgnoreCase("primera") || tipo.equalsIgnoreCase("suite")) {
		this.tipo = tipo;
	}else {
		System.out.println("Solo puede ser de tipo: simple, primera o suite.");
	}
}

public void setOcupada(boolean ocupada) {
	this.ocupada = ocupada;
}

}

