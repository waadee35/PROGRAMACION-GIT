package Aleatorios;

public class MainAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] aleatorios =new double [10];
		
		System.out.println("Generando los n�meros aleatorios...");

		for(int i=0; i<10; i++) {			
			aleatorios [i]=Math.random();

			System.out.println("El n�mero aleatorio guardado en la posici�n es ["+i+"] = "+aleatorios[i]);
		}

	}

}

		
		
		
		
		
		
		


