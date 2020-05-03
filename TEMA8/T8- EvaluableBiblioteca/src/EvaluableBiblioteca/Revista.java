/**
*
* @autor: Borja RuiZ Sarrió
* Ejercicio 2 Tema 8 – Interfaces
* ….
*/

package EvaluableBiblioteca;

public class Revista extends Publicacion{
	
	int numero;
	
	public Revista(int codigo,int Añopublicacion,int numero, boolean prestado) {
		super(codigo, Añopublicacion, prestado);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override public String toString() {
		String publi = super.toString();
		publi = publi + "Numero: "+numero;
		return publi ;
	}
	

}
