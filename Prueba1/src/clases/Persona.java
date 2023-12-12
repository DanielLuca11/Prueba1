package clases;

public class Persona {
	
	// Atributos de la clase 
	
	public String nombre ;
	public String apellido ;
	
	/**  Metodos podemos llamarles las veces qe hagan falta segun necesidades 
	 *   puedes recibir valores --> llamados argumentos
	 *   puedes regresar un valor --> valor de retorno 
	 * 
	 */
	
	public void  desplegarInformacion () {
		
		System.out.println("nombre : " + nombre);
		System.out.println("apellido : " + apellido);
		
	}
}
