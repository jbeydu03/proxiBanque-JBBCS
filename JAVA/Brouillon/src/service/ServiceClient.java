package service;

import dao.DaoClient;
import dao.IDao;
import domaine.Compte;

public class ServiceClient implements IService {

	IDao dao = new DaoClient();

	@Override
	public void creationClient(int idClient, String nom, String prenom, String adresse, int codePostal, String ville,
			String telephone) {
		dao.creationClient(idClient, nom, prenom, adresse, codePostal, ville, telephone);
	}

	@Override
	public void modifierClient() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lireClient() {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerClient() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lireAllClient() {
		// TODO Auto-generated method stub

	}

	@Override
	public void effectuerVirement(Compte c1, Compte c2) {
		// TODO Auto-generated method stub

	}

	@Override
	public double simulerCredit(double montantEmprunt, int dureeMois, double txCredit) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void realiserAudit() {
		// TODO Auto-generated method stub

	}

}
