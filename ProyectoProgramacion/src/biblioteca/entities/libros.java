package biblioteca.entities;

public class libros {
	
	private int codigo_libro ;
	private String titulo ;
	private String autor ;
	private String isbn ;
	private int codigo_biblioteca ;
	
	
	@Override
	public String toString() {
		return "libros [codigo_libro=" + codigo_libro + ", titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn
				+ ", codigo_biblioteca=" + codigo_biblioteca + ", getCodigo_libro()=" + getCodigo_libro()
				+ ", getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor() + ", getIsbn()=" + getIsbn()
				+ ", getCodigo_biblioteca()=" + getCodigo_biblioteca() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	/**
	 * @return the codigo_libro
	 */
	public int getCodigo_libro() {
		return codigo_libro;
	}


	/**
	 * @param codigo_libro the codigo_libro to set
	 */
	public void setCodigo_libro(int codigo_libro) {
		this.codigo_libro = codigo_libro;
	}


	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}


	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}


	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}


	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}


	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	/**
	 * @return the codigo_biblioteca
	 */
	public int getCodigo_biblioteca() {
		return codigo_biblioteca;
	}


	/**
	 * @param codigo_biblioteca the codigo_biblioteca to set
	 */
	public void setCodigo_biblioteca(int codigo_biblioteca) {
		this.codigo_biblioteca = codigo_biblioteca;
	}


	public libros(int codigo_libro, String titulo, String autor, String isbn, int codigo_biblioteca) {
		super();
		this.codigo_libro = codigo_libro;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.codigo_biblioteca = codigo_biblioteca;
	}
	
	

}
