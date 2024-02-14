package Abstracto;

public class Perro extends Animal{
@Override
void HaceSonido() {
	System.out.println("El perro del vecino ladra mucho.");
}
@Override
void Moverse(){
	System.out.println("El perro corre por todo el parque.");
}
}
