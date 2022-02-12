package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import javax.swing.JOptionPane;

public class AccesoDatos {
	/**
	 * Agencia de Viajes - Clase AccesoDatos
	 * 
	 * @author Robert G
	 * 
	 */
	public static Connection conn;
	public static Statement stmt;
	public static ResultSet rset;
	public static int p;

	// M�todo para conectar con la BD
	public static Connection ConectarBD(String driver, String usuario, String pass) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		conn = DriverManager.getConnection(driver, usuario, pass);
		return conn;
	}

	// M�todo para hacer consultas en la BD
	public static ResultSet ConsultaBD(String consulta) throws SQLException {
		stmt = ConectarBD("jdbc:oracle:thin:@localhost:1521:XE", "agencia", "agencia").createStatement();
		rset = stmt.executeQuery(consulta);
		return rset;
	}

	// M�todo para insertar datos en la BD
	public static void insert(Connection conn, String insert) throws SQLException {
		stmt = conn.createStatement();
		p = stmt.executeUpdate(insert);
//		if (p == 1) {
//			JOptionPane.showMessageDialog(null, "Acabas de insertar " + p + " l�nea.", "Informaci�n",
//					JOptionPane.INFORMATION_MESSAGE);
//		} else {
//			JOptionPane.showMessageDialog(null, "Acabas de insertar " + p + " l�neas.", "Informaci�n",
//					JOptionPane.INFORMATION_MESSAGE);
//		}
	}

	// M�todo para borrar datos de la BD
	public static void delete(Connection conn, String delete) throws SQLException {
		stmt = conn.createStatement();
		p = stmt.executeUpdate(delete);
//		if (p == 1) {
//			JOptionPane.showMessageDialog(null, "Acabas de borrar " + p + " l�nea.", "Informaci�n",
//					JOptionPane.INFORMATION_MESSAGE);
//		} else {
//			JOptionPane.showMessageDialog(null, "Acabas de borrar " + p + " l�neas.", "Informaci�n",
//					JOptionPane.INFORMATION_MESSAGE);
//		}
	}

	// M�todo para modificar datos de la BD
	public static void update(Connection conn, String update) throws SQLException {
		stmt = conn.createStatement();
		p = stmt.executeUpdate(update);
//		if (p == 1) {
//			JOptionPane.showMessageDialog(null, "Acabas de modificar " + p + " l�nea.", "Informaci�n",
//					JOptionPane.INFORMATION_MESSAGE);
//		} else {
//			JOptionPane.showMessageDialog(null, "Acabas de modificar " + p + " l�neas.", "Informaci�n",
//					JOptionPane.INFORMATION_MESSAGE);
//		}
	}

	// M�todo para cerrar la conexion con la BD
	public static void CerrarConexion() throws SQLException {
		stmt.close();
	}
}
