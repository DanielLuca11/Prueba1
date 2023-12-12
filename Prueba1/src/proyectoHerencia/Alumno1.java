package proyectoHerencia;

public class Alumno1 extends Persona{
	
	private int matricula;

	public Alumno1(String nombre, String apellido, String domicilio,
			int edad,int matricula) {
		super(nombre, apellido, domicilio, edad);
		this.matricula = matricula;
		
		
		
	}

	/**
	 * @return the matricula
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void mostrarDatos () {
		
		System.out.println("nombre:"+nombre+"\n"+"apellido:"+apellido+"\n"+"domicilio:"
		+domicilio+"\n"+"edad:"+edad+"\n"+"matricula:"+matricula);
		
		
	}
	

}
