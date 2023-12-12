package partePrimera;

import java.util.Scanner;

public class convertirString {
	
	
	public static void main (String args[]) {
	
		
		// Convertir tipo Strin a un tipo int
		var edad = Integer.parseInt("20");
	    //vsr  edad = "20";    si paso esto seria Strin y saldria 201 
		System.out.println("edad = " + (edad+1));
	
		var valorPi= Double.parseDouble("3.1416");
		System.out.println("valorPi = " + valorPi );
		
		
		//Trabajar con lo console
		
		var consola =  new Scanner(System.in);
//		System.out.println("Proporciona tu edad ");
//		edad = Integer.parseInt(consola.nextLine());
//		System.out.println("edad = " + edad );
		
		var caracter = "Hola".charAt(1);
		System.out.println("caracter = "+ caracter);
		
		System.out.println("Proporciona un caracter ");
		caracter = consola.nextLine().charAt(0);
		System.out.println("caracter = " + caracter );
		
		
		
		
		
}

}
