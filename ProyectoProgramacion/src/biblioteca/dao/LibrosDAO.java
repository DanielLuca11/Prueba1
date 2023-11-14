package biblioteca.dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import biblioteca.entities.Biblioteca;
import biblioteca.entities.Direccion;

	
	public class LibrosDAO extends ConexionDAO {
	
	public LibrosDAO() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public <Libros, ResultSet> List<Libros> getLibros () throws SQLException {
	
		List<Libros> libros = new ArrayList<Libros>();

		Statement stmt = this.getConexion().createStatement();
    	String query = "SELECT biblio.id, biblio.nombre, \r\n"   
				+ "dir.tipo_direccion, dir.direccion, dir.ciudad, dir.provincia, dir.cod_postal\r\n"
				+ "FROM TB_BIBLIOTECA as biblio JOIN TB_DIRECCION as dir \r\n"
				+ "ON biblio.fk_direccion = dir.id";
	
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			long codigo_libro = rs.getLong("libros.codigo_libro");
			String titulo = rs.getString("libros.titulo");
			String autor = rs.getString("libros.autor");
			String isbn = rs.getString("libros.isbn");
			String codigo_biblioteca = rs.getString("libros.codigo_biblioteca");
			

			Libros libr = new Libros(libro.codigo_libro,libros.titulo,libros.autor,libros.isbn,libros.codigo_biblioteca);
			Libros libro = new Libro(codigo_libro,titulo, autor,isbn,codigo_biblioteca);
			
			Libros.add(libros);
		}
		
		return libros;
	}

}
