package Tienda;

public class HDD extends DiscoDuro{
	
private int rotacion;
	
	public int getRotacion() {
		return rotacion;
	}
	
	public void setRotacion(int rotacion) {
		this.rotacion=rotacion;
	}
	

	public HDD(String nombre,  double voltaje, long precio, String marca, double tiempoLectura, double memoria, int rotacion) {
		super(nombre, voltaje, precio, marca, tiempoLectura, memoria);
		this.rotacion=rotacion;
	}
	
	
	
	public void latencia(long rotacion) {
		long latenciaMedia;
		latenciaMedia = rotacion/2;
		
		System.out.println(latenciaMedia);
	}

}
