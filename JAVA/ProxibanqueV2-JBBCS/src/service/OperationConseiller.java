package service;

import java.util.List;

import dao.Dao;
import domaine.Client;
import domaine.Compte;

public class OperationConseiller implements IServiceGestion, IOperationBancaire {

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
		Client sClient = dLireClient.lireClient(1);
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

}
