package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Clothide SZYMEZAK et JB BLANC class traitant de la connexion à la BDD
 *         MySql
 *
 */
public class DaoJDBC {
	private static String url = "jdbc:mysql://localhost/proxibanquev2-JBBCS";
	private static String login = "root";
	private static String password = "";

	public Connection seConnecter() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnx = DriverManager.getConnection(url, login, password);
		return cnx;
	}

	public void seDeconnecter(Connection cnx, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (cnx != null)
				cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
