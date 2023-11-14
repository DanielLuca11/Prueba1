package bbdd;

public class VehiculoGuerra {

	
	public VehiculoGuerra(int id, String nombre, int ataque, int defensa, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ataque = ataque;
		this.defensa = defensa;
		this.tipo = tipo;
	}
	private int id;
	private String nombre;
	private int ataque ;
	private int defensa;
	private String tipo;
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
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "VehiculoGuerra [id=" + id + ", nombre=" + nombre + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", tipo=" + tipo + ", getId()=" + getId() + ", getNombre()=" + getNombre() + ", getAtaque()="
				+ getAtaque() + ", getDefensa()=" + getDefensa() + ", getTipo()=" + getTipo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
