package Tienda;

public class Case {
	
	
	public Case(String marca, String nombre, long precio, String forma) {
		super();
		this.marca = marca;
		this.nombre = nombre;
		this.precio = precio;
		this.forma = forma;
	}
	
	
	private String marca;
	private String nombre;
	private long precio;
	private String forma;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getPrecio() {
		return precio;
	}
	public void setPrecio(long precio) {
		this.precio = precio;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	
	
	
	@Override
	public String toString() {
		return "Case [marca=" + marca + ", nombre=" + nombre + ", precio=" + precio + ", forma=" + forma + "]";
	}
	
	

}
