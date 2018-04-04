package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domaine.Client;
import domaine.Conseiller;

public class DaoClient extends DaoJDBC implements IDaoClient {

	@Override
	public void creerClient(Client client) {

		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String inserBdd = "insert into client (nom, prenom,adresse,codepostal,ville,telephone,idconseiller) Values(?,?,?,?,?,?,?)";
			cnx = seConnecter();
			pstmt = cnx.prepareStatement(inserBdd);
			pstmt.setString(1, client.getNom());
			pstmt.setString(2, client.getPrenom());
			pstmt.setString(3, client.getAdresse());
			pstmt.setInt(4, client.getCodePostal());
			pstmt.setString(5, client.getVille());
			pstmt.setString(6, client.getTelephone());
			pstmt.setInt(7, client.getConseiller().getIdConseiller());

			pstmt.execute();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}

	}

	@Override
	public Client lireClient(int idClient) {

		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Client resultClient = null;

		try {
			cnx = seConnecter();
			String rechercheBdd = "SELECT * FROM client WHERE idclient=?";
			pstmt = cnx.prepareStatement(rechercheBdd);
			pstmt.setInt(1, idClient);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				int rClientIdClient = rs.getInt("idclient");
				String rClientNom = rs.getString("nom");
				String rClientPrenom = rs.getString("prenom");
				String rClientAdresse = rs.getString("adresse");
				int rClientCodePostal = rs.getInt("codepostal");
				String rClientVille = rs.getString("ville");
				String rClientTelephone = rs.getString("telephone");
				// TODO Modifier l'initialisation du conseiller
				// Conseiller rClientConseiller = (Conseiller) rs.getInt("idconseiller");
				Conseiller rClientConseiller = new Conseiller(1, "TestNom", "TestPrenom");

				resultClient = new Client(rClientIdClient, rClientNom, rClientPrenom, rClientAdresse, rClientCodePostal,
						rClientVille, rClientTelephone, rClientConseiller);
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}

		return resultClient;
	}

	@Override
	public void modifierClient(Client client) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String inserBdd = "update client set nom=?, prenom=?,adresse=?,codepostal=?,ville=?,telephone=? where idClient = ?";
			cnx = seConnecter();
			pstmt = cnx.prepareStatement(inserBdd);
			pstmt.setString(1, client.getNom());
			pstmt.setString(2, client.getPrenom());
			pstmt.setString(3, client.getAdresse());
			pstmt.setInt(4, client.getCodePostal());
			pstmt.setString(5, client.getVille());
			pstmt.setString(6, client.getTelephone());
			pstmt.setInt(7, client.getIdClient());

			pstmt.execute();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}

	}

	@Override
	public void supprimerClient(Client client) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String inserBdd = "delete from Client where idclient=?";
			cnx = seConnecter();
			pstmt = cnx.prepareStatement(inserBdd);
			pstmt.setInt(1, client.getIdClient());
			pstmt.execute();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}

	}

	@Override
	public List<Client> lireAllClients() {

		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Client> listResultClient = new ArrayList<>();

		try {
			cnx = seConnecter();
			String rechercheBdd = "SELECT * FROM client";
			pstmt = cnx.prepareStatement(rechercheBdd);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				int rClientIdClient = rs.getInt("idclient");
				String rClientNom = rs.getString("nom");
				String rClientPrenom = rs.getString("prenom");
				String rClientAdresse = rs.getString("adresse");
				int rClientCodePostal = rs.getInt("codepostal");
				String rClientVille = rs.getString("ville");
				String rClientTelephone = rs.getString("telephone");
				// TODO Modifier l'initialisation du conseiller
				// Conseiller rClientConseiller = (Conseiller) rs.getInt("idconseiller");
				Conseiller rClientConseiller = new Conseiller(1, "TestNom", "TestPrenom");

				Client resultClient = new Client(rClientIdClient, rClientNom, rClientPrenom, rClientAdresse,
						rClientCodePostal, rClientVille, rClientTelephone, rClientConseiller);
				listResultClient.add(resultClient);
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}

		return listResultClient;

	}

	@Override
	public List<Client> lireClientsParConseiller(int idConseiller) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Client> listResultClientparConseiller = new ArrayList<>();

		try {
			cnx = seConnecter();
			String rechercheBdd = "SELECT * FROM client where idconseiller";
			pstmt = cnx.prepareStatement(rechercheBdd);
			
			pstmt.setInt(1, idConseiller);
			pstmt.execute();

			rs = pstmt.executeQuery();
			while (rs.next()) {
				int rClientIdClient = rs.getInt("idclient");
				String rClientNom = rs.getString("nom");
				String rClientPrenom = rs.getString("prenom");
				String rClientAdresse = rs.getString("adresse");
				int rClientCodePostal = rs.getInt("codepostal");
				String rClientVille = rs.getString("ville");
				String rClientTelephone = rs.getString("telephone");
				

				Client resultClient = new Client(rClientIdClient, rClientNom, rClientPrenom, rClientAdresse,
						rClientCodePostal, rClientVille, rClientTelephone);
				listResultClientparConseiller.add(resultClient);
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}

		return listResultClientparConseiller;

	}

}
