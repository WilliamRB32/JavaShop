package Tienda;

public class Computador {
	
	private Board board;
	private Procesador procesador;
	private RAM ram;
	private Grafica grafica;
	private DiscoDuro discoduro;
	private Fuente fuente;
	private Disipador disipador;
	private Case Case;
	private String nombre;
	private boolean Tieneboard = false;
	private boolean Tieneprocesador = false;
	private boolean Tienegrafica = false;
	private boolean Tieneram = false;
	private boolean Tienedisco = false;
	private boolean Tienefuente = false;
	private boolean Tienerefrigeracion = false;
	private boolean Tienecaja = false;
	private boolean Tienecompletar = false;
	
	
	

	public Computador(Board board, Procesador procesador, RAM ram, Grafica grafica, DiscoDuro discoduro, Fuente fuente, Disipador disipador, Case Case,String nombre) {
		this.board=board;
		this.Case=Case;
		this.discoduro=discoduro;
		this.disipador=disipador;
		this.fuente=fuente;
		this.grafica=grafica;
		this.procesador=procesador;
		this.ram=ram;
		this.nombre=nombre;
		
	}
	
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}



	public Procesador getProcesador() {
		return procesador;
	}
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}



	public RAM getRam() {
		return ram;
	}
	public void setRam(RAM ram) {
		this.ram = ram;
	}



	public Grafica getGrafica() {
		return grafica;
	}
	public void setGrafica(Grafica grafica) {
		this.grafica = grafica;
	}



	public DiscoDuro getDiscoduro() {
		return discoduro;
	}
	public void setDiscoduro(DiscoDuro discoduro) {
		this.discoduro = discoduro;
	}


	
	public Fuente getFuente() {
		return fuente;
	}
	public void setFuente(Fuente fuente) {
		this.fuente = fuente;
	}


	
	public Disipador getDisipador() {
		return disipador;
	}
	public void setDisipador(Disipador disipador) {
		this.disipador = disipador;
	}
	
	
	
	
	public Case getCase() {
		return Case;
	}
	public void setCase(Case case1) {
		Case = case1;
	}
	
	public boolean isTieneboard() {
		return Tieneboard;
	}



	public void setTieneboard(boolean tieneboard) {
		Tieneboard = tieneboard;
	}



	public boolean isTieneprocesador() {
		return Tieneprocesador;
	}



	public void setTieneprocesador(boolean tieneprocesador) {
		Tieneprocesador = tieneprocesador;
	}



	public boolean isTienegrafica() {
		return Tienegrafica;
	}



	public void setTienegrafica(boolean tienegrafica) {
		Tienegrafica = tienegrafica;
	}



	public boolean isTieneram() {
		return Tieneram;
	}



	public void setTieneram(boolean tieneram) {
		Tieneram = tieneram;
	}



	public boolean isTienedisco() {
		return Tienedisco;
	}



	public void setTienedisco(boolean tienedisco) {
		Tienedisco = tienedisco;
	}



	public boolean isTienefuente() {
		return Tienefuente;
	}



	public void setTienefuente(boolean tienefuente) {
		Tienefuente = tienefuente;
	}



	public boolean isTienerefrigeracion() {
		return Tienerefrigeracion;
	}



	public void setTienerefrigeracion(boolean tienerefrigeracion) {
		Tienerefrigeracion = tienerefrigeracion;
	}



	public boolean isTienecaja() {
		return Tienecaja;
	}



	public void setTienecaja(boolean tienecaja) {
		Tienecaja = tienecaja;
	}



	public boolean isTienecompletar() {
		return Tienecompletar;
	}



	public void setTienecompletar(boolean tienecompletar) {
		Tienecompletar = tienecompletar;
	}


	@Override
	public String toString() {
		return "Computador [board=" + board.getNombre() + ", procesador=" + procesador.getNombre() + ", ram=" + ram.getNombre() + ", grafica=" + grafica.getNombre()
				+ ", discoduro=" + discoduro.getNombre() + ", fuente=" + fuente.getNombre() + ", disipador=" + disipador.getNombre() + ", Case=" + Case.getNombre()
				+ "]";
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
