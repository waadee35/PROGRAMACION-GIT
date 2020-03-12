/*Borja Ruiz*/

package MediaNotas;

import java.util.Scanner;

public class MainMediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner teclado = new Scanner (System.in);	

	int i ;
	int sum = 0;
	int mediaNotas=0;
	int cont = 0;
	
	int notas [] = new int [10];
	
	System.out.println("Lectura de las notas");
	
	for ( i= 0; i < notas.length; i ++) {
		
		System.out.println("Introduzca las notas [" + i + "]");
		notas [i] = teclado.nextInt();	
	}
	
	for ( i = 0; i < notas.length; i ++) {
		sum = sum +  notas [i];
		cont ++;
		
	}
		mediaNotas = sum/ cont;
		System.out.println(" La media de las notas es " + mediaNotas);
	
		for (i = 0; i < notas.length; i ++) {
			
			if ( notas [i]  > mediaNotas) {
				System.out.println(" La media de las notas superiores es " +  notas [i]);
			}
			
			
		}
	}

} 
