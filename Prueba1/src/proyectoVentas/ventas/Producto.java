package proyectoVentas.ventas;


public class Producto {
	
	private final int idProducto;
	private String nombre;
	private Double precio;
	private static int contadorProductos;
	
	/**
	 * 
	 */
	
	private Producto() {
		
		this.idProducto = ++Producto.contadorProductos;
		
	}

	public Producto(String nombre, Double precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;
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
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * @return the idProducto
	 */
	public int getIdProducto() {
		return idProducto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [idProducto=");
		builder.append(idProducto);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}


	

	
	
	
}
