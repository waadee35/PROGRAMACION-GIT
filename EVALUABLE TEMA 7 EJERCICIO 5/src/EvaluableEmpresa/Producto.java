/**
*
* @autor: Borja Ruiz Sarrió
* Ejercicio 5 Tema 7 – Herencia
*/

package EvaluableEmpresa;

public class Producto {
	
	protected String nombre;
	
	protected float precio;
	
	/* Constructor x defecto */
	
	public Producto () {}
	
	
	/* Constructor parametrizado */
	
	public Producto (String nombre, float numero) {
		this.precio = precio;
		this.nombre = nombre;
	}

	/* GETTERS Y SETTERS*/
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	/* Método calcular */
	
	public double calcular (int cantidad) {
		
		double precioTotal = precio * cantidad;
		
		return precioTotal;
	}
	
	/* Método toString */
	
	public String toString ()  {
		
		String informacion = "Nombre Producto :  "+ nombre + precio ;
		return informacion;
	}
	
	
	
	

}
