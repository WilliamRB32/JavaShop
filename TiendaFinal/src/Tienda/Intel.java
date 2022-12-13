package Tienda;

public class Intel extends Procesador {
	
int porcentaje;
	
	
	public Intel(String nombre, String enchufe, double voltaje, long precio, int potencia, String marca, double render, String relogmax, int nucleos, int hilos) {
		super(nombre, enchufe, voltaje, precio, potencia, marca, render, relogmax, nucleos, hilos);
	}
	

	
	
	public void overclock(int potencia){
		potencia = potencia + potencia*porcentaje/100;
	}

}
