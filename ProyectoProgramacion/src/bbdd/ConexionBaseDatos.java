package bbdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.Set;


public class ConexionBaseDatos {

	public static void main(String[] args) {
		ConexionBaseDatos conexion = new ConexionBaseDatos();
		conexion.conectaTryWithResources();
		conexion.conectaTryWithResources2();
	}
	private void conectaTryWithResources() {
			
//		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
//		String username = "root";
//		String password = "pasword";
		
		//Connection connection = null;//Conexion con la base de datos
		//Statement stmt = null;//Lanzar consulta
		//ResultSet rs = null;//Recoger datos de la consulta
		
		Set<VehiculoGuerra> vehiculos = new LinkedHashSet<VehiculoGuerra>();

        try (
        	/**
        	 * Desde la clase Connection,creamos una variable para llamar al metodo desde que importamos utilidades 
        	 * y llamamos el metodo compila para ejecutar la conexion con "conecto"
        	 */
        		Connection conecto = Utilidades.compila();
        		
        	// Connection connection = DriverManager.getConnection(url, username, password);
             Statement stmt = conecto.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM TB_VEHICULOS_GUERRA")) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int ataque = rs.getInt("ataque");
                int defensa = rs.getInt("defensa");
                String tipo = rs.getString("tipo");
                
                VehiculoGuerra vehiculo = new VehiculoGuerra(id, nombre, ataque, defensa, tipo);
				vehiculos.add(vehiculo);
				
			System.out.println(vehiculo);
            }
            } catch (SQLException e) {
			System.err.println("Ha habido un error " + e.getMessage());
			e.printStackTrace();
		} 

	}
	
	private void conectaTryWithResources2() {
		
//		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
//		String username = "root";
//		String password = "pasword";
		
		//Connection connection = null;//Conexion con la base de datos
		//Statement stmt = null;//Lanzar consulta
		//ResultSet rs = null;//Recoger datos de la consulta
		
		Set<Guerrero> vehiculos = new LinkedHashSet<Guerrero>();

        try (
        		/**
            	 * Desde la clase Connection,creamos una variable para llamar al metodo desde que importamos utilidades 
            	 * y llamamos el metodo compila para ejecutar la conexion con "conecto"
            	 */
            		Connection conecto = Utilidades.compila();
        		
        //	 Connection connection = DriverManager.getConnection(url, username, password);
             Statement stmt = conecto.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM TB_GUERRERO")) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int fuerza = rs.getInt("fuerza");
                int resistencia = rs.getInt("resistencia");
                String vehiculo_id = rs.getString("vehiculo_id");
                
                Guerrero guerreroass = new Guerrero(id, nombre, fuerza, resistencia, vehiculo_id);
				vehiculos.add(guerreroass);
				
			System.out.println(guerreroass);
            }
            } catch (SQLException e) {
			System.err.println("Ha habido un error " + e.getMessage());
			e.printStackTrace();
		} 

	}

	private void conecta() {
		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
		String username = "root";
		String password = "pasword";

		Connection connection = null;//Conexion con la base de datos
		Statement stmt = null;//Lanzar consulta
		ResultSet rs = null;//Recoger datos de la consulta
		try {

			System.out.println("Estableciendo conexión");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conexión establecida");
			stmt = connection.createStatement();

			rs = stmt.executeQuery("SELECT * FROM TB_VEHICULOS_GUERRA");
			while (rs.next()) {
				int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int ataque = rs.getInt("ataque");
                int defensa = rs.getInt("defensa");
                String tipo = rs.getString("tipo");
                System.out.println("===============================");
                System.out.println("id: " + id);
                System.out.println("nombre: " + nombre);
                System.out.println("ataque: " + ataque);
                System.out.println("defensa: " + defensa);
                System.out.println("tipo: " + tipo);
                System.out.println("===============================");
			}

		} catch (SQLException e) {
			System.err.println("Ha habido un error " + e.getMessage());
//			e.printStackTrace();
		} finally {
			
			try {
				if (connection!=null) {
					connection.close();
				}
				if (stmt!=null)
					stmt.close();
				if (rs!=null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
