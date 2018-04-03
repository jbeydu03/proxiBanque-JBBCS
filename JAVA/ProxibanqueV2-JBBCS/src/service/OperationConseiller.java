package service;

import java.util.List;

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
		// TODO Auto-generated method stub

	}

	@Override
	public Client lireClient(int idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifierClient(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerClient(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Client> lireAllClients() {
		// TODO Auto-generated method stub
		return null;
	}

}
