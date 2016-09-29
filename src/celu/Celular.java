package celu;
import java.util.LinkedList;

public class Celular 
{
	 private int memoriaRam;
	 private int nivelBateria; 
	 public LinkedList <App> apps= new LinkedList<App>();
	 
			
	public Celular (int nivelBateria, int memoriaRam )
	{
	  this.nivelBateria= nivelBateria;
	  this.memoriaRam = memoriaRam;	  
	}
	public void encenderAplicaciones(){
	   int x=apps.size();
	   for (int i=0;x>i;i++){
		   apps.get(i).encender();
	   }
	}
	public void apagarAplicaciones(){
		 int x=apps.size();
		   for (int i=0;x-1>i;i++){
			   apps.get(i).apagar();
		   }
	}
	//public void actualizarUsoDeMemoria(int peso){
	//	memoriaRam-= peso;
	//	}
	public int memoriaRamEnUso(){
		 int x=apps.size();
		 int acum=0;
		  for (int i=0;x>i;i++){
			  if (apps.get(i).estaEncendida()){
			  acum += ((Tamanio)apps.get(i)).tamanio();
		   }
		  }
		  return acum;
	}
	public int memoriaRamLibre(){
		return memoriaRam - this.memoriaRamEnUso();
	}
	public void usar(int tiempo){
	  nivelBateria-= this.usoDeBateriaEn(tiempo);
	  memoriaRam-=this.memoriaRamEnUso();
	}
	public int nivelDeBateria(){
		return nivelBateria;
	}
	public int usoDeBateriaEn(int tiempo){
		int x=apps.size();
		int acum=0;
		for (int i=0; i<x; i++){
			acum += apps.get(i).gastoDeBateria(tiempo);
		}
		return acum;
	}
	@Override
	public String toString(){
		return "Este celular tiene " + memoriaRam + "MB de memoria RAM, su nivel de bateria es \n"+ nivelBateria + "% y tiene las sguientes aplicaciones: "+ apps;   
	}


	

}
