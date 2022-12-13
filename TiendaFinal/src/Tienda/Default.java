package Tienda;

public class Default extends Fuente {
	int porcentaje;
	double poder = super.getVoltaje();

	
	public Default(String nombre, double voltaje, long precio,String marca, String gama, int slotsSata, int pines) {
		super(nombre,  voltaje, precio, marca, gama, slotsSata, pines);
	}
	
	
	
	public void energia(int porcentaje, double poder) {
			poder=poder*0.8;
			super.setVoltaje(poder);
		
	}
	
}
