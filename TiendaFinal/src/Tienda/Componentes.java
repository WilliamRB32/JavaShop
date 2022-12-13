package Tienda;

public abstract class Componentes {
	
	private String nombre;
	private double voltaje; 
	private long precio;
	private String marca;
	
	public String getNombre(){
		return nombre;
	}
	public double getVoltaje() {
		return voltaje;
	}
	public long getPrecio() {
		return precio;
	}
	public String getMarca() {
		return marca;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setVoltaje(double voltaje) {
		this.voltaje=voltaje;
	}
	public void setPrecio(long precio) {
		this.precio=precio;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
}
