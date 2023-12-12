package parteTercera;

import java.util.Scanner;

public class sentenciasControl {
	
	 public static void main(String[] args) {
		 
		 
		 var condicion = false ; // variable de condicion booleana  
		 
		 if(condicion)
			 System.out.println("Condicion verdadera");
		 else
			 System.out.println("Condicion falsa");
		 
	// Este es un ejercicio añadiendo el Scanner consola	 
		 
		 System.out.println("Escribe tu numero :");
		 Scanner consola = new Scanner(System.in);
	        var numero = consola.nextLine();

	        // Convert the input to an integer
	        int num = Integer.parseInt(numero);

	        var numeroTexto = "Numero desconocido";

	        if (num == 1) {
	            numeroTexto = "Numero uno";
	        } else if (num == 2) {
	            numeroTexto = "Numero dos";
	        } else if (num == 3) {
	            numeroTexto = "Numero tres";
	        } else if (num == 4) {
	            numeroTexto = "Numero cuatro";
	        } else {
	            numeroTexto = "Numero no encontrado";
	        }
	        System.out.println("numeroTexto = " + numeroTexto);
	    }
	}
