package MediaP;

import java.util.Scanner;

public class MainMediaP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);

		double media = 0.0;
		int sumapares = 0 ;
		int sumaimpares = 0;
		int i;
		int par = 0;
		int impar = 0;
		double mediaPares = 0;
		double mediaImpares = 0;
		int[] numeros = new int [10];

		for ( i = 0 ; i < numeros.length; i++) {
		System.out.println("Introduzca los numeros [" + i +"]");
		numeros[i] = teclado.nextInt();
		}


		  for (i = 0; i < numeros.length; i++) {
	            if (i % 2 == 0){ 
	                mediaPares = mediaPares + numeros[i]; 
	                
	            	}else {
	            	mediaImpares = mediaImpares + numeros[i];  }
		  }
		  
		  System.out.println(" La media de los numeros pares es" + mediaPares);
		  System.out.println(" La media de los numeros impares es" + mediaImpares);
	}
	
}
	            
	            			

	

	


