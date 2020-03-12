package MediaT;

import java.util.Scanner;

public class MainMediaT {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		double media = 0.0;
		double sumapositivos = 0;
		double sumanegativos = 0;
		int pos=0;
		int neg=0;
		
		double temperatura [] = new double [10];

		for (int i = 0 ; i < temperatura.length; i++) {
			System.out.println("Introduzca la temperatura[" + i +"]");
				temperatura [i]= teclado.nextDouble();	
		}

		  for (int i = 0; i < 10; i++) {
	          if (temperatura[i] > 0){ 
	        	  sumapositivos += temperatura[i];
	              pos++;
	          } else if (temperatura[i] < 0){ 
	        	  sumanegativos += temperatura[i];
	              neg++;
		}
		}
		  
		     if (pos != 0) {
		            System.out.println("Media de los valores positivos: " + sumapositivos / pos);
		        } else {
		            System.out.println("No ha introducido numeros positivos");
		        }
		        if (neg != 0) {
		            System.out.println("Media de los valores negativos: " + sumanegativos / neg);
		        } else {
		            System.out.println("No ha introducido numeros negativos");
		        }
	}
	}
