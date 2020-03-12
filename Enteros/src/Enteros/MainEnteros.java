package Enteros;

import java.util.Scanner;

public class MainEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] Enteros =new int [10];
		
		int contNegativo=0;
		int contPositivo=0;
		int Contador0=0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.println("Porfavor introduzca 10 números enteros:");
			Enteros[i]=teclado.nextInt();
		}
		for(int i=0; i<10; i++) {
			if(Enteros[i]<0) {
				contNegativo++;
		}
				if(Enteros[i]>0) {
					contPositivo++;
		}
					if(Enteros[i]==0) {
						Contador0 ++;
		}
			
		}
		
		System.out.println("Nº NEGATIVOS: "+contNegativo);
		System.out.println("Nº POSITIVOS: "+contPositivo);
		System.out.println("Nº DE 0´s: "+Contador0);
	}

}
