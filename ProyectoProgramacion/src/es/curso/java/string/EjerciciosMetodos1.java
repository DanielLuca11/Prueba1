package es.curso.java.string;

public class EjerciciosMetodos1 {
	
//	int calculaEdad (String anioNacimiento)

    private static int calcularEdad(String anioNacimiento) {
        int añoActual = 2023; // Declaro año actual
        int anioNac = Integer.parseInt(anioNacimiento);
       // Integer.parseInt(anioNacimiento): Esta parte del código toma la cadena de texto anioNacimiento
       // y la convierte en un valor entero. 
       // El método parseInt- de la clase Integer toma una cadena de texto como argumento 
       // y devuelve su equivalente numérico como un valor entero.
        
        
        return añoActual - anioNac;
    }

    public static void main(String[] args) {
        String anioNacimiento = "1981";
        int edad = calcularEdad(anioNacimiento);

        System.out.println("La edad es: " + edad);
    }
}
