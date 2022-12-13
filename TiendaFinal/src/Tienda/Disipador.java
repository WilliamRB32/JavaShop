package Tienda;

public abstract class Disipador extends Componentes{
	
	private String tipo;
	private String enchufe;
	
	
	
		public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getEnchufe() {
		return enchufe;
	}


	public void setEnchufe(String enchufe) {
		this.enchufe = enchufe;
	}
	
	public Disipador(String nombre, String enchufe, double voltaje, long precio, String marca, String tipo) {
		super.setMarca(marca);
		super.setPrecio(precio);
		super.setNombre(nombre);
		super.setVoltaje(voltaje);
		this.enchufe=enchufe;
		this.tipo=tipo;
		
		
	}


	@Override
	public String toString() {
		return "Disipador [Tipo=" + tipo + ", Enchufe=" + enchufe + "]";
	}
	
	
	
	public abstract double Enfriamiento();
	
	public void imprimirTipo() {
		System.out.println("Este es un Disipador.");
	}
	
	
	

}
//-------------------------------------------------------------------------------


//-------------------------------------------------------------------------------


