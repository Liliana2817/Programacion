package SobrecargaConstructores;

public class Coche {
	private String Marca;
    private String Modelo;
    private int Año;
    private String Color;
    //Constructor
    public Coche(String marca, String modelo, int año, String color) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Año = año;
        this.Color = color;
    }

    // Constructor sin el año (se establece como 0)
    public Coche(String marca, String modelo, String color) {
        this(marca, modelo, 0, color);
    }

    // Constructor sin el año y el color (año se establece como 0 y color como "Desconocido")
    public Coche(String marca, String modelo) {
        this(marca, modelo, 0, "Desconocido");
    }

    // Métodos para obtener y establecer valores
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        this.Año = año;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

}
