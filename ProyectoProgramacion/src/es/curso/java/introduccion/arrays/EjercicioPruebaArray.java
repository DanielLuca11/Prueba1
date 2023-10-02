package es.curso.java.introduccion.arrays;

public class EjercicioPruebaArray {
	
	public static void main(String[] args) {
		
        int filas = 4; // Número de filas
        int columnas = 5; // Número de columnas

        // Declarar un array bidimensional con el tamaño especificado
        int[][] miArray = new int[filas][columnas];

        // Llenar el array con valores (este es solo un ejemplo)
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                miArray[i][j] = i * columnas + j;
            }
       
            }
            System.out.println(); // Cambiar de línea después de cada fila
        }
    }



