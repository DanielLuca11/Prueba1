package es.java.daniel.cabanillas.examen;


public class Carta {

	
	 private String carta_de_vinos;
	 private String menu_del_dia;
	 private Plato[] platos;
	 private Bebida[] bebidas;

	 
	 
	public String getCarta_de_vinos() {
		return carta_de_vinos;
	}


	public void setCarta_de_vinos(String carta_de_vinos) {
		
		
		this.carta_de_vinos = carta_de_vinos;
	}


	public String getMenu_del_dia() {
	
		return menu_del_dia;
				
	}


	public void setMenu_del_dia(String menu_del_dia) {
		this.menu_del_dia = menu_del_dia;
	}


	public Plato[] getPlatos() {
		return platos;
	}


	public void setPlatos(Plato[] platos) {
		this.platos = platos;
	}


	public Bebida[] getBebidas() {
		return bebidas;
	}


	public void setBebidas(Bebida[] bebidas) {
		this.bebidas = bebidas;
	}


	public Carta(String carta_de_vinos, String menu_del_dia, Plato[] platos, Bebida[] bebidas) {
		super();
		this.carta_de_vinos = carta_de_vinos;
		this.menu_del_dia = menu_del_dia;
		this.platos = platos;
		this.bebidas = bebidas;
	}
	 
	 
	 
	 
}
