package Tienda;

public class SSD extends DiscoDuro{

	public SSD(String nombre,  double voltaje, long precio, String marca, double tiempoLectura, double memoria) {
		super(nombre, voltaje, precio, marca, tiempoLectura, memoria);
	}
	
	public void Transferencia(double tiempoLectura) {
		double transferencia;
		transferencia=tiempoLectura/3;
		System.out.println(transferencia);
	}
	
}
