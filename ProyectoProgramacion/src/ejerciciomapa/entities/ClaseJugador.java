package ejerciciomapa.entities;

public class ClaseJugador {
	
	private String nombre;
	private int edad;
	private String posicion ;
	
	
	@Override
	public String toString() {
		return "ClaseJugador [nombre=" + nombre + ", edad=" + edad + ", posicion=" + posicion + ", getNombre()="
				+ getNombre() + ", getEdad()=" + getEdad() + ", getPosicion()=" + getPosicion() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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


	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * @return the posicion
	 */
	public String getPosicion() {
		return posicion;
	}


	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}


	public ClaseJugador(String nombre, int edad, String posicion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	

}
