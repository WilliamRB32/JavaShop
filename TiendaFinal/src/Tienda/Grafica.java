package Tienda;

public abstract class Grafica extends Componentes {
	
	private String frecuencia;
	private long memoria;
	private String tipo;
	private int pines;
	
	double tiempo;

	
	
	

	
	public Grafica(String nombre, double voltaje, long precio, long memoria, int pines, String tipo, String frecuencia,String marca) {
		super.setMarca(marca);
		super.setNombre(nombre);
		super.setPrecio(precio);
		super.setVoltaje(voltaje);
		this.memoria=memoria;
		this.frecuencia=frecuencia;
		this.pines=pines;
		this.tipo=tipo;
		
	}
	
	
	public final void usoMemoria(long memoria,int nucleos) {
		
		long memoriaUsada;
		memoriaUsada = memoria/nucleos;
		System.out.println(memoriaUsada);
		
	}
	
	
	public void TiempoRender (double tiempo, long memoria, int pines) {
		tiempo = memoria/(pines*10);
		System.out.println(tiempo);
	}


	public String getFrecuencia() {
		return frecuencia;
	}


	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}


	public long getMemoria() {
		return memoria;
	}


	public void setMemoria(long memoria) {
		this.memoria = memoria;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getPines() {
		return pines;
	}


	public void setPines(int pines) {
		this.pines = pines;
	}
	
	public double getTiempo() {
		return tiempo;
	}


	@Override
	public String toString() {
		return "Grafica [frecuencia=" + frecuencia + ", memoria=" + memoria + ", tipo=" + tipo + ", pines=" + pines
				+ ", tiempo=" + tiempo + ", Nombre=" + getNombre() + ", Voltaje=" + getVoltaje()
				+ ", Precio=" + getPrecio() + ", Marca=" + getMarca() +  "]";
	}

}

//-------------------------------------------------------------------------------



//-------------------------------------------------------------------------------



//-------------------------------------------------------------------------------


