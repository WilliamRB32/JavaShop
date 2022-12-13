package Tienda;

public class Gold extends Fuente {
	int porcentaje;
	double poder = super.getVoltaje();

	
	public Gold(String nombre, double voltaje, long precio,String marca, String gama, int slotsSata, int pines) {
		super(nombre,  voltaje, precio, marca, gama, slotsSata, pines);
	}
	
	
	
	public void energia(int porcentaje, double poder) {
	if(porcentaje >10 && porcentaje <=20) {
		poder=poder*0.88;
		super.setVoltaje(poder);
	}if(porcentaje >20 && porcentaje <=50) {
		poder = poder*0.92;
		super.setVoltaje(poder);
	}if(porcentaje >50) {
		poder=poder*0.88;
		super.setVoltaje(poder);
	}
	}
	

}
