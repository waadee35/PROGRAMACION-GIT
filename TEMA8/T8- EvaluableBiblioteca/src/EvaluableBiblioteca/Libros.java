/**
*
* @autor: Borja RuiZ Sarri�
* Ejercicio 2 Tema 8 � Interfaces
* �.
*/

package EvaluableBiblioteca;

public class Libros extends Publicacion{
    
String autor;
	    
public Libros(int codigo,int A�opublicacion, String autor,boolean prestado) {
	super(codigo, A�opublicacion, prestado);
	this.autor = autor;
	 
}
	    
public String getAutor() {
	return autor;
}
 
public void setAutor(String autor) {
	this.autor = autor;
		}

@Override public String toString() {
	String publi = super.toString();
	publi = publi + "Autor: "+autor;
	return publi ;
}

		
	    
}
