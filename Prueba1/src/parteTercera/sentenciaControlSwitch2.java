package parteTercera;

import java.util.Scanner;

public class sentenciaControlSwitch2 {
	
	public static void main(String[] args) {

        // Este es un ejercicio añadiendo el Scanner consola
        System.out.println("Escribe tu numero de mes:");
        Scanner consola = new Scanner(System.in);
        var mes = consola.nextLine();

        // Convert the input to an integer
        int num = Integer.parseInt(mes);

        var estacion = "Estacion desconocida";

        switch (num) {
            case 1:  case 2: case 12:
                estacion = "Invierno";
                break;
            case 3:  case 4: case 5:
                estacion = "Primavera";
                break;
            case 6:  case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otonio";
                break;
        }
        System.out.println("Estacion = " + estacion);
    }
}