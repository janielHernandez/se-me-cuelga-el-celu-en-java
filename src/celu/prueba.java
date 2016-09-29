package celu;
public class prueba
{

	public static void main(String[] args)
	{
	 Celular s3mini=new Celular(100,1000);
	 Mensajeria whatsap = new Mensajeria(1, 2,40,5);
	 Reproductor mediaPlayer = new Reproductor(2, 30, 2, 50);
	 Calculadora calculadora = new Calculadora(0, 10);
	 	  	 	 	 
	 s3mini.apps.add(calculadora);
	 s3mini.apps.add(mediaPlayer);
	 s3mini.apps.add(whatsap);
	 s3mini.encenderAplicaciones();
	 s3mini.usar(3);
	 System.out.println(s3mini.memoriaRamEnUso());
		
	}

}
