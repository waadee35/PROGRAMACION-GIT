/**
* @autor: Borja Ruiz Sarrió
* Ejercicio 4 Tema 7 – Herencia
*/

package EvaluableElectrodomestico;

public class Electrodomestico {
	
	protected int precioBase;	
	
	protected String color ;
	
	protected int peso;
	
	protected char consumoEnergetico;
	
/*Constructor por defecto*/
	
public Electrodomestico () {
	
	precioBase = 100;
	color = "blanco";
	peso = 5;
	consumoEnergetico = 'F';
}

/*Constructor parametrizado*/

public Electrodomestico (int precioBase, String color, int peso, char consumoEnergetico) {
	
	this.precioBase = 100;
	this.color = "blanco";
	this.peso = 5;
	this.consumoEnergetico = 'F' ;
	
}

/*Constructor por parametros de precioBase y peso*/

public Electrodomestico (int precioBase, int peso) {
	
	this.precioBase = precioBase;
	this.peso = peso;
}

/*Getters y Setters*/

public int getPrecioBase() {
	return precioBase;
}

public void setPrecioBase(int precioBase) {
	this.precioBase = precioBase;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getPeso() {
	return peso;
}

public void setPeso(int peso) {
	this.peso = peso;
}

public char getConsumoEnergetico() {
	return consumoEnergetico;
}

public void setConsumoEnergetico(char consumoEnergetico) {
	this.consumoEnergetico = consumoEnergetico;
}

/*Métodos comprobarConsumo, comprobarColor, precioFinal*/

private void comprobarConsumo(char letra) {
	
	if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
		consumoEnergetico = letra;
		
	}else consumoEnergetico = 'F';
	
}
	
private void comprobarColor(String color) {
	if (color == "blanco" || color == "negro" || color == "rojo" || color == "azul" || color == "gris") {
		color = color;
		
	}else this.color = "blanco";
}


public double precioFinal() {
    double precioFinal = this.precioBase;

    switch (consumoEnergetico) {
        case 'A':
            precioFinal += 100;
            break;
        case 'B':
            precioFinal += 80;
            break;
        case 'C':
            precioFinal += 60;
            break;
        case 'D':
            precioFinal += 50;
            break;
        case 'E':
            precioFinal += 30;
            break;
        case 'F':
            precioFinal += 10;
            break;
        default:
    }

    if (peso >= 0 && peso <= 19) {
        precioFinal += 10;
    }else if ( peso >= 20 && peso <= 49) {
        precioFinal += 50;
    }else if ( peso >= 50 && peso <=79 ) {
        precioFinal += 80;
    }else if ( peso >= 80 ){
        precioFinal += 100;
    }

    return precioFinal;
}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
