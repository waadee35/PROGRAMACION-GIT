/**
* @autor: Borja Ruiz Sarrió
* Ejercicio 4 Tema 7 – Herencia
*/

package EvaluableElectrodomestico;

public class Lavadora extends Electrodomestico{
	
	int carga;
	
/*Constructor por defecto*/
	
public Lavadora() {
	super();
	
	carga = 5;
}
	
/*Constructor por parametros de precioBase y peso*/

public Lavadora (int precioBase, int peso) {
	super(precioBase, peso);
	
	this.carga = 5;
}
		
/*Constructor  con la carga y el resto de atributos heredados*/

public Lavadora (int precioBase, String color, int peso, char consumoEnergetico, int carga) {
	super();
	
	this.carga = carga;
}
		
/*Getters y Setters*/

public float getCarga() {
	return carga;
}

public void setCarga(int carga) {
			this.carga = carga;
}
		
/*Método precioFinal()*/

@Override public double precioFinal() {
			double precio = super.precioFinal();
			if (carga >= 30) {
				precio += 50;
}
			
			return precio;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
