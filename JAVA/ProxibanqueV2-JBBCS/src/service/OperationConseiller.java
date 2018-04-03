package service;

import java.util.ArrayList;
import java.util.List;

import dao.DaoClient;
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
	
			DaoClient dCreerClients = new DaoClient();
			dCreerClients.creerClient(client);
		
	}

	@Override
	public Client lireClient(int idClient) {
		DaoClient dLireClient = new DaoClient();
		Client sClient = dLireClient.lireClient(1);
		return sClient;
	}

	@Override
	public void modifierClient(Client client) {
		DaoClient dCreerClients = new DaoClient();
		dCreerClients.modifierClient(client);

	}

	@Override
	public void supprimerClient(Client client) {
		DaoClient dSupprimerClient = new DaoClient();
		dSupprimerClient.supprimerClient(client);
	}

	@Override
	public List<Client> lireAllClients() {
		DaoClient dLireAllClients = new DaoClient();
		List<Client> sLireAllClients = dLireAllClients.lireAllClients();
		return sLireAllClients;
	}

}
