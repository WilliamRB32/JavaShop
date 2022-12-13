package Interfaz;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import Tienda.AMD;
import Tienda.Board;
import Tienda.Bronze;
import Tienda.Case;
import Tienda.Componentes;
import Tienda.Computador;
import Tienda.Default;
import Tienda.Gold;
import Tienda.Platinum;
import Tienda.RAM;
import Tienda.silver;
import Tienda.Titanium;
import Tienda.Compra;
import Tienda.liquida;
import Tienda.aire;
import Tienda.HDD;
import Tienda.SSD;
import Tienda.Vega;
import Tienda.Nvidia;

import Tienda.Intel;

public class iu {
	
	private static final HashMap<String, Computador> Computadores = null;
	private static final String Boards = null;
	static Scanner entrada=new Scanner(System.in);
	int procesador;
	int disipador;
	int grafica;
	int fuente;
	int ram;
	int board;
	int discoduro;
	int Case;
	
	final int componentes=10;
	
	
	
	
	
	//--------------------------------------------------------------------------------------------

	
	public static void saludar(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores){
		System.out.println("Bienvenido.");
		menuInicio(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			
	}
	
	//--------------------------------------------------------------------------------------------
	
	public static void menuInicio(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("   Como te podemos ayudar?");
		System.out.println("1. Deseo comprar un computador.");
		System.out.println("2. Deseo comprar un componente.");
		System.out.println("3. Salir");
		int respuesta1=entrada.nextInt();
		switch(respuesta1){
		case 1:
			menuCompraPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 2:
			menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 3:
			salir(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			System.out.println("SALIO EXITOSAMENTE"); // LEER EL COMPUTADOR QUE COMPRO Y LOS COMPONENTES QUE COMPRO.
			System.exit(1);		
			break;
	}	}
	
	

	

	

	public static void menuCompraPC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("1. Deseo armar mi equipo.");
		System.out.println("2. Deseo ver equipos listos.");
		System.out.println("3. Volver.");
		int respuesta2=entrada.nextInt();
		switch (respuesta2) {
		case 1:
			armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
			
		case 2:
			System.out.println("Listado de computadores listos");
			CompraPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
			
		case 3:
			menuInicio(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
			
		default:
			System.out.println("Opci�n invalida.");
	//		menuCompraPC();
			break;
		}
	}
	
	
	//--------------------------------------------------------------------------------------------

	

	public static void armarPC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("1. Tarjeta Madre.");
		System.out.println("2. Procesador.");
		System.out.println("3. Grafica.");
		System.out.println("4. RAM.");
		System.out.println("5. DiscoDuro.");
		System.out.println("6. Fuente.");
		System.out.println("7. Regriferaci�n..");
		System.out.println("8. Chasis.");
		System.out.println("9. Completar PC.");
		System.out.println("10. Volver.");
		
		
		int armarpc=entrada.nextInt();
		switch (armarpc) {
		case 1:
			if(c.getArmarComputador().isTieneboard() == false)
				boardPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
			else {
				System.out.println("El computador ya tiene una board asignada, desea cambiar la board ? (S/N o Si/No) ");
				String op = entrada.next();
				if(op.equals("Si") || op.equals("S") || op.equals("s") || op.equals("SI")) {
					 boardPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}else {
					
					armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
					
				}					
			}
			break;
		case 2:
			if(c.getArmarComputador().isTieneprocesador() == false)
				procesadorPC (Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
			else {
				System.out.println("El computador ya tiene un procesador asignado, desea cambiar el procesador ? (S/N o Si/No) ");
				String op = entrada.next();
				if(op.equals("Si") || op.equals("S") || op.equals("s") || op.equals("SI")) {
					procesadorPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}else {
					
					armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
					
				}
				
			}	
			break;
		case 3:
			if(c.getArmarComputador().isTienegrafica()==false)
			graficaPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
			else {
				System.out.println("El computador ya tiene una tarjeta grafica asignada, desea cambiarla ? (S/N o Si/No) ");
				String op = entrada.next();
				if(op.equals("Si") || op.equals("S") || op.equals("s") || op.equals("SI")) {
					graficaPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}else {
					
					armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
					
				}
				
			}
			break;
		case 4:
			if(c.getArmarComputador().isTieneram()==false)
			ramPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
			else {
				System.out.println("El computador ya tiene una RAM asignada, desea cambiarla ? (S/N o Si/No) ");
				String op = entrada.next();
				if(op.equals("Si") || op.equals("S") || op.equals("s") || op.equals("SI")) {
					ramPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}else {
					
					armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
					
				}
				
			}
			break;
		case 5:
			if(c.getArmarComputador().isTienedisco() == false)
			discoDuroPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
			else {
				System.out.println("El computador ya tiene un disco duro asignado, desea cambiarlo ? (S/N o Si/No): ");
				String op = entrada.next();
				if(op.equals("Si") || op.equals("S") || op.equals("s") || op.equals("SI")) {
					discoDuroPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}else {
					
					armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
					
				}
				
			}
			break;
		case 6:
			if(c.getArmarComputador().isTienefuente() == false)
			fuentePC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
			else {
				System.out.println("El computador ya tiene una fuente asignada, desea cambiarla ? (S/N o Si/No): ");
				String op = entrada.next();
				if(op.equals("Si") || op.equals("S") || op.equals("s") || op.equals("SI")) {
					fuentePC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}else {
					
					armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
					
				}				
			}
			break;
		case 7:
			if(c.getArmarComputador().isTienerefrigeracion() == false)
			refrigeracion(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
			else {
				System.out.println("El computador ya tiene una refrigeraci�n asignada, desea cambiarla ? (S/N o Si/No): ");
				String op = entrada.next();
				if(op.equals("Si") || op.equals("S") || op.equals("s") || op.equals("SI")) {
					refrigeracion(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}else {
					
					armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
					
				}					
			}
			break;
		case 8:
			if(c.getArmarComputador().isTienecaja() == false)
			cajaPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
			else {
				System.out.println("El computador ya tiene un Case asignado, desea cambiarlo ? (S/N o Si/No): ");
				String op = entrada.next();
				if(op.equals("Si") || op.equals("S") || op.equals("s") || op.equals("SI")) {
					cajaPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}else {
					
					armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
					
				}	
			}
			break;
		case 9:
			
			completarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
			break;
		case 10:
			menuCompraPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
			
		default:
			System.out.println("Opci�n inv�lida");
			armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);			
			break;
		}	
	}
	
	
		public static void boardPC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums) {
		System.out.println("Tenemos disponibilidad de las siguientes Tarjetas Madre.");
		Set<String>keys=Boards.keySet();
		int i=1;
		for(String key:keys) {
			Board B=Boards.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		
		i=1;
		System.out.println("Digite el n�mero de la board que le interese: ");
		int boards2 = entrada.nextInt();
		System.out.println(boards2);
		for(String key:keys){
			Board B=Boards.get(key);
			if(boards2 == i) {
				System.out.println("La board que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setBoard(B);
				c.getArmarComputador().setTieneboard(true);
				System.out.println("Se le asigno una board");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					boardPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}
			}
			i++;
		}
		
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	}
	

	public static void procesadorPC (HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums) {
		
		System.out.println("Que marca de procesador le interesa: ");
		System.out.println("1. INTEL ");
		System.out.println("2. AMD");
		System.out.println("3. Volver");
		int proc = entrada.nextInt();
		switch(proc) {
		case 1:
			intel(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
			break;
		case 2:
			Amdc(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
			break;
		case 3:
			armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		default:
			System.out.println("Opci�n inv�lida");
			armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);			
			break;	
		
		}
		
		
	}
	
	public static void intel (HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>Intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums) {
		System.out.println("Tenemos disponibilidad de los siguientes procesadores INTEL.");
		Set<String>keys=Intels.keySet();
		int i=1;
		for(String key:keys) {
			Intel B=Intels.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero del procesador que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Intel B=Intels.get(key);
			if(boards2 == i) {
				System.out.println("El procesador que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setProcesador(B);
				c.getArmarComputador().setTieneprocesador(true);
				System.out.println("El procesador fue asignado correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					intel(Boards,c,amds,Intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,Intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	}
	
	public static  void Amdc(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums) {
		System.out.println("Tenemos disponibilidad de los siguientes procesadores AMD.");
		Set<String>keys=amds.keySet();
		int i=1;
		for(String key:keys) {
			AMD B=amds.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero del procesador que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			AMD B=amds.get(key);
			if(boards2 == i) {
				System.out.println("El procesador que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setProcesador(B);
				c.getArmarComputador().setTieneprocesador(true);
				System.out.println("El procesador fue asignado correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					intel(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}
				
			}
			i++;
		}
	
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
		
	}
	private static void graficaPC(HashMap<String, Board> boards, Compra c, HashMap<String, AMD> amds,
			HashMap<String, Intel> intels, HashMap<String, RAM> rams, HashMap<String, liquida> liquidas,
			HashMap<String, aire> air, HashMap<String, Nvidia> nvidias, HashMap<String, Vega> vegas,
			HashMap<String, SSD> ssds, HashMap<String, HDD> hdds, HashMap<String, Tienda.Case> cases,
			HashMap<String, Default> defaults, HashMap<String, Bronze> bronzes, HashMap<String, silver> silvers,
			HashMap<String, Gold> golds, HashMap<String, Platinum> platinums, HashMap<String, Titanium> titaniums) {
		
		System.out.println("Que marca de Tarjeta grafica le interesa: ");
		System.out.println("1. Nvidia ");
		System.out.println("2. Vega");
		System.out.println("3. Volver");
		int proc = entrada.nextInt();
		switch(proc) {
		case 1:
			nvidia(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums);
			break;
		case 2:
			vega(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums);
			break;
		case 3:
			armarPC(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums,Computadores);
			break;
		default:
			System.out.println("Opci�n inv�lida");
			armarPC(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums,Computadores);			
			break;	
		
		}
		
		
	}

	

	private static void nvidia(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums) {
		System.out.println("Tenemos disponibilidad de las siguientes tarjetas Nvidia.");
		Set<String>keys=nvidias.keySet();
		int i=1;
		for(String key:keys) {
			Nvidia B= nvidias.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la grafica que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Nvidia B=nvidias.get(key);
			if(boards2 == i) {
				System.out.println("La grafica que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setGrafica(B);
				c.getArmarComputador().setTienegrafica(true);
				System.out.println("La grafica fue asignado correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					nvidia(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	}
	private static void vega(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums) {
		System.out.println("Tenemos disponibilidad de las siguientes tarjetas Vega.");
		Set<String>keys=Vegas.keySet();
		int i=1;
		for(String key:keys) {
			Vega B= Vegas.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero del procesador que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Vega B=Vegas.get(key);
			if(boards2 == i) {
				System.out.println("La grafica que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setGrafica(B);
				c.getArmarComputador().setTienegrafica(true);
				System.out.println("La grafica fue asignado correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					vega(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	}

	private static void ramPC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums) {
		System.out.println("Tenemos disponibilidad de las siguientes Rams.");
		Set<String>keys=rams.keySet();
		int i=1;
		for(String key:keys) {
			RAM B= rams.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la RAM que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			RAM B=rams.get(key);
			if(boards2 == i) {
				
				System.out.println("La RAM que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setRam(B);;
				c.getArmarComputador().setTieneram(true);
				System.out.println("La RAM fue asignado correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					ramPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	}
	
	private static void discoDuroPC(HashMap<String, Board> boards, Compra c, HashMap<String, AMD> amds,
			HashMap<String, Intel> intels, HashMap<String, RAM> rams, HashMap<String, liquida> liquidas,
			HashMap<String, aire> air, HashMap<String, Nvidia> nvidias, HashMap<String, Vega> vegas,
			HashMap<String, SSD> ssds, HashMap<String, HDD> hdds, HashMap<String, Tienda.Case> cases,
			HashMap<String, Default> defaults, HashMap<String, Bronze> bronzes, HashMap<String, silver> silvers,
			HashMap<String, Gold> golds, HashMap<String, Platinum> platinums, HashMap<String, Titanium> titaniums) {
		
		System.out.println("Que tipo de disco duro le interesa?: Digite una opcion: ");
		System.out.println("1. HDD ");
		System.out.println("2. SSD");
		System.out.println("3. Volver");
		int proc = entrada.nextInt();
		switch(proc) {
		
		case 1:
			hdd(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums);
			
			break;
		case 2:
			
			ssd(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums);
			
			break;
		case 3:
			armarPC(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums,Computadores);
			break;
		default:
			System.out.println("Opci�n inv�lida");
			discoDuroPC(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums);			
			break;	
		
		}
		
		
		
		
	}
	
	private static void hdd(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums) {
		System.out.println("Tenemos disponibilidad de los siguientes discos duros.");
		Set<String>keys=hdds.keySet();
		int i=1;
		for(String key:keys) {
			HDD B= hdds.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de disco que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			HDD B=hdds.get(key);
			if(boards2 == i) {
			System.out.println("El disco que quiere es: ");
			System.out.println(B.toString());
			int x = confirmacion();
			if(x==1) {
			c.getArmarComputador().setDiscoduro(B);
			c.getArmarComputador().setTienedisco(true);
			System.out.println("El disco fue asignado correctamente");
			}else {
				System.out.println("Vuelva a intentar la selecci�n");
				hdd(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
			}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	}


	private static void ssd(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums) {
		System.out.println("Tenemos disponibilidad de las siguientes unidades solidas.");
		Set<String>keys=ssds.keySet();
		int i=1;
		for(String key:keys) {
			SSD B= ssds.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero del SDD que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			SSD B=ssds.get(key);
			if(boards2 == i) {
				System.out.println("El disco que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setDiscoduro(B);
				c.getArmarComputador().setTienedisco(true);
				System.out.println("El disco fue asignado correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					hdd(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	}

	
	private static void fuentePC(HashMap<String, Board> boards, Compra c, HashMap<String, AMD> amds,
			HashMap<String, Intel> intels, HashMap<String, RAM> rams, HashMap<String, liquida> liquidas,
			HashMap<String, aire> air, HashMap<String, Nvidia> nvidias, HashMap<String, Vega> vegas,
			HashMap<String, SSD> ssds, HashMap<String, HDD> hdds, HashMap<String, Tienda.Case> cases,
			HashMap<String, Default> defaults, HashMap<String, Bronze> bronzes, HashMap<String, silver> silvers,
			HashMap<String, Gold> golds, HashMap<String, Platinum> platinums, HashMap<String, Titanium> titaniums) {
		
		System.out.println("Que tipo de fuente le interesa?: Digite una opcion: ");
		System.out.println("1. Default ");
		System.out.println("2. Bronze");
		System.out.println("3. Silver");
		System.out.println("4. Gold");
		System.out.println("5. Platinum");
		System.out.println("6. Titanium");
		System.out.println("7. Volver");
		int proc = entrada.nextInt();
		switch(proc) {
		
		case 1:
			
			default1(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums);
			
			break;
		case 2:
			
			bronze(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums);
			
			break;
		case 3:
			
			silver(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums);
			break;
		case 4:
			gold(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums);
			break;	
		case 5:
			platinum(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums);
			break;
		case 6:
			titanium(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums);	
			break;
			
		case 7:
			armarPC(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums,Computadores);
			break;
		default:
			System.out.println("Opci�n inv�lida");
			fuentePC(boards,c,amds,intels,rams,liquidas,air,nvidias,vegas,ssds,hdds,cases,defaults,bronzes,silvers,golds,platinums,titaniums);			
			break;	
		
		}
	}
	
	private static void default1(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums) {
		System.out.println("Tenemos disponibilidad de las siguientes fuentes default.");
		Set<String>keys=defaults.keySet();
		int i=1;
		for(String key:keys) {
			Default B= defaults.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la fuente default que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Default B=defaults.get(key);
			if(boards2 == i) {
				System.out.println("La fuente que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setFuente(B);
				c.getArmarComputador().setTienefuente(true);
				System.out.println("La fuente default fue asignada correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					fuentePC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	}
	private static void bronze(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums) {
		System.out.println("Tenemos disponibilidad de las siguientes fuentes Bronze.");
		Set<String>keys=bronzes.keySet();
		int i=1;
		for(String key:keys) {
			Bronze B= bronzes.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la fuente bronze que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Bronze B= bronzes.get(key);
			if(boards2 == i) {
				System.out.println("La fuente que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setFuente(B);
				c.getArmarComputador().setTienefuente(true);
				System.out.println("La fuente bronze fue asignada correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					fuentePC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	}
	
	private static void silver(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums) {
		System.out.println("Tenemos disponibilidad de las siguientes fuentes Silver.");
		Set<String>keys=silvers.keySet();
		int i=1;
		for(String key:keys) {
			silver B= silvers.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la fuente Silver que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			silver B= silvers.get(key);
			if(boards2 == i) {
				System.out.println("La fuente que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setFuente(B);
				c.getArmarComputador().setTienefuente(true);
				System.out.println("La fuente silver fue asignada correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					fuentePC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	}
	private static void gold(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums) {
		System.out.println("Tenemos disponibilidad de las siguientes fuentes Gold.");
		Set<String>keys=golds.keySet();
		int i=1;
		for(String key:keys) {
			Gold B= golds.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la fuente Gold que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Gold B= golds.get(key);
			if(boards2 == i) {
				System.out.println("La fuente que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setFuente(B);
				c.getArmarComputador().setTienefuente(true);
				System.out.println("La fuente gold fue asignada correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					fuentePC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
		
	}
	private static void platinum(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>platinums, HashMap<String,Titanium>Titaniums) {
		System.out.println("Tenemos disponibilidad de las siguientes fuentes Platinum.");
		Set<String>keys=platinums.keySet();
		int i=1;
		for(String key:keys) {
			Platinum B= platinums.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la fuente platinum que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Platinum B= platinums.get(key);
			if(boards2 == i) {
				System.out.println("La fuente que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setFuente(B);
				c.getArmarComputador().setTienefuente(true);
				System.out.println("La fuente platinum fue asignada correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					fuentePC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,platinums,Titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,platinums,Titaniums,Computadores);
		
	}
	private static void titanium(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>titaniums) {
		System.out.println("Tenemos disponibilidad de las siguientes fuentes Titanium.");
		Set<String>keys=titaniums.keySet();
		int i=1;
		for(String key:keys) {
			Titanium B= titaniums.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la fuente Titanium que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Titanium B= titaniums.get(key);
			if(boards2 == i) {
				System.out.println("La fuente que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setFuente(B);
				c.getArmarComputador().setTienefuente(true);
				System.out.println("La fuente titanium fue asignada correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					fuentePC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,titaniums,Computadores);
		
	}
	
	private static void refrigeracion(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>titaniums) {
	
		System.out.println("Que tipo de refrigeraci�n le interesa?: Digite una opcion: ");
		System.out.println("1. Liquida ");
		System.out.println("2. Aire");
		int proc = entrada.nextInt();
		switch(proc) {
		
		case 1: 
			Liquida(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,titaniums);
			break;
		case 2:
			Aire(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,titaniums);			
			break;
			
		default:
			System.out.println("Opci�n inv�lida");
			refrigeracion(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,titaniums);			
			break;	
		
		}
		
		
		
		
	}
	private static void Aire(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>titaniums) {
		System.out.println("Tenemos disponibilidad de las siguientes refrigeraciones de aire : ");
		Set<String>keys=air.keySet();
		int i=1;
		for(String key:keys) {
			aire B= air.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de refrigeraci�n que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			aire B= air.get(key);
			if(boards2 == i) {
				System.out.println("La refrigeraci�n que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setDisipador(B);;
				c.getArmarComputador().setTienerefrigeracion(true);
				System.out.println("La refrigeraci�n fue asignada correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					Aire(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,titaniums,Computadores);
		
		
	}

	private static void Liquida(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>titaniums) {
		System.out.println("Tenemos disponibilidad de las siguientes refrigeraciones liquidas: ");
		Set<String>keys=liquidas.keySet();
		int i=1;
		for(String key:keys) {
			liquida B= liquidas.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la refrigeraci�n que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			liquida B= liquidas.get(key);
			if(boards2 == i) {
				System.out.println("La refrigeraci�n que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setDisipador(B);
				c.getArmarComputador().setTienerefrigeracion(true);
				System.out.println("La refrigeraci�n fue asignada correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					Liquida(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,titaniums,Computadores);
		
		
	}
	

	private static void cajaPC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>titaniums) {
		System.out.println("Tenemos disponibilidad de los siguientes chasises: ");
		Set<String>keys=Cases.keySet();
		int i=1;
		for(String key:keys) {
			Case B= Cases.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero del chasis que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Case B= Cases.get(key);
			if(boards2 == i) {
				System.out.println("El chasis que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getArmarComputador().setCase(B);
				c.getArmarComputador().setTienecaja(true);
				System.out.println("El chasis fue asignado correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					cajaPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,titaniums,Computadores);
		
		
	}
	private static void completarPC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>titaniums) {
		int cont=0;
		System.out.println("A continuaci�n se mostrara un listado con los componentes que tiene y que le faltan a su computador: ");
		if(c.getArmarComputador().isTieneboard() == true ) {
			System.out.println("TARJETA MADRE: "+c.getArmarComputador().getBoard().getNombre());	
			cont++;
		}else {
			System.out.println("TARJETA MADRE: FALTA");
		}
		if(c.getArmarComputador().isTieneprocesador() == true ) {
			System.out.println("PROCESADOR: "+ c.getArmarComputador().getProcesador().getNombre());	
			cont++;
		}else {
			System.out.println("PROCESADOR: FALTA");
		}
		if(c.getArmarComputador().isTienegrafica()== true ) {
			System.out.println("TARJETA GRAFICA: " + c.getArmarComputador().getGrafica().getNombre());	
			cont++;
		}else {
			System.out.println("TARJETA GRAFICA: FALTA");
		}
		if(c.getArmarComputador().isTieneram() == true ) {
			System.out.println("RAM: "+c.getArmarComputador().getRam().getNombre());
			cont++;
		}else {
			System.out.println("RAM: FALTA");
		}
		if(c.getArmarComputador().isTienedisco() == true ) {
			System.out.println("DISCO DURO: "+c.getArmarComputador().getDiscoduro().getNombre());	
			cont++;
		}else {
			System.out.println("DISCO DURO: FALTA");
		}
		if(c.getArmarComputador().isTienefuente() == true ) {
			System.out.println("FUENTE: "+c.getArmarComputador().getFuente().getNombre());		
			cont++;
		}else {
			System.out.println("FUENTE: FALTA");
		}
		if(c.getArmarComputador().isTienerefrigeracion() == true ) {
			System.out.println("REFRIGERACION: "+c.getArmarComputador().getDisipador().getNombre());
			cont++;
		}else {
			System.out.println("REFRIGERACION: FALTA");
		}
		if(c.getArmarComputador().isTienecaja() == true ) {
			System.out.println("CASE: "+c.getArmarComputador().getCase().getNombre());	
			cont++;
		}else {
			System.out.println("CASE: FALTA");
		}
		
		if(cont == 8) {
		System.out.println("Su computador tiene las piezas completas, recuerde que puede cambiarlas en cualquier momento....");
		
		System.out.println("Presione ENTER para continuar....");
		Scanner kb = new Scanner(System.in);
		kb.nextLine();
		long precio=c.getArmarComputador().getBoard().getPrecio()+c.getArmarComputador().getProcesador().getPrecio()+c.getArmarComputador().getRam().getPrecio()+c.getArmarComputador().getGrafica().getPrecio()+c.getArmarComputador().getDiscoduro().getPrecio()+c.getArmarComputador().getFuente().getPrecio()+c.getArmarComputador().getDisipador().getPrecio()+c.getArmarComputador().getCase().getPrecio();
		System.out.println("El costo total de su equipo es de "+precio);
		int z=confirmacion();
		if(z==1) {
			System.out.println("Su pedido ha sido agendado, esperamos que el equipo sea de su agrado!.");
			System.out.println("�Esperamos verlo de nuevo!");
			salir(Boards, c, amds, intels, rams, liquidas, air, nvidias, Vegas, ssds, hdds, Cases, defaults, bronzes, silvers, golds, Platinums, titaniums, null);
		}else {armarPC(Boards, c, amds, intels, rams, liquidas, air, nvidias, Vegas, ssds, hdds, Cases, defaults, bronzes, silvers, golds, Platinums, titaniums, null);}
	}
	}
	
	private static int confirmacion() {
		boolean confi=false;
		int a=0;
		do {
		System.out.println("Confirme su selecci�n: ");
		System.out.println("1. Confirmar");
		System.out.println("2. Volver a seleccionar");
		a=entrada.nextInt();
		if(a == 1 || a == 2) {
			confi=true;
		}
		
		
		}while(confi==false);
		return a;
	}
	
	private static void CompraPC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> computadores2) {
		System.out.println("Tenemos disponibilidad de los siguientes chasises: ");
		Set<String>keys=computadores2.keySet();
		int i=1;
		for(String key:keys) {
			Computador B= computadores2.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero del chasis que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Computador B= computadores2.get(key);
			if(boards2 == i) {
				System.out.println("El chasis que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.setArmarComputador(B);
				System.out.println("EL COMPUTADOR FUE ASIGNADO CORRECTAMENTE, recuerde que puede editar las piezas en la opcion armar mi equipo  ");
				c.getArmarComputador().setTieneboard(true);
				c.getArmarComputador().setTieneprocesador(true);
				c.getArmarComputador().setTienegrafica(true);
				c.getArmarComputador().setTieneram(true);
				c.getArmarComputador().setTienedisco(true);
				c.getArmarComputador().setTienefuente(true);
				c.getArmarComputador().setTienerefrigeracion(true);
				c.getArmarComputador().setTienecaja(true);
				
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					CompraPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,computadores2);
				}
			}
			i++;
		}
		
		menuCompraPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,computadores2);
		
	}
	
	private static void menuCompraComponente(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("-------Menu Comprar Componente---------");
		System.out.println("1. Tarjeta Madre.");
		System.out.println("2. Procesador.");
		System.out.println("3. Grafica.");
		System.out.println("4. RAM.");
		System.out.println("5. DiscoDuro.");
		System.out.println("6. Fuente.");
		System.out.println("7. Regriferaci�n..");
		System.out.println("8. Volver.");
		System.out.println("El chasis esta unicamente a la venta con un computador");
		System.out.println("Digite el tipo de componente que desea comprar");
		
		int componentes=entrada.nextInt();
		
		switch(componentes) {
		
		case 1:
			comprarBoard(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 2:
			comprarProcesador(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 3:
			comprarGrafica(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;	
		case 4:
			comprarRam(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 5:
			comprarDiscoDuro(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 6:
			comprarFuente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 7:
			comprarRefrigeracion(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 8:		
			menuInicio(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
			
		default:
			System.out.println("Opci�n inv�lida");
			menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);			
			break;
		}
		
		
	
	}
	
	private static void comprarBoard(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de las siguientes Tarjetas Madre.");
		Set<String>keys=Boards.keySet();
		int i=1;
		for(String key:keys) {
			Board B=Boards.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la board que le interese: ");
		int boards2 = entrada.nextInt();
		System.out.println(boards2);
		for(String key:keys){
			Board B=Boards.get(key);
			if(boards2 == i) {
				System.out.println("La board que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);	
				System.out.println("Se a�adio una Board a el carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					comprarBoard(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
				}
			}
			i++;
		}
		
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			
	}
	
	
	private static void comprarProcesador(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
			
		System.out.println("Que marca de procesador le interesa: ");
		System.out.println("1. INTEL ");
		System.out.println("2. AMD");
		System.out.println("3. Volver");
		int proc = entrada.nextInt();
		switch(proc) {
		case 1:
			intelC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 2:
			AmdcC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 3:
			menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		default:
			System.out.println("Opci�n inv�lida");
			comprarProcesador(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);			
			break;	
		
		}
		
		
		
		
	}

	private static void intelC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		
		System.out.println("Tenemos disponibilidad de los siguientes procesadores INTEL.");
		Set<String>keys=intels.keySet();
		int i=1;
		for(String key:keys) {
			Intel B=intels.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero del procesador que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Intel B=intels.get(key);
			if(boards2 == i) {
				System.out.println("El procesador que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				
				System.out.println("El procesador fue a�adido al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					intelC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	
		
		
		
	}

	private static void AmdcC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de los siguientes procesadores INTEL.");
		Set<String>keys=amds.keySet();
		int i=1;
		for(String key:keys) {
			AMD B=amds.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero del procesador que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			AMD B=amds.get(key);
			if(boards2 == i) {
				System.out.println("El procesador que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				
				System.out.println("El procesador fue a�adido al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					AmdcC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	
		
		
	}

	private static void comprarGrafica(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Que marca de grafica le interesa: ");
		System.out.println("1. Nvidia ");
		System.out.println("2. Vega");
		System.out.println("3. Volver");
		int proc = entrada.nextInt();
		switch(proc) {
		case 1:
			nvidiaC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 2:
			vegaC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 3:
			menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		default:
			System.out.println("Opci�n inv�lida");
			comprarGrafica(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);			
			break;	
		
		}
		
	}
	private static void nvidiaC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de las siguientes graficas NVIDIA.");
		Set<String>keys=nvidias.keySet();
		int i=1;
		for(String key:keys) {
			Nvidia B= nvidias.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de tarjeta grafica que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Nvidia B=nvidias.get(key);
			if(boards2 == i) {
				System.out.println("La tarjeta grafica que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				
				System.out.println("La tarjeta grafica fue a�adido al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					nvidiaC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	
		
		
	}
	private static void vegaC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de las siguientes graficas VEGA.");
		Set<String>keys=Vegas.keySet();
		int i=1;
		for(String key:keys) {
			Vega B= Vegas.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de tarjeta grafica que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Vega B=Vegas.get(key);
			if(boards2 == i) {
				System.out.println("La tarjeta grafica que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				
				System.out.println("La tarjeta grafica fue a�adido al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					vegaC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	
		
	}

	

	private static void comprarRam(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de las siguientes RAM.");
		Set<String>keys=rams.keySet();
		int i=1;
		for(String key:keys) {
			RAM B= rams.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de RAM que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			RAM B=rams.get(key);
			if(boards2 == i) {
				System.out.println("La RAM que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				
				System.out.println("La RAM fue a�adido al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					comprarRam(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	
		
	}

	private static void comprarDiscoDuro(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Que tipo de disco duro le interesa: ");
		System.out.println("1. HDD ");
		System.out.println("2. SDD");
		System.out.println("3. Volver");
		int proc = entrada.nextInt();
		switch(proc) {
		case 1:
			hddC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 2:
			ssdC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 3:
			menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		default:
			System.out.println("Opci�n inv�lida");
						
			break;	
		
		}
		
		
	}

	private static void hddC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de los siguientes discos HDD.");
		Set<String>keys=hdds.keySet();
		int i=1;
		for(String key:keys) {
			HDD B= hdds.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de HDD que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			HDD B=hdds.get(key);
			if(boards2 == i) {
				System.out.println("El disco HDD que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				
				System.out.println("El HDD fue a�adido al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					hddC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	
		
	}

	private static void ssdC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de los siguientes discos SSD.");
		Set<String>keys=ssds.keySet();
		int i=1;
		for(String key:keys) {
			SSD B= ssds.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de SSD que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			SSD B=ssds.get(key);
			if(boards2 == i) {
				System.out.println("El disco SSD que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				
				System.out.println("El SSD fue a�adido al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					ssdC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	
		
	}

	private static void comprarFuente(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Que tipo de fuente le interesa?: Digite una opcion: ");
		System.out.println("1. Default ");
		System.out.println("2. Bronze");
		System.out.println("3. Silver");
		System.out.println("4. Gold");
		System.out.println("5. Platinum");
		System.out.println("6. Titanium");
		System.out.println("7. Volver");
		int proc = entrada.nextInt();
		switch(proc) {
		
		case 1:
			
			defaultC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);
			
			break;
		case 2:
			
			bronzeC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);
			
			break;
		case 3:
			
			silverC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);
			break;
		case 4:
			goldC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);
			break;	
		case 5:
			platinumC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);
			break;
		case 6:
			titaniumC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);	
			break;
			
		case 7:
			menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		default:
			System.out.println("Opci�n inv�lida");
			comprarFuente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);			
			break;	
		
		}
		
	}

	private static void defaultC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de las siguientes fuentes default.");
		Set<String>keys=defaults.keySet();
		int i=1;
		for(String key:keys) {
			Default B= defaults.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la fuente default que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Default B=defaults.get(key);
			if(boards2 == i) {
				System.out.println("La fuente que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				System.out.println("La fuente default fue asignada al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					defaultC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);

		
	}

	private static void bronzeC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de las siguientes fuentes Bronze.");
		Set<String>keys=bronzes.keySet();
		int i=1;
		for(String key:keys) {
			Bronze B= bronzes.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la fuente bronze que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Bronze B= bronzes.get(key);
			if(boards2 == i) {
				System.out.println("La fuente que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				System.out.println("La fuente bronze fue agregada al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					bronzeC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	
		
	}

	private static void silverC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de las siguientes fuentes Silver.");
		Set<String>keys=silvers.keySet();
		int i=1;
		for(String key:keys) {
			silver B= silvers.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la fuente Silver que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			silver B= silvers.get(key);
			if(boards2 == i) {
				System.out.println("La fuente que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				System.out.println("La fuente silver fue agregada al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					silverC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	

		
	}

	private static void goldC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de las siguientes fuentes Gold.");
		Set<String>keys=golds.keySet();
		int i=1;
		for(String key:keys) {
			Gold B= golds.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la fuente Gold que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Gold B= golds.get(key);
			if(boards2 == i) {
				System.out.println("La fuente que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				System.out.println("La fuente gold fue agregada al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					gold(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
	
		
	}

	private static void platinumC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de las siguientes fuentes Platinum.");
		Set<String>keys=Platinums.keySet();
		int i=1;
		for(String key:keys) {
			Platinum B= Platinums.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la fuente platinum que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Platinum B= Platinums.get(key);
			if(boards2 == i) {
				System.out.println("La fuente que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				System.out.println("La fuente platinum fue agregada al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					platinumC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
		
		
	}

	private static void titaniumC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de las siguientes fuentes Titanium.");
		Set<String>keys=Titaniums.keySet();
		int i=1;
		for(String key:keys) {
			Titanium B= Titaniums.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la fuente Titanium que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Titanium B= Titaniums.get(key);
			if(boards2 == i) {
				System.out.println("La fuente que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				System.out.println("La fuente titanium fue agregada al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					titaniumC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
		


		
	}

	private static void comprarRefrigeracion(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Que tipo de refrigeraci�n le interesa: ");
		System.out.println("1. Aire ");
		System.out.println("2. Liquida");
		System.out.println("3. Volver");
		int proc = entrada.nextInt();
		switch(proc) {
		case 1:
			aireC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 2:
			liquidaC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		case 3:
			menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
			break;
		default:
			System.out.println("Opci�n inv�lida");
						
			break;	
		
		}
		
	}

	private static void aireC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de las siguientes refrigeraciones de aire : ");
		Set<String>keys=air.keySet();
		int i=1;
		for(String key:keys) {
			aire B= air.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de refrigeraci�n que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			aire B= air.get(key);
			if(boards2 == i) {
				System.out.println("La refrigeraci�n que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				System.out.println("La refrigeraci�n fue agregada al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					aireC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
		
		
	}

	private static void liquidaC(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de las siguientes refrigeraciones liquidas: ");
		Set<String>keys=liquidas.keySet();
		int i=1;
		for(String key:keys) {
			liquida B= liquidas.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero de la refrigeraci�n que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			liquida B= liquidas.get(key);
			if(boards2 == i) {
				System.out.println("La refrigeraci�n que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				System.out.println("La refrigeraci�n agregada al carrito");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					liquidaC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums, Computadores);
				}
			}
			i++;
		}
		menuCompraComponente(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,Titaniums,Computadores);
		
		
	}

	/*private static void comprarCaja(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		System.out.println("Tenemos disponibilidad de los siguientes chasises: ");
		Set<String>keys=Cases.keySet();
		int i=1;
		for(String key:keys) {
			Case B= Cases.get(key);
			System.out.println(i+". "+B.getNombre());
			i++;
		}
		i=1;
		System.out.println("Digite el n�mero del chasis que le interese.");
		int boards2=entrada.nextInt();
		for(String key:keys){
			Case B= Cases.get(key);
			if(boards2 == i) {
				System.out.println("El chasis que quiere es: ");
				System.out.println(B.toString());
				int x = confirmacion();
				if(x==1) {
				c.getCompraComponentes().add(B);
				System.out.println("El chasis fue asignado correctamente");
				}else {
					System.out.println("Vuelva a intentar la selecci�n");
					cajaPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,titaniums);
				}
			}
			i++;
		}
		armarPC(Boards,c,amds,intels,rams,liquidas,air,nvidias,Vegas,ssds,hdds,Cases,defaults,bronzes,silvers,golds,Platinums,titaniums,Computadores);
		
		
		
	}*/

	private static void salir(HashMap<String, Board>Boards, Compra c, HashMap<String,AMD>amds, HashMap<String,Intel>intels, HashMap<String,RAM>rams, HashMap<String,liquida>liquidas, HashMap<String,aire>air, HashMap<String,Nvidia>nvidias, HashMap<String,Vega>Vegas, HashMap<String,SSD>ssds, HashMap<String,HDD>hdds, HashMap<String,Case>Cases, HashMap<String,Default>defaults, HashMap<String,Bronze>bronzes, HashMap<String,silver>silvers, HashMap<String,Gold>golds, HashMap<String, Platinum>Platinums, HashMap<String,Titanium>Titaniums,HashMap<String, Computador> Computadores) {
		final int iva=19;
		
		System.out.println("La compra realizada fue: ");
		System.out.println("-----------------Computador-----------------");
		
		if(c.getArmarComputador().isTieneboard() == true) {
		System.out.println("Tarjeta madre: "+c.getArmarComputador().getBoard().getNombre());
		System.out.println("marca: "+c.getArmarComputador().getBoard().getMarca());
		System.out.println("tiempo de encendido: "+c.getArmarComputador().getBoard().tiempoEncendido());
		System.out.println("--------------------------------------------");
		}
		if(c.getArmarComputador().isTieneprocesador() == true) {
			System.out.println("Procesador: "+c.getArmarComputador().getProcesador().getNombre());
			System.out.println("marca: "+c.getArmarComputador().getProcesador().getMarca());
			System.out.println("renderizado: "+c.getArmarComputador().getProcesador().getRender());
			System.out.println("--------------------------------------------");	
		}
		if(c.getArmarComputador().isTienegrafica() == true) {
			System.out.println("Grafica: "+c.getArmarComputador().getGrafica().getNombre());
			System.out.println("marca: "+c.getArmarComputador().getGrafica().getMarca());
			System.out.println("--------------------------------------------");
			
		}
		if(c.getArmarComputador().isTieneram() == true) {
			System.out.println("RAM: "+c.getArmarComputador().getRam().getNombre());
			System.out.println("Marca: "+c.getArmarComputador().getRam().getMarca());
			System.out.println("--------------------------------------------");
			
		}
		if(c.getArmarComputador().isTienedisco() == true) {
			System.out.println("Disco: "+c.getArmarComputador().getDiscoduro().getNombre());
			System.out.println("Marca: "+c.getArmarComputador().getDiscoduro().getMarca());
			System.out.println("Forma: "+c.getArmarComputador().getDiscoduro().getForma());
			System.out.println("--------------------------------------------");
		}
		if(c.getArmarComputador().isTienefuente() == true) {
			System.out.println("Fuente: "+c.getArmarComputador().getFuente().getNombre());
			System.out.println("marca: "+c.getArmarComputador().getFuente().getMarca());
			System.out.println("renderizado: "+c.getArmarComputador().getProcesador().getRender());
			System.out.println("--------------------------------------------");
		}
		if(c.getArmarComputador().isTienerefrigeracion() == true) {
			System.out.println("Tipo: "+c.getArmarComputador().getDisipador().getTipo());
			System.out.println("marca: "+c.getArmarComputador().getDisipador().getMarca());
			System.out.println("Metodo abstracto de enfriamiento: "+c.getArmarComputador().getDisipador().Enfriamiento());
			System.out.println("--------------------------------------------");
		}
		if(c.getArmarComputador().isTienecaja() == true) {
			System.out.println("Chasis: "+c.getArmarComputador().getCase().getNombre());
			System.out.println("marca: "+c.getArmarComputador().getCase().getMarca());
			System.out.println("--------------------------------------------");
			
		}
		
		System.out.println("-----Lista de componentes comprados-----");
		for(Componentes com:c.getCompraComponentes()) {
			
			System.out.println(com.getNombre());
			
		}
		
		
		
		System.out.println("-----Precio Total-----");
		long p = 0;
			for(Componentes com:c.getCompraComponentes()) {
			
				p=p+com.getPrecio();
			
		}
			p=p+c.getArmarComputador().getBoard().getPrecio()+c.getArmarComputador().getProcesador().getPrecio()+c.getArmarComputador().getRam().getPrecio()+c.getArmarComputador().getGrafica().getPrecio()+c.getArmarComputador().getDiscoduro().getPrecio()+c.getArmarComputador().getFuente().getPrecio()+c.getArmarComputador().getDisipador().getPrecio()+c.getArmarComputador().getCase().getPrecio();
			p=(p+p*(iva/100));
			
		System.out.println(p);		
		
		
	
	}

}