package proyectoHerenciaTransportar;

public class Transporte {
	
	protected double velocidad;
	protected String nombre;
	


	public Transporte(double velocidad, String nombre) {
		super();
		this.velocidad = velocidad;
		this.nombre = nombre;
	}

	/**
	 * @return the velocidad
	 */
	public double getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Transporte [velocidad=" + velocidad + ", nombre=" + nombre + "]";
	}
	
	

}
