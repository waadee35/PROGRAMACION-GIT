/**
* @autor: Borja Ruiz Sarrió
* Ejercicio 4 Tema 7 – Herencia
*/

package EvaluableElectrodomestico;

public class MainElectrodomestico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioElectrodomestico = 0;
		double precioLavadora = 0;
		double precioTelevisión = 0;
		
		//ELECTRODOMESTICOS
		Electrodomestico elec1 = new Electrodomestico();
		Electrodomestico elec2 = new Electrodomestico();
		Electrodomestico elec3 = new Electrodomestico();
		Electrodomestico elec4 = new Electrodomestico(300, 70);
		Electrodomestico elec5 = new Electrodomestico();
		Electrodomestico elec6 = new Electrodomestico();
		
		
		//LAVADORAS
		Lavadora lavadora7 = new Lavadora();
		Lavadora lavadora8 = new Lavadora(150, 90);
	
		//TELEVISIONES
		Television tele9 = new Television();
		Television tele10 = new Television(55, 25);
		
		Electrodomestico[] Electrodomesticos = new Electrodomestico[10];
		
		//ARRAY DE OBJETOS
		Electrodomesticos[0] = elec1;
		Electrodomesticos[1] = elec2;
		Electrodomesticos[2] = elec3;
		Electrodomesticos[3] = elec4;
		Electrodomesticos[4] = elec5;
		Electrodomesticos[5] = elec6;
		Electrodomesticos[6] = lavadora7;
		Electrodomesticos[7] = lavadora8;
		Electrodomesticos[8] = tele9;
		Electrodomesticos[9] = tele10;
		
		for (int i = 0;i < 10;i++) {
			System.out.println("Producto "+ (i+1));
			if (Electrodomesticos[i] instanceof Electrodomestico) {
				
				precioElectrodomestico = precioElectrodomestico + Electrodomesticos[i].precioFinal();
			}
			
			if (Electrodomesticos[i] instanceof Lavadora) {
				
				precioLavadora = precioLavadora + Electrodomesticos[i].precioFinal();
			}
			
			if (Electrodomesticos[i] instanceof Television) {
				
				precioTelevisión = precioTelevisión + Electrodomesticos[i].precioFinal();
			}
			
			System.out.println(Electrodomesticos[i].precioFinal());
		}
		System.out.println("El precio en total de los electrodomesticos es: "+precioElectrodomestico+ "€");
		System.out.println("El precio en total de las lavadoras es: "+precioLavadora+"€");
		System.out.println("El precio en total de las televisiones es: "+precioTelevisión+"€");
		
	}

}
