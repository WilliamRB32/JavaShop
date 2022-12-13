package Tienda;

public class Titanium extends Fuente {
	int porcentaje;
	double poder = super.getVoltaje();

	
	public Titanium(String nombre, double voltaje, long precio,String marca, String gama, int slotsSata, int pines) {
		super(nombre,  voltaje, precio, marca, gama, slotsSata, pines);
	}
	
	
	
	public void energia(int porcentaje, double poder) {
		if(porcentaje >10 && porcentaje <=20) {
			poder=poder*0.94;
			super.setVoltaje(poder);
		}if(porcentaje >20 && porcentaje <=50) {
			poder = poder*0.96;
			super.setVoltaje(poder);
		}if(porcentaje >50) {
			poder=poder*0.91;
			super.setVoltaje(poder);
		}if(porcentaje >0 && porcentaje <=10) {
			poder=poder*0.9;
			super.setVoltaje(poder);
		}
	}
	
}


