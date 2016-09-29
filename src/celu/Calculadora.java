package celu;

public class Calculadora extends App {
private int tamanio;

	public Calculadora(int gastoDeBateria, int tamanio){
		super(gastoDeBateria);	
		this.tamanio=tamanio;
	}
	public int tamanio(){
		return tamanio;
			}
	public void cambiartamanio(int nuevoTamanio){
		tamanio=nuevoTamanio;
	}
	public String toString(){
    	return "calculadora";
    }

}


