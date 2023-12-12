package parteTercera.ejercicioTercera;

import java.util.Scanner;

public class ejercicio1 {
	 /**
	  * Hemos generado un codigo para ver calificaciones segun condicionales
	  * en este ejemplo else if ,cuando encuentra la sentencia
	  * no pasa por las demas sentencias .
	**/
	   public static void main(String[] args) {
		   
	       Scanner scanner = new Scanner(System.in);
	       System.out.println("Proporciona un valor entre 0 y 10:");
	       
	       int calificacion = Integer.parseInt(scanner.nextLine());
	       //Si esta entre 9 y 10 imprimir: A
	       
	       if (calificacion >= 9 && calificacion <= 10)
	           System.out.println("A ; Super");
	       //Si esta entre  8 y menor a 9 imprimir: B
	       else if(calificacion >= 8 && calificacion < 9)
	           System.out.println("B ; Notable");
	       //Si esta entre 7 y menor a 8 imprimir: C
	       else if(calificacion >= 7 && calificacion < 8)
	           System.out.println("C ; Superado");
	       //Si esta entre 6 y menor a 7 imprimir: D
	       else if(calificacion >= 5 && calificacion < 7)
	           System.out.println("D ; Aprobado");
	       //Si esta entre 0 y menor a 6 imprimir: F
	       else if(calificacion >= 0 && calificacion < 5)
	           System.out.println("F ; Suspenso");
	       //Si no esta en el rago, imprimir: Valor desconocido
	   
	    else
	           System.out.println("Valor desconocido");
	   }
	}


