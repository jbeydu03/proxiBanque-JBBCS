package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BDD {

	public static Connection seConnecter() throws ClassNotFoundException, SQLException {
		String login = "root";
		String mdp = "";
		String url = "jdbc:mysql://localhost:3306/brouillonpxb2";
		String driver = "com.mysql.jdbc.Driver";
		Class.forName(driver);
		Connection cnx = DriverManager.getConnection(url, login, mdp);
		return cnx;
	}

	public static void seDeconnecter(PreparedStatement pstmt, ResultSet rs, Connection cnx) {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (cnx != null) {
				cnx.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
