package StringContarPalabras;

import java.util.Scanner;

public class ContarPalabras {

	public static void main(String[] args) {
		
	    int contador = 1, pos;
	    Scanner entrada=new Scanner(System.in);
	    String frase=entrada.nextLine(); //eliminar los posibles espacios en blanco al principio y al final
	    if (frase.isEmpty()) { //si la cadena está vacía
	        contador = 0;
	    } else {
	                pos = frase.indexOf(" "); //se busca el primer espacio en blanco
	                while (pos != -1) { //mientras que se encuentre un espacio en blanco
	                           contador++; //se cuenta una palabra
	                           pos = frase.indexOf(" ", pos + 1); //se busca el siguiente espacio en blanco
	                }                                               //a continuación del actual
	    }
	}
}
			
