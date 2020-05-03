/**
*
* @autor: Borja RuiZ Sarri�
* Ejercicio 2 Tema 8 � Interfaces
* �.
*/

package EvaluableBiblioteca;

public class Revista extends Publicacion{
	
	int numero;
	
	public Revista(int codigo,int A�opublicacion,int numero, boolean prestado) {
		super(codigo, A�opublicacion, prestado);
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
