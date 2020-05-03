/**
*
* @autor: Borja RuiZ Sarrió
* Ejercicio 2 Tema 8 – Interfaces
* ….
*/

package EvaluableBiblioteca;

public class Publicacion implements interfaz{

	int codigo;
	protected int Añopublicacion ;
	boolean prestado = false;

	public Publicacion(int codigo, int Añopublicacion, boolean prestado2) {

	this.codigo = codigo;
	this.Añopublicacion = Añopublicacion;
	}

	public int getCodigo() {
	return codigo;
	}

	public void setCodigo(int codigo) {
	this.codigo = codigo;
	}

	public int getAñopublicacion() {
	return Añopublicacion;
	}

	public void setAñopublicacion(int Añopublicacion) {
	this.Añopublicacion = Añopublicacion;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override public String toString() {
		String publi = "Codigo: " + codigo +" Año de publicacion: " + Añopublicacion+ " Prestado: " + prestado;
		return publi ;
	}
	
	public void prestar() {
	}
	
	public void devolver() {
	}
	
	public boolean prestado() {
		return prestado;}
}
