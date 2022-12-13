package Tienda;

public class AMD extends Procesador{
	public AMD(String nombre, String enchufe, double voltaje, long precio, int potencia, String marca, double render, String relogmax, int nucleos, int hilos) {
		super(nombre, enchufe, voltaje, precio, potencia, marca, render, relogmax, nucleos, hilos);
	}
	

	public void tiempoRender(double render) {
		render=render*0.8;
	}
	
	
}
