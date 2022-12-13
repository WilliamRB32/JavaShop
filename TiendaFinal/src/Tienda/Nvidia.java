package Tienda;

public class Nvidia extends Grafica{

	public Nvidia(String nombre, double voltaje, long precio, long memoria, int pines, String tipo, String frecuencia,String marca) {
		super(nombre, voltaje, precio, memoria, pines, frecuencia, marca, tipo);
	}
	
	
	public String Graficacion() {
		double capacidad;
		capacidad = this.getMemoria()/ Integer.parseInt(getFrecuencia());
		return String.valueOf(capacidad);
	}
	
	
	
	
}