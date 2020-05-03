package EvaluableBiblioteca;

public class MainBiblioteca {

	public static void main(String[] args) {
		
		int prestados = 2;
		int i;
		Libros libro1 = new Libros(123, 1982, "Kubrik", true);
		Revista revista1 = new Revista(321, 2010, 1, true);
		Libros libro2 = new Libros(456, 1983, "Neruda", false);
		Revista revista2 = new Revista(654, 2011, 111, false);
		
		Publicacion[] publi1 = new Publicacion[2];
		publi1[0]=libro1;
		publi1[1]=revista1;
		Publicacion[] publi2 = new Publicacion[2];
		publi2[2]=libro2;
		publi2[3]=revista2;
		
		for(i = 0;i < prestados;i++) {
			System.out.println(publi1[i].toString());
			
			}
		
		for(i = 0;i < prestados;i++) {
			System.out.println(publi2[i].toString());
			}	
		
	}
}
