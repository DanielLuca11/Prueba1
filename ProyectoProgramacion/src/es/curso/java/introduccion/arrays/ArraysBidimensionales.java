package es.curso.java.introduccion.arrays;

public class ArraysBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] animales = new String[3][5];

//	//	System.out.println(animales[2][1]);
//		System.out.println(animales[2][1]);
//		animales[0][0]= "Gato";
		animales[0][0] = "Real Madrid";
        animales[0][1] = "Atletico";
        animales[0][2] = "Getafe";
        animales[0][3] = "        Sevilla";
        animales[0][4] = "        Osasuna";
		
	//	System.out.println(animales.length);// numero de filas 
	//	System.out.println(animales[0].length);// numero de columnas de las filas  
		
		// Llenar la matriz con valores
        
        // Aqui por una parte ingresa valores primero a la fila y luego a las columnas 
        
        for (int fila = 1; fila < animales.length; fila++) {
            for (int columna = 0; columna < animales[fila].length; columna++) {
            	
                // Asignar un valor a cada elemento de la matriz
            	
                animales[fila][columna] = "Equipo" + fila + "T" + columna;
            }
        }

        // Imprimir la matriz para verificar los valores
        for (int fila = 0; fila < animales.length; fila++) {
            for (int columna = 0; columna < animales[fila].length; columna++) {
                System.out.print(animales[fila][columna] + "\t");
            }
            System.out.println(); // Saltar a la siguiente fila
        }
		
        System.out.println("===========================================================================");
        
		
		
		
	}
}