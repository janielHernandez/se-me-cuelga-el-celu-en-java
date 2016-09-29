package celu;

public abstract class App implements Tamanio 
{  
    protected int gastoDeBateria;
    protected boolean encendida=false;
 

	public App(int gastoDeBateria)
		{
			this.gastoDeBateria=gastoDeBateria;
			   }	
	public int gastoDeBateria(int minutos){
		return minutos*gastoDeBateria;
	}
	public int gastoDeBateria(){
		return gastoDeBateria;
	}
    public void encender(){
	    	encendida=true;
	    }
    public void apagar(){
    	encendida=false;
    }
    public Boolean estaEncendida(){
	    	return encendida;
	    }
    @Override
    public String toString(){
       return "Está aplicación gasta "+ this.gastoDeBateria()+"% de Bateria"; 
    
    }

	
}
