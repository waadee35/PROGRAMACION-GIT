package HerenciaEstudianteProfesor;

public class Profesor {

private String Despacho;
private String HorarioTutorias;
private String nombre;
	
	public Profesor(String nombre, String Despacho) {
		this.nombre = nombre;
		this.Despacho = Despacho;
	}
	
	public void getConsultas() {
		System.out.println(nombre +" imparte tutoria "+HorarioTutorias+" en la aula "+Despacho);
	}

	public String getDespacho() {
		return Despacho;
	}

	public void setDespacho(String Despacho) {
		this.Despacho = Despacho;
	}

	public String getHorarioTutorias() {
		return HorarioTutorias;
	}

	public void setHorarioTutorias(String HorarioTutorias) {
		this.HorarioTutorias = HorarioTutorias;
	}

	public void setEdad(int i) {
		
	}

}

