package Tienda;

public abstract class Fuente extends Componentes {
	
	private int slotsSata;
	private String gama;
	private int pines;
	private static final String clavija = "Tipo B";
	
	
	public String getGama() {
		return gama;
	}
	public void setGama (String gama) {
		this.gama=gama;
	}
	
	
	public Fuente(String nombre, double voltaje, long precio,String marca, String gama, int slotsSata, int pines) {
		
		super.setNombre(nombre);
		super.setPrecio(precio);
		super.setVoltaje(voltaje);
		super.setMarca(marca);
		this.gama=gama;
		this.pines=pines;
		this.slotsSata=slotsSata;
		
	}
	public int getSlotsSata() {
		return slotsSata;
	}
	public void setSlotsSata(int slotsSata) {
		this.slotsSata = slotsSata;
	}
	
	public int getPines() {
		return pines;
	}
	public void setPines(int pines) {
		this.pines = pines;
	}
	
	
	public static String getClavija() {
		return clavija;
	}
	
	
	
	@Override
	public String toString() {
		return "Fuente [slotsSata=" + slotsSata + ", gama=" + gama + ", pines=" + pines + ", Nombre=" + getNombre()
				+ ",Voltaje=" + getVoltaje() + ", Precio=" + getPrecio() + ", Marca=" + getMarca()	+ ", Clavija"+ getClavija()+"]";
	}
	
	
	
	
	
	
	
	
	
		


}

