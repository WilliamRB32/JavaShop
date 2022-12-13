package Tienda;

public abstract class Procesador extends Componentes{
	
	private int potencia;
	private double render;
	private String relogmax;
	private int nucleos;
	private int hilos;
	private String enchufe;
	double tiempo;
	
	
	
	
	public int getPotencia() {
		return potencia;
	}
	public double getRender(){
		return render;
	}
	public String getRelogmax() {
		return relogmax;
	}
	public int getNucleos() {
		return nucleos;
	}
	public int getHilos() {
		return hilos;
	}
	
	
	public void setPotencia(int potencia) {
		this.potencia=potencia;
	}
	public void setRender(double render) {
		this.render=render;
	}
	public void setRelogmax(String relogmax) {
		this.relogmax=relogmax;
	}
	public void setNucleos(int nucleos) {
		this.nucleos=nucleos;
	}
	public void renderizado() {
		this.render=this.render*10/this.hilos;
	}
	
	public void tiempoEncendido(int potencia, double render, int nucleos) {
		tiempo = (potencia + render)/(nucleos*10); 
	}
		
	
	
	public Procesador(String nombre, String enchufe, double voltaje, long precio, int potencia, String marca, double render, String relogmax, int nucleos, int hilos) {
		super.setMarca(marca);
		super.setPrecio(precio);
		super.setNombre(nombre);
		super.setVoltaje(voltaje);
		this.nucleos=nucleos;
		this.potencia=potencia;
		this.relogmax=relogmax;
		this.render=render;
		this.hilos=hilos;
		this.enchufe=enchufe;
		
	}
	public String getEnchufe() {
		return enchufe;
	}
	public void setEnchufe(String enchufe) {
		this.enchufe = enchufe;
	}
	public void setHilos(int hilos) {
		this.hilos = hilos;
	}
	
	@Override
	public String toString() {
		return "Procesador [Potencia=" + potencia + ", Tiempo Render=" + render + ", Relog máximo=" + relogmax + ", Nucleos="
				+ nucleos + ", Hilos=" + hilos + ", Enchufe=" + enchufe + "Nombre="	+ getNombre() + ", Voltaje=" + getVoltaje() + ", Precio=" + getPrecio() + ", Marca="
				+ getMarca() + "]";
	}

}

//------------------------------------------------------------------------------

//------------------------------------------------------------------------------


//------------------------------------------------------------------------------

	

