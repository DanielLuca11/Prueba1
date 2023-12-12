package proyectoMundoPc.mundopc;

public class Computadora {

	private final int idComputadora;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contarComputadoras;
	
	
	private Computadora () {
		this.idComputadora= ++Computadora.contarComputadoras;
	}


	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}


	/**
	 * @return the idComputadora
	 */
	public int getIdComputadora() {
		return idComputadora;
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
	 * @return the monitor
	 */
	public Monitor getMonitor() {
		return monitor;
	}


	/**
	 * @param monitor the monitor to set
	 */
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}


	/**
	 * @return the teclado
	 */
	public Teclado getTeclado() {
		return teclado;
	}


	/**
	 * @param teclado the teclado to set
	 */
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}


	/**
	 * @return the raton
	 */
	public Raton getRaton() {
		return raton;
	}


	/**
	 * @param raton the raton to set
	 */
	public void setRaton(Raton raton) {
		this.raton = raton;
	}


	@Override
	public String toString() {
		return "Computadora [idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor
				+ ", teclado=" + teclado + ", raton=" + raton + "]";
	}
	
	
	
}
