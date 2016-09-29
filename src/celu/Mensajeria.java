package celu;

public class Mensajeria extends App
{
		private int pesoBase;
	    private int conversaciones;
	    private int gastoPorConversacion;
	  
	    public Mensajeria(int gastoDeBateria,int conversaciones,int pesoBase, int gastoPorConversacion)
	    {
	    	super(gastoDeBateria);
	    	this.conversaciones = conversaciones;
	    	this.pesoBase=pesoBase;
	    	this.gastoPorConversacion=gastoPorConversacion;
	    	
	    }
	    public int tamanio(){
	    	return pesoBase + conversaciones*gastoPorConversacion;
	    }	  	 
	    @Override
	    public String toString(){
	    	return "mensajeria";
	    }	

	}

