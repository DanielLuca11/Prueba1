package bbdd;

public class Guerrero {
	
	 public Guerrero(int id, String nombre, int fuerza, int resistencia, String vehiculo_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.vehiculo_id = vehiculo_id;
	}
	private int id ;
	 private String nombre ;
	 private int fuerza;
	 private int resistencia;
	 private String vehiculo_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	public String getVehiculo_id() {
		return vehiculo_id;
	}
	public void setVehiculo_id(String vehiculo_id) {
		this.vehiculo_id = vehiculo_id;
	}
	@Override
	public String toString() {
		return "Guerrero [id=" + id + ", nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", vehiculo_id=" + vehiculo_id + ", getId()=" + getId() + ", getNombre()=" + getNombre()
				+ ", getFuerza()=" + getFuerza() + ", getResistencia()=" + getResistencia() + ", getVehiculo_id()="
				+ getVehiculo_id() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	 
	 

}
