package proyectoTransporte.testTransporte;

import proyectoTransporte.Aeronave;
import proyectoTransporte.Transporte;

public class TransporteMain {
	
	public static void main(String [] args) {
		
	Transporte transporte = new Transporte ();
	Aeronave avion = new Aeronave ();
	
	avion.avanzar();
	transporte.detenerse();
	
	}

}
