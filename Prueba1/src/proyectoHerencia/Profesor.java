package proyectoHerencia;

public class Profesor extends Persona{
	
	private String cedula;
	

	public Profesor(String nombre, String apellido, String domicilio,
			int edad, String cedula) {
		super(nombre, apellido, domicilio, edad);
	    this.cedula = cedula;
		
		
	}


	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}


	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public void mostrarDatos1 () {
		
		
		System.out.println("nombre:"+nombre+"\n"+"apellido:"+apellido+"\n"+"domicilio:"
		+domicilio+"\n"+"edad:"+edad+"\n"+"cedula:"+cedula);
		
		
	}

}
