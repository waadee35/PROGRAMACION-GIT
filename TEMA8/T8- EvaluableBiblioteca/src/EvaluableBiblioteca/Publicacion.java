/**
*
* @autor: Borja RuiZ Sarri�
* Ejercicio 2 Tema 8 � Interfaces
* �.
*/

package EvaluableBiblioteca;

public class Publicacion implements interfaz{

	int codigo;
	protected int A�opublicacion ;
	boolean prestado = false;

	public Publicacion(int codigo, int A�opublicacion, boolean prestado2) {

	this.codigo = codigo;
	this.A�opublicacion = A�opublicacion;
	}

	public int getCodigo() {
	return codigo;
	}

	public void setCodigo(int codigo) {
	this.codigo = codigo;
	}

	public int getA�opublicacion() {
	return A�opublicacion;
	}

	public void setA�opublicacion(int A�opublicacion) {
	this.A�opublicacion = A�opublicacion;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override public String toString() {
		String publi = "Codigo: " + codigo +" A�o de publicacion: " + A�opublicacion+ " Prestado: " + prestado;
		return publi ;
	}
	
	public void prestar() {
	}
	
	public void devolver() {
	}
	
	public boolean prestado() {
		return prestado;}
}
