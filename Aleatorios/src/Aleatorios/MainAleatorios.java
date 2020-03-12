package Aleatorios;

public class MainAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] aleatorios =new double [10];
		
		System.out.println("Generando los números aleatorios...");

		for(int i=0; i<10; i++) {			
			aleatorios [i]=Math.random();

			System.out.println("El número aleatorio guardado en la posición es ["+i+"] = "+aleatorios[i]);
		}

	}

}

		
		
		
		
		
		
		


