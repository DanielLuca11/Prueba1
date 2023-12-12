package partePrimera;

import java.util.Scanner;

public class escaner {
	
	public static void main (String args[]) {
		
	System.out.println("Escribe tu nombre:");
	Scanner consola = new Scanner(System.in);
	var usuario = consola.nextLine();        // leemos informacion de la consola .
	System.out.println("usuario = " + usuario ) ;
	System.out.println("Escribe el titulo :" ) ;
	var titulo = consola.nextLine();        // leemos informacion de la consola .
	System.out.println("Resultado : " + " " + titulo + " " +  usuario ) ;
	
		
		
		
}


}
