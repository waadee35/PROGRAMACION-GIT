package StringEliminarPalabra;

import java.util.Scanner;

public class EliminarPalabra {
	
	public static String main(String[] args) {
	
	 int pos = 0;
	 
	    Scanner entrada=new Scanner(System.in);
	    
	    String frase = entrada.nextLine();{
	    
	    if (pos != -1) {
	    	
	    frase = frase.substring(0, pos);
	    	 
	    }else {
	    	
	    	frase = ("");
	    }
	    return frase;
}
}
}
