package proyectoHerenciaTransportar;

public class Coche extends Transporte {

   private String modelo;

    public Coche(double velocidad, String nombre, String modelo) {
	super(velocidad, nombre);
	this.modelo = modelo;
}
	public void mostrarMensaje() {
		
		System.out.println("Soy un medio de transporte");
		System.out.println("velocidad:"+velocidad+"Km/h"+"\n"+"nombre:"+nombre+"\n"+"modelo:"+modelo+"\n");
		}
   
}
