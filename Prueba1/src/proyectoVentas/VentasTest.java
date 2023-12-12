package proyectoVentas;

import proyectoVentas.*;
import proyectoVentas.ventas.Orden;
import proyectoVentas.ventas.Producto;

public class VentasTest {
	
	public static void main(String[] args) {
		
		Producto producto1 = new Producto ("Camisa",50.000);
		Producto producto2 = new Producto ("Corbata",70.000);
		Producto producto3 = new Producto ("Pantalon",90.000);
		Producto producto4 = new Producto ("Zapatilla",45.000);
		Producto producto5 = new Producto ("Polo",89.000);
		Producto producto6 = new Producto ("Polar",35.000);
		
		
		Orden orden1 = new Orden();
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		orden1.mostrarOrden();
		System.out.println("==================================================");
		
		Orden orden2 = new Orden();
		orden2.agregarProducto(producto4);
		orden2.agregarProducto(producto5);
		orden2.mostrarOrden();
		System.out.println("==================================================");
		
		Orden orden3 = new Orden();
		orden3.agregarProducto(producto6);
		orden3.agregarProducto(producto3);
		orden3.mostrarOrden();
	}

}
