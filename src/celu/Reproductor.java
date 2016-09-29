package celu;
import java.util.LinkedList;

public class Reproductor extends App  
{  
    private int multimedia;
    private int gastoPorMultimedia;
    private int pesoMax;
    private LinkedList <String> listaDeRep= new LinkedList<String>();
	public Reproductor(int gastoDeBateria,int multimedia,int gastoPorMultimedia, int pesoMax)
	{
	  super(gastoDeBateria);
	  this.multimedia=multimedia;
	  this.gastoPorMultimedia=gastoPorMultimedia;
	  this.pesoMax=pesoMax;
	}
	
	public void gastoPorCancion(int nuevoGastoPorMultimedia){
		gastoPorMultimedia=nuevoGastoPorMultimedia;
	}
	public int tamanio(){
	    if (gastoPorMultimedia*multimedia<pesoMax)
	    {return gastoPorMultimedia*multimedia;}
	    else {return pesoMax;}
	  }
	public void agregarMultimedia(String multimedia){
		listaDeRep.add(multimedia);
	}
	public int tamanio2(){
		if (listaDeRep.size()*gastoPorMultimedia<pesoMax){
			return listaDeRep.size()*gastoPorMultimedia;}
		else {return pesoMax;}
	}
     @Override
	public String toString(){
    	return "reproductor";
    }
	public void mostrarLista(){
	int x=listaDeRep.size();
	for (int i=0; i<x;i++)
	   System.out.println(listaDeRep.get(i));
	}

}
