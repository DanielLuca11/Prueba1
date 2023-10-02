package es.curso.java.poo3;


public class Supermercado {
	
	Producto producto1 = new Producto(1,"leche",2,"lacteos");
	Producto producto2 = new Producto(2,"leche",5,"proteinas");
	Producto producto3 = new Producto(3,"leche",3,"legumbres");
	
	Producto[] productoCarritos = {producto1,producto2,producto3};
	
	
	private String nombre;
	private Cajera [] cajeras;
	
	public Supermercado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public static void main(String[] args) {
		
		Supermercado supermercado = new Supermercado("Supermercado CFTIC");
		supermercado.abrirSupermercado();
		
	}
    public void abrirSupermercado() {
    	
    	//Creo las cajeras
    	
    			Cajera cajera1 = new Cajera(1,"Linea de Caja1");
    			Cajera cajera2 = new Cajera(2,"Linea de Caja2");
    			
    	//Creo los clientes
    	    	
    			Cliente cliente1 = new Cliente(11,"Dia", false);
    			Cliente cliente2 = new Cliente(22,"Mercadona", false);
    			Cliente cliente3 = new Cliente(22,"Ahorramas", false);
    }
	}
	
	

