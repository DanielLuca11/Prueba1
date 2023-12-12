package proyectoMundoPc;

import proyectoMundoPc.mundopc.Computadora;
import proyectoMundoPc.mundopc.Monitor;
import proyectoMundoPc.mundopc.Orden;
import proyectoMundoPc.mundopc.Raton;
import proyectoMundoPc.mundopc.Teclado;

public class MundoPc {

	public static void main(String[] args) {

		Monitor monitorHP = new Monitor("HP", 13);
		Teclado tecladoHP = new Teclado("bluetooth", "HP");
		Raton ratonHP = new Raton("bluetooth", "HP");
		Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

		Monitor monitorGamer = new Monitor("Gamer", 13);
		Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
		Raton ratonGamer = new Raton("bluetooth", "HP");
		Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadoraHP);
	    orden1.agregarComputadora(computadoraGamer);

		orden1.mostrarOrden();

	}

} 

