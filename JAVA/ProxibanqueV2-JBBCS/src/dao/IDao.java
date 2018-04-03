package dao;

import java.util.List;

import domaine.Client;
import domaine.Conseiller;

public interface IDao {

	
	public void creerClient(Client client);

	public Client lireClient(int idClient);

	public void modifierClient(Client client);

	public void supprimerClient(Client client);

	public List<Client> lireAllClients();
	
}
