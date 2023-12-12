package proyectoHerencia;

public class Persona {
	
	protected String nombre;
	protected String apellido;
	protected String domicilio;
	protected int edad;
	
	
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", edad=" + edad
				+ "]";
	}


	public Persona(String nombre, String apellido, String domicilio, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.edad = edad;
	}
	
	 
	
	

}
