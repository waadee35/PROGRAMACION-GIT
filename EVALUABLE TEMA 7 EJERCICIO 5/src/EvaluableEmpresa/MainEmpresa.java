package EvaluableEmpresa;

public class MainEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		/* ARRAYS DE LOS 5 PRODUCTOS VENDIDOS*/
		
		Producto producto1 = new Producto ("Balón", 2);
		Producto producto2 = new Producto ("Limón", 10);
		Perecedero producto3 = new Perecedero ("Brick de Leche", 4, 4, 7);
		Perecedero producto4 = new Perecedero ("Huevos", 3 , 20, 8);
		NoPerecedero producto5 = new NoPerecedero ("Lentejas",5, 1 );
		
		Producto[] productosSeleccionados = new Producto[5];
		productosSeleccionados[0] = producto1;
		productosSeleccionados[1] = producto2;
		productosSeleccionados[2] = producto3;
		productosSeleccionados[3] = producto4;
		productosSeleccionados[4] = producto5;
		
		
		for ( i = 0; i < 5; i ++) {
			System.out.println(productosSeleccionados[i].calcular(i));
		}
	}

}
