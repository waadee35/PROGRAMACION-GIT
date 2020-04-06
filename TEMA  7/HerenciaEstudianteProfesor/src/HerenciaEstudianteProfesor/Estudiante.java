package HerenciaEstudianteProfesor;

public class Estudiante {
	
	private String curso;
	
	private int expediente;
	
	private String nombre;
	
	private double[] notas = new double[7];
			
	public Estudiante(String nombre, String Curso, int expediente) {
		this.setNombre(nombre);
		this.curso = Curso;
		this.expediente = expediente;
	}
	
	public int getNumExp() {
		return expediente;
	}
	
	public void setNumExp(int numExperiencia) {
		this.expediente = numExperiencia;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double getNotaMedia() {
		double media = 0;
		for (int contador = 0;contador < notas.length;contador++) {
			media = media + notas[contador];
		}
		media = media/7;
		return media;
	}

	public void setEdad(int i) {

		
	}

	

}
