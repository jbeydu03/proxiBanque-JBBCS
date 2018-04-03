package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoJDBC {
	private static String url = "jdbc:mysql://localhost/formation";
	private static String login = "root";
	private static String password = "";

	public Connection seConnecter() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn = DriverManager.getConnection(url, login, password);
		return cn;
	}

	public void seDeconnecter(Connection cn, PreparedStatement st, ResultSet rs) {
		try {
			if (cn != null)
				cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (st != null)
				st.close();
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

