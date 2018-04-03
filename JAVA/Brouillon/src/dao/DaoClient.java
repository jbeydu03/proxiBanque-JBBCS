package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domaine.Client;

public class DaoClient implements IDao {
	private Connection cnx = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	@Override
	public void creationClient(int idClient, String nom, String prenom, String adresse, int codePostal, String ville,
			String telephone) {
		try {
			cnx = BDD.seConnecter();
			String sql = "insert into client(`idClient`, `nom`,`prenom`,`adresse`,`codePostal`,`ville`,`telephon`) values(?,?,?,?,?,?,?)";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setInt(1, idClient);
			pstmt.setString(2, nom);
			pstmt.setString(3, prenom);
			pstmt.setString(4, adresse);
			pstmt.setInt(5, codePostal);
			pstmt.setString(6, ville);
			pstmt.setString(7, telephone);
			pstmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			BDD.seDeconnecter(pstmt, rs, cnx);
		}
	}

	@Override
	public void modifierClient(int idClient, String nom, String prenom, String adresse, int codePostal, String ville,
			String telephone) {
		try {
			cnx = BDD.seConnecter();
			String sql = "update client set nom=? and prenom=? and adresse=? and codePostal=? and ville=? and telephone=? where idclient=?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, nom);
			pstmt.setString(2, prenom);
			pstmt.setString(3, adresse);
			pstmt.setInt(4, codePostal);
			pstmt.setString(5, ville);
			pstmt.setString(6, telephone);
			pstmt.setInt(7, idClient);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			BDD.seDeconnecter(pstmt, rs, cnx);
		}
	}

	@Override
	public Client lireClient(int idClient) {
		Client c = null;
		try {
			cnx = BDD.seConnecter();
			String sql = "select idclient,nom,prenom,adresse,codepostal,ville,telephone from client where idclient=?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setInt(1, idClient);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String nom = rs.getString(2);
				String prenom = rs.getString(3);
				String adresse = rs.getString(4);
				int codePostal = rs.getInt(5);
				String ville = rs.getString(6);
				String telephone = rs.getString(7);
				c = new Client(idClient, nom, prenom, adresse, codePostal, ville, telephone);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			BDD.seDeconnecter(pstmt, rs, cnx);
		}
		return c;
	}

	@Override
	public void supprimerClient(int idClient) {
		try {
			cnx = BDD.seConnecter();
			String sql = "delete from client where idclient=?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setInt(1, idClient);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			BDD.seDeconnecter(pstmt, rs, cnx);
		}
	}

	@Override
	public ArrayList<Client> lireAllClient() {
		ArrayList<Client> listeClients = new ArrayList<>();
		try {
			cnx = BDD.seConnecter();
			String sql = "select idclient,nom,prenom,adresse,codepostal,ville,telephone from client";
			pstmt = cnx.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int idClient = rs.getInt(1);
				String nom = rs.getString(2);
				String prenom = rs.getString(3);
				String adresse = rs.getString(4);
				int codePostal = rs.getInt(5);
				String ville = rs.getString(6);
				String telephone = rs.getString(7);
				Client c = new Client(idClient, nom, prenom, adresse, codePostal, ville, telephone);
				listeClients.add(c);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			BDD.seDeconnecter(pstmt, rs, cnx);
		}
		return listeClients;
	}
}
