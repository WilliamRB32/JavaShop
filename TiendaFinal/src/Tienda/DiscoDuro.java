package Tienda;

public abstract class DiscoDuro extends Componentes {
	
	private double tiempoLectura;
	private double memoria;
	private String forma;
	
	public double getTiempoLectura() {
		return tiempoLectura;
	}

	public void setTiempoLectura(double tiempoLectura) {
		this.tiempoLectura = tiempoLectura;
	}
	
	
	public DiscoDuro(String nombre, double voltaje, long precio , String marca, double tiempoLectura, double memoria) {
		super.setMarca(marca);
		super.setNombre(nombre);
		super.setPrecio(precio);
		super.setVoltaje(voltaje);
		this.tiempoLectura=tiempoLectura;
		this.memoria=memoria;
	}
	
	public void transferencia(double tiempoLectura) {
		double tasaTransferencia;
		
		tasaTransferencia=tiempoLectura/2;
		System.out.println(tasaTransferencia);
		
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "DiscoDuro [Tiempo de lectura=" + tiempoLectura + ", Memoria GB=" + memoria + ", Forma=" + forma + "]";
	}
	
	
	

}
//-------------------------------------------------------------------------------


//-------------------------------------------------------------------------------

