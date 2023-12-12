package proyectoMundoPc.mundopc;

public class Monitor {
	
	private final int idMonitor;
    private String marca;
	private double tamanio;
	private static int contadorMonitores;
	
	private Monitor () {
		this.idMonitor = ++Monitor.contadorMonitores;
	}

	public Monitor(String marca, double tamanio) {
		this();
		this.marca = marca;
		this.tamanio = tamanio;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the tamanio
	 */
	public double getTamanio() {
		return tamanio;
	}

	/**
	 * @param tamanio the tamanio to set
	 */
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	/**
	 * @return the idMonitor
	 */
	public int getIdMonitor() {
		return idMonitor;
	}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + "]";
	}
	
	


	

}
