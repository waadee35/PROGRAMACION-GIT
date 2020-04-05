/**
* @autor: Borja Ruiz Sarrió
* Ejercicio 4 Tema 7 – Herencia
*/

package EvaluableElectrodomestico;

public class Television extends Electrodomestico{
	
	int resolución;
	
	boolean smartTV;
	
/*Constructor por defecto*/
	
public Television() {
	super();
	
	resolución = 20;
	
	smartTV = false;
}
		
/*Constructor con parametros precioBase y peso*/

public Television(int precioBase, int peso) {
	super(precioBase, peso);
	
	resolución = 20;
	
	smartTV = false;
}
		
/*Constructor con todos los parametros*/

public Television (int precioBase, String color, int peso, char consumoEnergetico, int resolución, boolean smartTV) {
	super();
	
	this.resolución = resolución;
	
	this.smartTV = smartTV;
}
		
/*Getters y Setters*/

public float getResolucion() {
	return resolución;
}

public void setResolucion(int resolucion) {
	this.resolución = resolución;
}

public boolean isSmartTV() {
			return smartTV;
}

public void setSmartTV(boolean smartTV) {
	this.smartTV = smartTV;
}

/*Método precioFinal() */

@Override public double precioFinal() {
	
	double precio = super.precioFinal();
	
		if (resolución >= 40) {
			
			 precio = precio*1.30;
}
		if (smartTV == true) {
			
			precio =+ 50;
}
		return precio;
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
