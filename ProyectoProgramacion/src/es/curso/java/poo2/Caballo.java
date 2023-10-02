package es.curso.java.poo2;
import java.util.Random;

public class Caballo {
	

	    // Atributos
	    private int id;
	    private static String nombre;
	    private int numero;
	    private static int edad;
	    private static int velocidad;
	    private static int peso;

	    public int getId() {
			return id;
		}

//		public void setId(int id) {
//			this.id = id;
//		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public int getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}

		// Constructor
	    public Caballo(int id, String nombre, int numero, int edad, int velocidad, int peso) {
	        this.id = id;
	        this.nombre = nombre;
	        this.numero = numero;
	        // En el rango 5-20
	        if (edad >= 5 && edad <= 20) {
	            this.edad = edad;
	        } else {
	        	 System.out.println("La edad debe estar en el rango 5-20");
	        }
	        // Velocidad en el rango 40-80
	        if (velocidad >= 40 && velocidad <= 80) {
	            this.velocidad = velocidad;
	        } else {
	        	 System.out.println("La velocidad debe estar en el rango 40-80");
	        }
	        // Peso en el rango 200-400
	        if (peso >= 200 && peso <= 400) {
	            this.peso = peso;
	        } else {
	        	 System.out.println("El peso debe estar en el rango 200-400");
	        }
	    }

	    // Método para simular el avance del caballo
	    public static void  correr() {
	        Random random = new Random();
	        int avance = velocidad * (random.nextInt(41) + 40) - peso * (random.nextInt(201) + 200) - edad * (random.nextInt(16) + 5);
	        System.out.println("Caballo " + nombre + " avanza " + avance + " metros");
	    }

		public void comenzarCarrera() {
			// TODO Auto-generated method stub
			
		}

		public double obtenerDistanciaRecorrida() {
			// TODO Auto-generated method stub
			return 0;
		}

	    
	}



