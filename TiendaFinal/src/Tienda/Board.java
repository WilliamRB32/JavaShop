package Tienda;

public class Board extends Componentes{
	
	
	
	public Board(String nombre, String marca, double voltaje, long precio,String enchufe, String ram, String chipset, int slotsRAM, int slotsSATA, int slotsM2, String frecuencia, String tamaño) {
		super.setMarca(marca);
		super.setPrecio(precio);
		super.setNombre(nombre);
		super.setVoltaje(voltaje);
		this.enchufe = enchufe;
		this.ram = ram;
		this.chipset = chipset;
		this.slotsRAM = slotsRAM;
		this.slotsSATA = slotsSATA;
		this.slotsM2 = slotsM2;
		this.frecuencia = frecuencia;
		this.tamaño=tamaño;
	}
	
	




	private String enchufe;
	private String ram;
	private String chipset;
	private int slotsRAM;
	private int slotsSATA;
	private int slotsM2;
	private String frecuencia;
	private String tamaño;
	
	
	public String getEnchufe() {
		return enchufe;
	}
	public void setEnchufe(String enchufe) {
		this.enchufe = enchufe;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getChipset() {
		return chipset;
	}
	public void setChipset(String chipset) {
		this.chipset = chipset;
	}
	public int getSlotsRAM() {
		return slotsRAM;
	}
	public void setSlotsRAM(int slotsRAM) {
		this.slotsRAM = slotsRAM;
	}
	public int getSlotsSATA() {
		return slotsSATA;
	}
	public void setSlotsSATA(int slotsSATA) {
		this.slotsSATA = slotsSATA;
	}
	public int getSlotsM2() {
		return slotsM2;
	}
	public void setSlotsM2(int slotsM2) {
		this.slotsM2 = slotsM2;
	}
	public String getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Board [Enchufes=" + enchufe + ", TipoRam=" + ram + ", Chipset=" + chipset + ", slotsRAM=" + slotsRAM
				+ ", slotsSATA=" + slotsSATA + ", slotsM2=" + slotsM2 + ", Frecuencia=" + frecuencia + ", Nombre="
				+ getNombre() + ", Voltaje=" + getVoltaje() + ", Precio()=" + getPrecio() + ", Marca="
				+ getMarca() +  "]";
	}
	
	public String tiempoEncendido(){
		double tiempo;
		tiempo =  Integer.parseInt(frecuencia) / super.getVoltaje();
		return String.valueOf(tiempo);

	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}


}


	
