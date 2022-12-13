package MainTienda;

import java.util.HashMap;

import Interfaz.iu;
import Tienda.AMD;

import Tienda.Board;

import Tienda.Bronze;

import Tienda.Case;
import Tienda.Compra;
import Tienda.Computador;

import Tienda.Default;

import Tienda.Gold;
import Tienda.HDD;
import Tienda.Intel;
import Tienda.Nvidia;
import Tienda.Platinum;

import Tienda.RAM;
import Tienda.SSD;
import Tienda.silver;

import Tienda.Titanium;
import Tienda.Vega;
import Tienda.aire;
import Tienda.liquida;


public class ControlTienda {

	public static void main(String[] args) {

				
				Compra c = new Compra();
				//---------------------------------------------------------------------------------------------
				HashMap<String, Board> Boards=new HashMap<String,Board>(); 
				
				Board Board1=new Board("ASUS A68HM-K","Asus 1",20,149000,"FM2+","DDR3","AMD A68H",2,4,0,"2133","MICRO ATX");
				Board Board2=new Board("MSI H110M","MSI 1",30,155000,"LGA 1151","DDR4","INTEL H110",2,4,0,"2113","MICRO ATX");
				Board Board3=new Board("GIGABYTE Z270P-D3","GIGABYTE",50,350000,"LGA 1151","DDR4","INTEL Z270",4,6,1,"3866","ATX");
				Board Board4=new Board("ASROCK B250","ASROCK",60,425000,"LGA 1151 v2","DDR4","INTEL B250",4,4,2,"2666","ATX");
				Board Board5=new Board("MSI B450M","MSI 2",70,479000,"AM4","DDR4","AMD B450",4,4,2,"2666","MICRO ATX");
				Board Board6=new Board("ASUS B365-PLUS","Asus 2",80,441000,"LGA 1151 v2","DDR4","INTEL B365",4,4,2,"2400","ATX");

				
				Boards.put(Board1.getMarca(),Board1); 
				Boards.put(Board2.getMarca(),Board2);
				Boards.put(Board3.getMarca(),Board3);
				Boards.put(Board4.getMarca(),Board4);
				Boards.put(Board5.getMarca(),Board5);
				Boards.put(Board6.getMarca(),Board6);
				
				//---------------------------------------------------------------------------------------------
				HashMap<String, AMD> AMDs =new HashMap<String,AMD>();
				AMD AMD1=new AMD("AMD A4-7300","FM2+",65,149000,120,"AMD A4",200,"3800",2,2);
				AMD AMD2=new AMD("AMD Ryzen 1500x","AM4",65,370000,120,"AMD 1500",250,"3700",4,8);
				AMD AMD3=new AMD("AMD Ryzen 3400G","AM4",65,590000,120,"AMD 3400",300,"4200",4,8);

				
				AMDs.put(AMD1.getMarca(),AMD1);
				AMDs.put(AMD2.getMarca(),AMD2);
				AMDs.put(AMD3.getMarca(),AMD3);

				
				HashMap<String, Intel> Intels =new HashMap<String,Intel>();

				Intel Intel1= new Intel("Intel G4400","LGA 1151 v2",54,180000,100,"Intel",150,"3300",2,2);
				Intel Intel2= new Intel("Intel I3-8350k","LGA 1151 v2",91,503000,140,"Intel I3",200,"4000",4,4);
				Intel Intel3= new Intel("Intel i5-9400","LGA 1151 v2",65,791000,110,"Intel I5",270,"4100",6,6);

				
				Intels.put(Intel1.getMarca(),Intel1);
				Intels.put(Intel2.getMarca(),Intel2);
				Intels.put(Intel3.getMarca(),Intel3);
			
				//---------------------------------------------------------------------------------------------
				HashMap<String, RAM> RAMs =new HashMap<String,RAM>();

				RAM RAM1=new RAM("Hyperx 10FB",1.5,148000,4,"Hyperx 1","DDR3","1866");
				RAM RAM2=new RAM("Samsung 0QH0",1.5,173000,8,"Samsung 1","DDR3","1866");
				RAM RAM3=new RAM("Samsung 3DB0",1.2,230000,8,"Samsung 2","DDR4","2133");
				RAM RAM4=new RAM("Samsung 0DB0",1.35,389000,16,"Samsung 3","DDR3","1600");
				RAM RAM5=new RAM("Hyperx 7PB3",1.35,560000,16,"Hyperx 2","DDR4","3666");
				RAM RAM6=new RAM("GODRAM 4L19",1.2,349000,16,"GODRAM","DDR4","2666");

				
				RAMs.put(RAM1.getMarca(),RAM1);
				RAMs.put(RAM2.getMarca(),RAM2);
				RAMs.put(RAM3.getMarca(),RAM3);
				RAMs.put(RAM4.getMarca(),RAM4);
				RAMs.put(RAM5.getMarca(),RAM5);
				RAMs.put(RAM6.getMarca(),RAM6);

				
				
				//---------------------------------------------------------------------------------------------
				HashMap<String, liquida> DisLiquida =new HashMap<String,liquida>();

				liquida DisLiquida1=new liquida("DeepCool Castle 280","FM2+, AM4, LGA 1151 v2",45,330000,"Deep Cool","Water Cooler","Glicol",200);
				liquida DisLiquida2=new liquida("ZalMyn CNPS9X","FM2+, AM4, LGA 1151 v2",30,200000,"Zal Myn","Water Cooler","Corriente",175);
				liquida DisLiquida3=new liquida("AeroCol Verko 2", "FM2+, LGA 1151 v2",25,125000,"AeroCol","Water Cooler","Destilada",150);
				
				DisLiquida.put(DisLiquida1.getMarca(),DisLiquida1);
				DisLiquida.put(DisLiquida2.getMarca(),DisLiquida2);
				DisLiquida.put(DisLiquida3.getMarca(),DisLiquida3);
				
				
				HashMap<String, aire> DisAire =new HashMap<String,aire>();

				aire DisAire1=new aire("CoolerMaster Air 8","FM2+, AM4, LGA 1151 v2",40,258000,"Cooler Master","Aire",15);
				aire DisAire2=new aire("DeepCool Maxx GTE", "FM2+, AM4, LGA 1151 v2",35,182000,"Deep Cool Maxx","Aire",10);
				aire DisAire3=new aire("DeepCool Ice 100","FM2+, LGA 1151 v2",30,91200,"Deep Cool Ice","Aire",8);

				DisAire.put(DisAire1.getMarca(),DisAire1);
				DisAire.put(DisAire2.getMarca(),DisAire2);
				DisAire.put(DisAire3.getMarca(),DisAire3);

				//---------------------------------------------------------------------------------------------
				HashMap<String, Nvidia> Nvidias =new HashMap<String,Nvidia>();

				Nvidia Nvidia1=new Nvidia("GIGABYTE GTX 750Ti",65,400000,2,0,"GDDR5 1","1252","GIGABYTE 1");
				Nvidia Nvidia2=new Nvidia("ASUS GTX 1050",70,608000,3,0,"GDDR5 2","1442","ASUS");
				Nvidia Nvidia3=new Nvidia("GIGABYTE GTX 1070Ti", 90,1656000,8,8,"GDDR5 3","1632","GIGABYTE 2");

				Nvidias.put(Nvidia1.getMarca(),Nvidia1);
				Nvidias.put(Nvidia2.getMarca(),Nvidia2);
				Nvidias.put(Nvidia3.getMarca(),Nvidia3);
				
				HashMap<String, Vega> Vegas =new HashMap<String,Vega>();

				Vega Vega1 = new Vega("MSI RX 550",60,441000,4,0,"GDDR5 1","1203","MSI");
				Vega Vega2 = new Vega("ASUS RX 570",70,881000,4,8,"GDDR5 2","1266","ASUS");
				Vega Vega3 = new Vega("ASROCK RX 5700",120,1540000,8,16,"GDDR5 3","1765","ASROCK");

				Vegas.put(Vega1.getMarca(),Vega1);
				Vegas.put(Vega2.getMarca(),Vega2);
				Vegas.put(Vega3.getMarca(),Vega3);
				
				//---------------------------------------------------------------------------------------------
				HashMap<String, SSD> SSDs =new HashMap<String,SSD>();

				SSD SSD1=new SSD("DW GREEN DWS240",2,330000,"DW",8,240);
				SSD SSD2=new SSD("Hyperx A400",1.7,163000,"Hyperx",5,120);
				SSD SSD3=new SSD("SAMSUNG 860 HDT",2.1,1140000,"Samsung",6,2000);
				
				SSDs.put(SSD1.getMarca(),SSD1);
				SSDs.put(SSD2.getMarca(),SSD2);
				SSDs.put(SSD3.getMarca(),SSD3);

				HashMap<String, HDD> HDDs =new HashMap<String,HDD>();

				HDD HDD1=new HDD("SGATE ST2000",1.7,330000,"SGate 1",6,2000,7200);
				HDD HDD2=new HDD("DW Blue WD10",1.5,258000,"DW",7,1000,7200);
				HDD HDD3=new HDD("SGATE ST500",1.3,220000,"SGate 2",8,500,7200);
				
				HDDs.put(HDD1.getMarca(),HDD1);
				HDDs.put(HDD2.getMarca(),HDD2);
				HDDs.put(HDD3.getMarca(),HDD3);

				//---------------------------------------------------------------------------------------------
				HashMap<String, Case> Cases =new HashMap<String,Case>();

				Case Case1=new Case("Cooler Master 1","CoolerMaster MB500",239000,"MicroATX, ATX");
				Case Case2=new Case("Deep Cool","DeepCool Tesseract BF",201000,"MicroATX, ATX");
				Case Case3=new Case("Cooler Master 2","CoolerMaster Lite 5",254000,"MicroATX, ATX");
				Case Case4=new Case("Cooler Master 3","CoolerMaster Elite 350",304000,"MicroATX, ATX");
				Case Case5=new Case("Cooler Master 4","CoolerMaster SL600M",551000,"MicroATX, ATX");
				Case Case6=new Case("Cooler Master 5","CoolerMaster MB530P",478000,"MicroATX, ATX");
				
				Cases.put(Case1.getMarca(),Case1);
				Cases.put(Case2.getMarca(),Case2);
				Cases.put(Case3.getMarca(),Case3);
				Cases.put(Case4.getMarca(),Case4);
				Cases.put(Case5.getMarca(),Case5);
				Cases.put(Case6.getMarca(),Case6);

				
				//---------------------------------------------------------------------------------------------
				HashMap<String, Default> Defaults =new HashMap<String,Default>();

				Default Default1 =new Default("AeroCool VX 400W",400,114000,"AeroCool","PLUS",2,0);
				
				Defaults.put(Default1.getMarca(),Default1);

				
				
				HashMap<String, Bronze> Bronzes =new HashMap<String,Bronze>();

				Bronze Bronze1 =new Bronze("AeroCool VS 500",500,163000,"AeroCool","Bronze",3,1);
				
				Bronzes.put(Bronze1.getMarca(),Bronze1);


				
				HashMap<String, silver> Silvers =new HashMap<String,silver>();

				silver Silver1 =new silver("DeepCool DN500",500,254000,"DeepCool","Silver",5,1);
				
				Silvers.put(Silver1.getMarca(),Silver1);


				
				HashMap<String, Gold> Golds =new HashMap<String,Gold>();

				Gold Gold1 =new Gold("Cooler Master v3",600,311000,"Cooler Master","Gold",6,2);
				
				Golds.put(Gold1.getMarca(),Gold1);


				
				HashMap<String, Platinum> Platinums =new HashMap<String,Platinum>();

				Platinum Platinum1 =new Platinum("AeroCool KCAS 650G",650,368000,"AeroCool","Platinum",6,2);
				
				Platinums.put(Platinum1.getMarca(),Platinum1);


				
				HashMap<String, Titanium> Titaniums =new HashMap<String,Titanium>();

				Titanium Titanium1 =new Titanium("ZALMUN ZM850",850,589000,"ZalMun","Titanium",6,4);
				
				Titaniums.put(Titanium1.getMarca(),Titanium1);

				
				HashMap<String, Computador> Computadores = new HashMap<String,Computador>();
                Computador Computador1=new Computador(Board1,AMD1,RAM1,Nvidia2,HDD2,Default1,DisAire3,Case2,"Combo 7300");
                Computador Computador2=new Computador(Board2,Intel1,RAM2,Nvidia3,HDD1,Gold1,DisAire2,Case1,"Combo G4400");
                Computador Computador3=new Computador(Board4,Intel2,RAM4,Vega1,SSD1,Bronze1,DisAire1,Case4,"Combo 8350K");
                Computador Computador4=new Computador(Board3,Intel3,RAM3,Vega2,SSD2,Platinum1,DisLiquida1,Case3,"Combo 9400");
                Computador Computador5=new Computador(Board5,AMD2,RAM5,Vega3,HDD3,Silver1,DisLiquida2,Case5,"Combo RYZEN 1500x");
                Computador Computador6=new Computador(Board6,AMD3,RAM6,Nvidia3,SSD3,Titanium1,DisLiquida3,Case6,"Combo RYZEN 3400G");


                Computadores.put(Computador1.getNombre(),Computador1);
                Computadores.put(Computador2.getNombre(),Computador2);
                Computadores.put(Computador3.getNombre(),Computador3);
                Computadores.put(Computador4.getNombre(),Computador4);
                Computadores.put(Computador5.getNombre(),Computador5);
                Computadores.put(Computador6.getNombre(),Computador6);
				
				
				
				
				iu.saludar(Boards,c,AMDs,Intels,RAMs,DisLiquida,DisAire,Nvidias,Vegas,SSDs,HDDs,Cases,Defaults,Bronzes,Silvers,Golds,Platinums,Titaniums,Computadores);

			
			
				
			
			
			
		}
		

	}


