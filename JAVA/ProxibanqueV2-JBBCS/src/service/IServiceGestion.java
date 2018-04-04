package service;

import java.util.List;

import domaine.Client;
import domaine.CompteCourant;
import domaine.CompteEpargne;

public interface IServiceGestion {

	public void creerClient(Client client);

	public Client lireClient(int idClient);

	public void modifierClient(Client client);

	public void supprimerClient(Client client);

	public List<Client> lireAllClients();

	public List<Client> lireAllClientsParConseiller(int idConseiller);

	public void ajouterCompteCourant(CompteCourant courant, int idClient);

	public CompteCourant lireCompteCourant(int idClient);

	public void ajouterCompteEpargne(CompteEpargne epargne, int idClient);

	public CompteEpargne lireCompteEpargne(int idClient);
}
