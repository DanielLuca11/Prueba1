package parteTercera;

import java.util.Scanner;

public class sentenciaControlElseIF {
	
	 public static void main(String[] args) {
		 
	// Este es un ejercicio añadiendo el Scanner consola	 
		 
    System.out.println("Escribe tu numero de mes :");	 
    Scanner consola = new Scanner(System.in);
    var mes = consola.nextLine();
    
 // Convert the input to an integer
    int num = Integer.parseInt(mes);
	
	var estacion = "Estacion desconocia";
	
	if(num == 1 || num == 2 || num == 12){
	estacion = "invierno";
	}
	else if(num ==3 || num == 4 || num == 5){
	estacion = "primavera";
	}
	else if(num ==6 || num == 7 || num == 8) {
	estacion = "verano";
	}
	else if(num ==9 || num == 10 || num == 11) {
	estacion = "otonio";
	}
	System.out.println("estacion = " + estacion );
	
}
}