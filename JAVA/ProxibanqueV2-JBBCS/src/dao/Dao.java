package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domaine.Client;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.Conseiller;

/**
 * @author Clothide SZYMEZAK et JB BLANC Requetes liées à la base de donnée.
 * 
 *         Implémentation de IDaoClient pour CRUD client Implémentation de
 *         IDaoConseiller pour CRUD conseiller Implémentation de IDaoConseiller
 *         pour CRUD comptes (courant et epargne)
 * 
 *         Heritage de DaoJDBC pour connection à la BDD MySQL
 *
 */
public class Dao extends DaoJDBC implements IDaoClient, IDaoConseiller, IDaoCompte {

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
	public void creerConseiller(Conseiller conseiller) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String inserBdd = "insert into client (nom, prenom,login,mdp,iaAgence) Values(?,?,?,?,?)";
			cnx = seConnecter();
			pstmt = cnx.prepareStatement(inserBdd);
			pstmt.setString(1, conseiller.getNom());
			pstmt.setString(2, conseiller.getPrenom());
			pstmt.setString(3, conseiller.getLogin());
			pstmt.setString(4, conseiller.getPwd());
			pstmt.setString(5, (String) conseiller.getAgence().getIdAgence());

			pstmt.execute();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}

	}

	@Override
	public Conseiller lireConseiller(int idConseiller) {

		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Conseiller resultConseiller = null;

		try {
			cnx = seConnecter();
			String rechercheBdd = "SELECT * FROM conseiller WHERE idConseiller=?";
			pstmt = cnx.prepareStatement(rechercheBdd);
			pstmt.setInt(1, idConseiller);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				int rConseillerIdConseiller = rs.getInt("idconseiller");
				String rConseillerNom = rs.getString("nom");
				String rConseillerPrenom = rs.getString("prenom");
				String rConseillerLogin = rs.getString("login");
				String rConseillerPsw = rs.getString("mdp");
				// TODO Modifier l'initialisation de l'agence
				// String rConseillerVille = rs.getString("idagence");

				resultConseiller = new Conseiller(rConseillerIdConseiller, rConseillerNom, rConseillerPrenom,
						rConseillerLogin, rConseillerPsw);

			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}

		return resultConseiller;

	}

	@Override
	public void modifierConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Conseiller> lireAllConseillers() {
		// TODO Auto-generated method stub
		return null;
	}

	// partie Compte

	@Override
	public void creerCompteCourant(CompteCourant compteCourant) {

		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String inserBdd = "insert into comptecourant (numcompte, solde,dateouverture,decouvertautorise,cartevisa,idclient,) Values(?,?,?,?,?,?)";
			cnx = seConnecter();
			pstmt = cnx.prepareStatement(inserBdd);
			pstmt.setInt(1, compteCourant.getNumCompte());
			pstmt.setDouble(2, compteCourant.getSolde());
			pstmt.setString(3, compteCourant.getDateOuverture());
			pstmt.setDouble(4, compteCourant.getDecouvertAutorise());
			pstmt.setString(5, compteCourant.getCarteVisa());
			pstmt.setInt(6, compteCourant.getClient().getIdClient());

			pstmt.execute();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}

	}

	@Override
	public CompteCourant lireCompteCourant(int numCompte) {

		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		CompteCourant resultCompteCourant = null;

		try {
			cnx = seConnecter();
			String rechercheBdd = "SELECT * FROM comptecourant WHERE numcompte=?";
			pstmt = cnx.prepareStatement(rechercheBdd);
			pstmt.setInt(1, numCompte);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				int rCompteCourantNumCompte = rs.getInt("numcompte");
				Double rCompteCourantSolde = rs.getDouble("solde");
				String rCompteCourantDateouverture = rs.getString("dateouverture");
				Double rCompteCourantDecouvertautorise = rs.getDouble("decouvertautorise");
				String rCompteCourantCartevisa = rs.getString("cartevisa");

				resultCompteCourant = new CompteCourant(rCompteCourantNumCompte, rCompteCourantSolde,
						rCompteCourantDateouverture, rCompteCourantDecouvertautorise, rCompteCourantCartevisa);

			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}

		return resultCompteCourant;

	}

	@Override
	public void modifierCompteCourant(CompteCourant compteCourant) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			cnx = seConnecter();
			String updateBdd="update comptecourant set numcompte=?, solde=?,dateouverture=?,decouvertautorise=?,cartevisa=?,idclient=? where numcompte = ?";
			cnx = seConnecter();
			pstmt = cnx.prepareStatement(updateBdd);
			pstmt.setInt(1, compteCourant.getNumCompte());
			pstmt.setDouble(2, compteCourant.getSolde());
			pstmt.setString(3, compteCourant.getDateOuverture());
			pstmt.setDouble(4, compteCourant.getDecouvertAutorise());
			pstmt.setString(5, compteCourant.getCarteVisa());
			pstmt.setInt(6, compteCourant.getClient().getIdClient());

			pstmt.execute();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}

	}

	@Override
	public void supprimerCompteCourant(CompteCourant compteCourant) {

		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String inserBdd = "delete from comptecourant where numcompte=?";
			cnx = seConnecter();
			pstmt = cnx.prepareStatement(inserBdd);
			pstmt.setInt(1, compteCourant.getNumCompte());
			pstmt.execute();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}

	}

	@Override
	public void creerCompteEpargne(CompteEpargne compteEpargne) {
		// TODO Auto-generated method stub

	}

	@Override
	public CompteEpargne lireCompteEpargne(int numCompte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifierCompteEpargne(CompteEpargne CompteEpargne) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerCompteEpargne(CompteEpargne CompteEpargne) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Compte> lireAllCompte() {
		// TODO Auto-generated method stub
		return null;
	}

}
