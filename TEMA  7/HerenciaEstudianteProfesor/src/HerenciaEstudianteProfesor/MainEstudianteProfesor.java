package HerenciaEstudianteProfesor;

public class MainEstudianteProfesor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e = new Estudiante("Wade", "1ºDAM", 8);
		e.setEdad(18);
		double[] notas = new double[7];
		notas[0] = 5;
		notas[1] = 9;
		notas[2] = 6.5;
		notas[3] = 7;
		notas[4] = 4;
		notas[5] = 9;
		notas[6] = 8
				;
		e.setNotas(notas);
		Coche c = new Coche();
		c.setMarca("Peugeot");
		c.setModelo("3008");
		c.setColor("Blanco");
		
		Profesor p = new Profesor("Juanan", "Aula Profesores");
		p.setEdad(39);
		
		p.setHorarioTutorias("Viernes de 11:00 a 12:00 am");
		
		Coche c1 = new Coche();
		
		c1.setMarca("Hyundai");
		
		c1.setModelo("i30");
		
		c1.setColor("Azul");
		
		System.out.println(e.getNombre() +" tiene de nota media "+e.getNotaMedia());
		p.getConsultas();
	}

}