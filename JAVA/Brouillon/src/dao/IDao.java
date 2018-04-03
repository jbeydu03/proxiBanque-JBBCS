package dao;

import java.util.ArrayList;

import domaine.Client;

public interface IDao {

	public void creationClient(int idClient, String nom, String prenom, String adresse, int codePostal, String ville,
			String telephone);

	public void modifierClient(int idClient, String nom, String prenom, String adresse, int codePostal, String ville,
			String telephone);

	public Client lireClient(int idClient);

	public void supprimerClient(int idClient);

	public ArrayList<Client> lireAllClient();
}
