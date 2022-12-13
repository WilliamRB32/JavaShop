package Tienda;

public class RAM extends Componentes{

	private int memoria;
	private String frecuencia;
	private String tipo;
	
	public int getMemoria() {
		return memoria;
	}
	
	
	public void setMemoria(int memoria) {
		this.memoria=memoria;
	}
	
	
	
	public RAM(String nombre , double voltaje, long precio , int memoria,String marca, String tipo, String frecuencia) {
		super.setMarca(marca);
		super.setNombre(nombre);
		super.setPrecio(precio);
		super.setVoltaje(voltaje);
		this.memoria=memoria;
		this.frecuencia=frecuencia;
		this.tipo=tipo;
	}


	public String getFrecuencia() {
		return frecuencia;
	}


	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "RAM [memoria=" + memoria + ", frecuencia=" + frecuencia + ", tipo=" + tipo + ", Nombre="
				+ getNombre() + ", Voltaje=" + getVoltaje() + ", Precio=" + getPrecio() + ", Marca="
				+ getMarca() + "]";
	}
	
	
	public String Velocidad() {
		double velocidad;
		velocidad = this.memoria*super.getVoltaje();
		String vel = String.valueOf(velocidad);
		return vel;

	}
	
	
	
}

//-------------------------------------------------------------------------------

