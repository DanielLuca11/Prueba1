package es.curso.java.introduccion.bucles;

import java.util.Scanner;

public class ApuestasDados {
	
	public static void main(String[]args) {
		
		double importe = 1000;
		String respuesta = "";
		
		do {
			
			System.out.println("Cuanto quieres apostar de los"+ importe+"€");
			importe-=100;
			System.out.println("quieres seguir jugando??");
			Scanner scan =new Scanner(System.in);
			respuesta = scan.nextLine();
			
					
			
		}while
		
	}

}
