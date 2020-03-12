package Sueldos;

import java.util.Scanner;

public class MainSueldos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] nombre=new String[10];
		int [] sueldo=new int[10];
		
		int sueldoMaximo = 0;
		int posicion=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca los nombres de los empleados porfavor.");
		
		for (int i=0; i<10; i++) {		
			System.out.println("Introduzca un nombre porfavor:");
			nombre[i]=teclado.next();
			System.out.println("Introduzca el sueldo porfavor:");
			sueldo[i]=teclado.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			if(sueldo[i]>sueldoMaximo) {
				posicion=i;
				sueldo[i]=sueldoMaximo;
				sueldoMaximo=sueldo[i];
			}
		}
		System.out.println("El sueldo mas alto es: "+sueldoMaximo+" y su nombre es: "+nombre[posicion]);
		
	}

}
