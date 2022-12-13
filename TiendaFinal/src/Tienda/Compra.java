package Tienda;

import java.util.ArrayList;

public class Compra {

	
	ArrayList<Componentes> compraComponentes=new ArrayList<>();
	Computador pc = new Computador(null,null,null,null,null,null,null,null,null);
	
	
	
	public Computador getArmarComputador() {
		return pc;
	}
	public void setArmarComputador(Computador armarComputador) {
		this.pc = armarComputador;
	}
	public ArrayList<Componentes> getCompraComponentes() {
		return compraComponentes;
	}
	public void setCompraComponentes(ArrayList<Componentes> compraComponentes) {
		this.compraComponentes = compraComponentes;
	}
}
