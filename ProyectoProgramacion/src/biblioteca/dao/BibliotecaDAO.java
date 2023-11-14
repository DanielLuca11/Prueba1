package biblioteca.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import biblioteca.entities.Biblioteca;
import biblioteca.entities.Direccion;

public class BibliotecaDAO extends ConexionDAO {


	public BibliotecaDAO() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Biblioteca> getBibliotecas () throws SQLException {
		
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();

		Statement stmt = this.getConexion().createStatement();
		String query = "SELECT libros.codigo_libro, libros.titulo, libros.autor, libros.isbn \r\n"
				+ "libros.codigo_biblioteca, bibliotecas.numero, bibliotecas.id_direcciones\r\n"
				+ "FROM libros \r\n"
				+ "JOIN biblioteca ON libros.codigo_biblioteca = biblioteca.id_biblioteca;";
		
		
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			long idBiblioteca = rs.getLong("biblio.id");
			String nombreBiblioteca = rs.getString("biblio.nombre");
			String tipoDireccion = rs.getString("dir.tipo_direccion");
			String direccion = rs.getString("dir.direccion");
			String ciudad = rs.getString("dir.ciudad");
			String provincia = rs.getString("dir.provincia");
			int codPostal = rs.getInt("dir.cod_postal");

			Direccion dire = new Direccion(tipoDireccion,direccion,ciudad,provincia,codPostal);
			Biblioteca biblio = new Biblioteca(idBiblioteca, nombreBiblioteca, dire);
			
			bibliotecas.add(biblio);
		}
		
		return bibliotecas;
	}
	
	public List<Biblioteca> getBibliotecas (String ciudad) {
		
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
		
		return bibliotecas;
	}
	
	
	public Biblioteca getBiblioteca (long id) {
		
		
		return null;
	}
	
	
}
