package service;

import java.util.List;

import dao.Dao;
import domaine.Client;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.Conseiller;

public class OperationConseiller implements IServiceGestion, IOperationBancaire, IConnexion {

	@Override
	public void effectuerVirement(Compte compteCrediteur, Compte compteDebiteur, double montant) {
		// TODO Auto-generated method stub

	}

	@Override
	public double simulerCredit(double montantEmprunt, int nbMois, double tauxInteret) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void creerClient(Client client) {

		Dao dCreerClients = new Dao();
		dCreerClients.creerClient(client);

	}

	@Override
	public Client lireClient(int idClient) {
		Dao dLireClient = new Dao();
		Client sClient = dLireClient.lireClient(idClient);
		return sClient;
	}

	@Override
	public void modifierClient(Client client) {
		Dao dCreerClients = new Dao();
		dCreerClients.modifierClient(client);

	}

	@Override
	public void supprimerClient(Client client) {
		Dao dSupprimerClient = new Dao();
		dSupprimerClient.supprimerClient(client);
	}

	@Override
	public List<Client> lireAllClients() {
		Dao dLireAllClients = new Dao();
		List<Client> sLireAllClients = dLireAllClients.lireAllClients();
		return sLireAllClients;
	}

	@Override
	public Conseiller connexionConseiller(String login) {
		Dao dConnexionConseiller = new Dao();
		Conseiller sConnexion = dConnexionConseiller.lireConseillerParLogin(login);
		return sConnexion;
	}

	@Override
	public List<Client> lireAllClientsParConseiller(int idConseiller) {
		Dao dLireAllClientsParConseiller = new Dao();
		List<Client> sLireAllClientsParConseiller = dLireAllClientsParConseiller.lireClientsParConseiller(idConseiller);
		return sLireAllClientsParConseiller;
	}

	@Override
	public void ajouterCompteCourant(CompteCourant courant, int idClient) {
		Dao dCreerCompteCourant = new Dao();
		dCreerCompteCourant.creerCompteCourant(courant, idClient);

	}

	@Override
	public CompteCourant lireCompteCourant(int idClient) {
		Dao dLireCompteCourant = new Dao();
		CompteCourant sCompteCourant = dLireCompteCourant.lireCompteCourant(idClient);
		return sCompteCourant;

	}

	@Override
	public void ajouterCompteEpargne(CompteEpargne epargne, int idClient) {
		Dao dCreerCompteEpargne = new Dao();
		dCreerCompteEpargne.creerCompteEpargne(epargne, idClient);

	}

	@Override
	public CompteEpargne lireCompteEpargne(int idClient) {
		Dao dLireCompteEpargneCourant = new Dao();
		CompteEpargne sCompteEpargne = dLireCompteEpargneCourant.lireCompteEpargne(idClient);
		return sCompteEpargne;
	}

}
