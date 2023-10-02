package es.curso.java.introduccion.bucles;

import java.util.Scanner;

public class TenistasTop {
	
	public static void main(String[] args) {

/*  
 *  1- Alcaraz 
 * 2- Djocovico 
 * 3 Medvedev 
 * 4 Cameron Norrie
 * 5 Taylor Fritz
 * 6 Borna Coric
 * 7 Casper Rud 
 * 8 Lorenzo Musseti
 * 9 Grigor Drimitrov
 * 10 Alex de Miniur
 * 
 * 
 */
		System.out.println("Introduce cantidad tenistas");
		Scanner scan = new Scanner(System.in);
		int tenistas1 = scan.nextInt();
		
		int tenistas = 0;
		int puesto = 0;
		int contador1 = 0;
		
		for (int num = 0; num < tenistas1; num++) {
			System.out.println("Puesto en la Atp");
			 puesto = scan.nextInt();

			if (puesto < 11 ) {
             
				contador1 += 1;
			}
		}
		System.out.println("Existen  -->" + contador1+" Tenistas en el top Atp");
		
	}
}



