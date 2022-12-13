package Tienda;

public class aire extends Disipador{
	
	private int rotacion;
	

	public aire(String nombre, String enchufe, double voltaje, long precio, String marca, String tipo, int rotacion) {
		super(nombre, enchufe, voltaje, precio, marca, tipo);
		this.rotacion=rotacion;
		// TODO Auto-generated constructor stub
	}
	
	
	public double Enfriamiento() {
		double enfriamiento;
		enfriamiento=super.getVoltaje()/this.rotacion;
		return enfriamiento;	
		}


	public int getRotacion() {
		return rotacion;
	}


	public void setRotacion(int rotacion) {
		this.rotacion = rotacion;
	}
	
	public void imprimirTipo() {
		System.out.println("Este es un disipador de aire.");
	}
	
	
}