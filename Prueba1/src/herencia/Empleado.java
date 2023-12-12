package herencia;

public class Empleado extends Persona{
  
	private int idEmpleado;
	private double sueldo ;
	private static int contadorEmpleado;
	
	
	public Empleado(String nombre, double sueldo) {
		super(nombre);
		this.idEmpleado = ++Empleado.contadorEmpleado;
		this.sueldo = sueldo;
	}


	/**
	 * @return the idEmpleado
	 */
	public int getIdEmpleado() {
		return idEmpleado;
	}

	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}


	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=");
		builder.append(this.idEmpleado);
		builder.append(", sueldo=");
		builder.append(this.sueldo);
		builder.append(",").append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	

	
	
	
}
