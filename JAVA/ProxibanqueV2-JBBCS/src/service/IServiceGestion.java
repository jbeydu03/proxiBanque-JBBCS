package service;

import java.util.List;

import domaine.Client;

public interface IServiceGestion {

	public void creerClient(Client client);

	public Client lireClient(int idClient);

	public void modifierClient(Client client);

	public void supprimerClient(Client client);

	public List<Client> lireAllClients();
}
