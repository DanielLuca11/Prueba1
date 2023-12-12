package paquetes.testUtileria;

// import paquetes.*;
import paquetes.Utileria;
import static paquetes.Utileria.imprimir;


public class TestUtileria {
	
	public static void main(String[] args) {

		 Utileria.imprimir("Saludos");
		 System.out.println("=============================================================");
		 
		 Utileria.imprimir("Adios");
		 System.out.println("=============================================================");
		 
		 
		 /**
		  * Sintaxix de nombre calificado 
		  */
		 paquetes.Utileria.imprimir("Adios");
		 System.out.println("=============================================================");
		 
}
}