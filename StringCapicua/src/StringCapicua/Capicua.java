package StringCapicua;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {

		  Scanner teclado = new Scanner(System.in);

		  String x = "anitalavalatina";
		    int s = x.length();
		    int z = s / 2;
		    char k;
		    char m;
		    int p=0;

		        for (int j = (s - 1); j>z && p<z ; j--) {

		            k = x.charAt(p);
		            m = x.charAt(j);

		      System.out.println(k+" "+m );   

		            if (k==m) {
		                System.out.println("Bien.");
		            }
		          p++;

		        	}
		     		}
			}
			