package service;

import domaine.Compte;

public interface IService {

	public void creationClient(int idClient, String nom, String prenom, String adresse, int codePostal, String ville,
			String telephone);

	public void modifierClient();

	public void lireClient();

	public void supprimerClient();

	public void lireAllClient();

	public void effectuerVirement(Compte c1, Compte c2);

	public double simulerCredit(double montantEmprunt, int dureeMois, double txCredit);

	public void realiserAudit();

}
