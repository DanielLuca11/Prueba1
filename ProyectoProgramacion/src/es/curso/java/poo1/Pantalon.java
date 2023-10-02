package es.curso.java.poo1;

public class Pantalon {
	
	private long id;
	private String color;
	private String talla;
	private String precio;
	private String boton;
	
	
	public Pantalon(long id, String color, String talla, String precio, String boton) {
		super();
		this.id = id;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.boton = boton;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getTalla() {
		return talla;
	}


	public void setTalla(String talla) {
		this.talla = talla;
	}


	public String getPrecio() {
		return precio;
	}


	public void setPrecio(String precio) {
		this.precio = precio;
	}


	public String getBoton() {
		return boton;
	}


	public void setBoton(String boton) {
		this.boton = boton;
	}
	
	
	
}
