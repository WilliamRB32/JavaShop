package Tienda;

public class Vega extends Grafica{
	
	public Vega(String nombre, double voltaje, long precio, long memoria, int pines, String tipo, String frecuencia,String marca) {
		super(nombre, voltaje, precio, memoria, pines, frecuencia, marca, tipo);	
	}
	
	

	public void tiempoRender(double tiempo, long memoria, int pines) {
		tiempo =(memoria/(pines*10)) * 0.6;
		System.out.println(tiempo);
	}
	
	
	
}
