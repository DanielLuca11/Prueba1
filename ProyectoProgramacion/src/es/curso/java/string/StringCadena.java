package es.curso.java.string;

import java.util.Scanner;

public class StringCadena {

	public static void main(String[] args) {
		
		

		//"       asdas@a sdas.es"
		// indicamos si el mail es correcto si cumple las siguientes validaciones .
		//Si no es correcto indicar los fallos que tiene .
		
		//Tiene una @
		//No contiene espacios en blanco despues de quitar los espacios en blanco a izda y dcha-
		//despues de la @tiene que haber al menos un punto .
		//El espacio entre la @ y el primer punto despues de esta tiene que ser al menos 2.
		//Despues del ultimo punto tiene que haber entre 2 y 6 caracteres .
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce mail ...");
		String email = scan.nextLine().trim();
		String mensajeError="";
		
		
		if (email.indexOf("@")!=email.lastIndexOf("@")|| email.indexOf("@")==-1){
		mensajeError="Debe tener una @";
		
        }        else        {
        	
        	
        	
        	
        if (email.contains(" ")){
        	mensajeError+="No puede tener espacios en blanco";
       
        }
        if (mensajeError.isEmpty()){
        	System.out.println("El email.. "+email+"  es correcto");
        }        else        {
        	System.out.println("El email.. "+email+"  es incorrecto");
        	System.out.println(mensajeError);
        }
        	
        }	
}
	
			
// expresiones que podemos usar 			
			
//	
//	String nombre1 = "Jose Luis";
//	String nombre2 = nombre1;
//	
//	nombre1 = nombre1.toUpperCase();
//	
//	System.out.println(nombre1);
//	System.out.println(nombre2);
//
//	System.out.println(nombre1.charAt(0));
//	
//	System.out.println(nombre1.concat(nombre2));
//	
//	String result = nombre1+"|"+nombre2+"|"+"Eva";
//	System.out.println(result);
//	
//	System.out.println(nombre1.toLowerCase().contains("se") );
//	
//	System.out.println(nombre1.endsWith(".txt"));
//	System.out.println(nombre1.startsWith("JO"));
//	
//	//"JOSE LUIS werwr"
//	System.out.println(nombre1.indexOf("S"));
//	System.out.println(nombre1.lastIndexOf("S"));
//	
//	
//	String var3 = "      ";
//	System.out.println(var3.isBlank());
//	System.out.println(var3.isEmpty());
//	
//	System.out.println(nombre1.length());
//	
//	System.out.println(nombre1.replace("E", "I"));
//	System.out.println(nombre1);
//	
//	String var4 = "EEEEE";
//	System.out.println(var4.replace("E", "I"));
//	
//	String var5 = "    Esto es una prueba      ";
//	String var6 = var5.substring(8);
//	System.out.println(var6);
//	String var7 = var5.substring(8,11);
//	System.out.println(var7);
//	
//	System.out.println(var5.trim());
//	
	
	
}
