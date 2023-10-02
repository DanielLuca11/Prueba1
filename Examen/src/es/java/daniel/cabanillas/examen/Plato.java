package es.java.daniel.cabanillas.examen;

public class Plato {
	
	class Platos {
		 
		 public String getFilete_con_patatas() {
			return filete_con_patatas;
		}

		public void setFilete_con_patatas(String filete_con_patatas) {
			this.filete_con_patatas = filete_con_patatas;
		}

		public String getCroquetas() {
			return croquetas;
		}

		public void setCroquetas(String croquetas) {
			this.croquetas = croquetas;
		}

		public String getPaella() {
			return paella;
		}

		public void setPaella(String paella) {
			this.paella = paella;
		}

		public String getEntrecot() {
			return entrecot;
		}

		public void setEntrecot(String entrecot) {
			this.entrecot = entrecot;
		}

		public String getCocido() {
			return cocido;
		}

		public void setCocido(String cocido) {
			this.cocido = cocido;
		}

		public int getPrecio_filete_con_patatas() {
			return precio_filete_con_patatas;
		}

		public void setPrecio_filete_con_patatas(int precio_filete_con_patatas) {
			this.precio_filete_con_patatas = precio_filete_con_patatas;
		}

		public int getPrecio_croquetas() {
			return precio_croquetas;
		}

		public void setPrecio_croquetas(int precio_croquetas) {
			this.precio_croquetas = precio_croquetas;
		}

		public int getPrecio_paella() {
			return precio_paella;
		}

		public void setPrecio_paella(int precio_paella) {
			this.precio_paella = precio_paella;
		}

		public int getPrecio_entrecot() {
			return precio_entrecot;
		}

		public void setPrecio_entrecot(int precio_entrecot) {
			this.precio_entrecot = precio_entrecot;
		}

		public int getPrecio_cocido() {
			return precio_cocido;
		}

		public void setPrecio_cocido(int precio_cocido) {
			this.precio_cocido = precio_cocido;
		}

		public boolean isDisponible() {
			return disponible;
		}

		public void setDisponible(boolean disponible) {
			this.disponible = disponible;
		}

		public boolean isCarta_paga_poco() {
			return carta_paga_poco;
		}

		public void setCarta_paga_poco(boolean carta_paga_poco) {
			this.carta_paga_poco = carta_paga_poco;
		}

		private String filete_con_patatas;
		 private String croquetas;
		 private String paella;
		 private String entrecot;
		 private String cocido;
		 private int precio_filete_con_patatas;
		 private int precio_croquetas;
		 private int precio_paella;
		 private int precio_entrecot;
		 private int precio_cocido;
		 private boolean disponible;
		 private boolean carta_paga_poco;
		 
	public  Platos () {
		
		precio_filete_con_patatas = 7;
		precio_croquetas = 4;
		precio_paella = 6;
		precio_entrecot = 10;
		precio_cocido = 8;
			
	}
	
	}
}

