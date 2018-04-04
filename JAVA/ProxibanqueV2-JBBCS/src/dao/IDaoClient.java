package dao;

import java.util.List;

import domaine.Client;

public interface IDaoClient {

	public void creerClient(Client client);

	public Client lireClient(int idClient);

	public void modifierClient(Client client);

	public void supprimerClient(Client client);

	public List<Client> lireAllClients();
	
	public List<Client> lireClientsParConseiller(int idConseiller);

}
