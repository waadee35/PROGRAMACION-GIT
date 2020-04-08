/**
*
* @autor: Borja Ruiz Sarrió
* Ejercicio 5 Tema 7 – Herencia
*/

package EvaluableEmpresa;

public class Perecedero extends Producto{
	
	int diasAcaducar;
	
	double averageMark; /* = calificación media del producto */
	
	/* Constructor x defecto */
	
	public Perecedero () {}
	
	
	/* Constructor parametrizado */
	
	public Perecedero (String nombre, float precio, int diasAcaducar, double averageMark) {
		
		super (nombre, precio);
		this.diasAcaducar = diasAcaducar;
		this.averageMark = averageMark;
	}
	
	/* GETTERS Y SETTERS*/

	public int getDiasAcaducar() {
		return diasAcaducar;
	}


	public void setDiasAcaducar(int diasAcaducar) {
		this.diasAcaducar = diasAcaducar;
	}


	public double getAverageMark() {
		return averageMark;
	}


	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}
	
	/* En Perecedero, aparte de lo que hace producto, el precio se reducirá
según los diasACaducar: */
	
	@Override public double calcular (int cantidad) {
		
		double totalDias = super.calcular(cantidad); 
		
		switch  (diasAcaducar) {
		case 1:
			totalDias = totalDias / 4;
			break;
			
		case 2:
			totalDias = totalDias/3;
	  		break;
	  	case 3:
	  		totalDias = totalDias/2;
	  		break;
		
		}
		return totalDias;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
