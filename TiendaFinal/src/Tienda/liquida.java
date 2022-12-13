package Tienda;

public class liquida extends Disipador{

	private String liquido;
	private int refrigeracion;
	
	public liquida(String nombre, String enchufe, double voltaje, long precio, String marca, String tipo, String liquido, int refrigeracion) {
		super(nombre, enchufe, voltaje, precio, marca, tipo);
		this.liquido=liquido;
		this.refrigeracion=refrigeracion;
		// TODO Auto-generated constructor stub
	}
	
	public double Enfriamiento() {
		double enfriamiento;
			
		if(liquido.equals("Corriente")) {
			enfriamiento=(this.getRefrigeracion()/super.getVoltaje())*1.2;

		}if(liquido.equals("Glicoles")) {
			enfriamiento=(this.getRefrigeracion()/super.getVoltaje())*1.4;

		}if(liquido.equals("Destilada")) {
			enfriamiento=(this.getRefrigeracion()/super.getVoltaje())*1.6;

		}else {
		enfriamiento=(this.getRefrigeracion()/super.getVoltaje());

		}
		
		return enfriamiento;

		}
	

	public String getLiquido() {
		return liquido;
	}

	public void setLiquido(String liquido) {
		this.liquido = liquido;
	}
	
	public void imprimirTipo() {
		System.out.println("Este es un disipador de liquido.");
	}

	public int getRefrigeracion() {
		return refrigeracion;
	}

	public void setRefrigeracion(int refrigeracion) {
		this.refrigeracion = refrigeracion;
	}

	
	
	
}