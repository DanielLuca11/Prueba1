package ejerciciomapa.entities;

public class ClaseEquipo {
	
	private String nombre;
	private int numLigas;
	private boolean numChampion;
	
	
	@Override
	public String toString() {
		return "ClaseEquipo [nombre=" + nombre + ", numLigas=" + numLigas + ", numChampion=" + numChampion
				+ ", getNombre()=" + getNombre() + ", getNumLigas()=" + getNumLigas() + ", isNumChampion()="
				+ isNumChampion() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
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
	 * @return the numLigas
	 */
	public int getNumLigas() {
		return numLigas;
	}


	/**
	 * @param numLigas the numLigas to set
	 */
	public void setNumLigas(int numLigas) {
		this.numLigas = numLigas;
	}


	/**
	 * @return the numChampion
	 */
	public boolean isNumChampion() {
		return numChampion;
	}


	/**
	 * @param numChampion the numChampion to set
	 */
	public void setNumChampion(boolean numChampion) {
		this.numChampion = numChampion;
	}


	public ClaseEquipo(String nombre, int numLigas, boolean numChampion) {
		super();
		this.nombre = nombre;
		this.numLigas = numLigas;
		this.numChampion = numChampion;
	}
	
	
	
	
	}
