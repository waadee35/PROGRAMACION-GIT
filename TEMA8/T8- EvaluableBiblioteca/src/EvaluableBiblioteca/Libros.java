/**
*
* @autor: Borja RuiZ Sarrió
* Ejercicio 2 Tema 8 – Interfaces
* ….
*/

package EvaluableBiblioteca;

public class Libros extends Publicacion{
    
String autor;
	    
public Libros(int codigo,int Añopublicacion, String autor,boolean prestado) {
	super(codigo, Añopublicacion, prestado);
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
