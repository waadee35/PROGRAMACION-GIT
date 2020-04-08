/**
*
* @autor: Borja Ruiz Sarrió
* Ejercicio 5 Tema 7 – Herencia
*/

package EvaluableEmpresa;

public class NoPerecedero extends Producto {
	
	int tipo;
	
	/* Constructor x defecto */
	
	public NoPerecedero () {}
	
	/* Constructor parametrizado */
	
	public NoPerecedero (String nombre, float precio, int tipo) {
	
		super (nombre, precio);
		this.tipo = tipo;

	}
	
	/* GETTERS Y SETTERS*/

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	/*o En NoPerecedero , hace lo mismo que en Producto ( Calcular 9*/
		
	@Override public double calcular(int cantidad) {
		
		  double totalDias = super.calcular(cantidad);
		  
		  return totalDias;
	}
	
	
	
	
	
}
