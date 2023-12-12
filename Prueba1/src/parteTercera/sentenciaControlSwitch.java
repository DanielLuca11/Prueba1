package parteTercera;

import java.util.Scanner;

public class sentenciaControlSwitch {
	
	public static void main(String[] args) {
		
     // Este es un ejercicio añadiendo el Scanner consola	 
		 
	    System.out.println("Escribe tu numero :");	 
	    Scanner consola = new Scanner(System.in);
	    var numero = consola.nextLine();
	    
	 // Convert the input to an integer
        int num = Integer.parseInt(numero);

        var numeroTexto = "Valor desconocido";

        switch (num) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}