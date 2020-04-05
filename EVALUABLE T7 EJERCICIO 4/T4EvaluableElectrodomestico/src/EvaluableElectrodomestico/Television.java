/**
* @autor: Borja Ruiz Sarri�
* Ejercicio 4 Tema 7 � Herencia
*/

package EvaluableElectrodomestico;

public class Television extends Electrodomestico{
	
	int resoluci�n;
	
	boolean smartTV;
	
/*Constructor por defecto*/
	
public Television() {
	super();
	
	resoluci�n = 20;
	
	smartTV = false;
}
		
/*Constructor con parametros precioBase y peso*/

public Television(int precioBase, int peso) {
	super(precioBase, peso);
	
	resoluci�n = 20;
	
	smartTV = false;
}
		
/*Constructor con todos los parametros*/

public Television (int precioBase, String color, int peso, char consumoEnergetico, int resoluci�n, boolean smartTV) {
	super();
	
	this.resoluci�n = resoluci�n;
	
	this.smartTV = smartTV;
}
		
/*Getters y Setters*/

public float getResolucion() {
	return resoluci�n;
}

public void setResolucion(int resolucion) {
	this.resoluci�n = resoluci�n;
}

public boolean isSmartTV() {
			return smartTV;
}

public void setSmartTV(boolean smartTV) {
	this.smartTV = smartTV;
}

/*M�todo precioFinal() */

@Override public double precioFinal() {
	
	double precio = super.precioFinal();
	
		if (resoluci�n >= 40) {
			
			 precio = precio*1.30;
}
		if (smartTV == true) {
			
			precio =+ 50;
}
		return precio;
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
