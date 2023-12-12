package partePrimera;

public class Concatenar {
	
	public static void main (String args[]) {
		
		var usuario = "Juam";
		var titulo  = "Ingeniero";
		
		var union = titulo + " " + usuario;
		System.out.println("union = " + union);
	
	    var i = 3;
	    var j = 4;
	    
	
	    System.out.println(i+j); // se realiza la suma de variles que define los numeros
	    System.out.println(i+j+ usuario); //realiza la suma y luego la concatenacion.
	    System.out.println(usuario+" "+i+" "+j); // Si comienza con una String continua concatenando String
	    System.out.println(usuario +" " +(i+j));// realiza usuario y prioriza lo del parentesis suma .
	 
	}

}
