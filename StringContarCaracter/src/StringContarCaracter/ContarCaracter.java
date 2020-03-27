package StringContarCaracter;

import java.util.Scanner;

public class ContarCaracter {

	public static void main(String[] args) {
		
	 int pos, contador = 0;
		
	 Scanner entrada=new Scanner(System.in);
	 String cadena = entrada.nextLine();
	 char caracter = 0;
	    
        pos = cadena.indexOf(caracter); //Se busca la primera vez que aparece el carácter con el método indexOf
        while (pos != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            pos = cadena.indexOf(caracter, pos + 1); //se sigue buscando a partir de la posición siguiente a la encontrada
        }
   
	}
}