package service;

import domaine.Compte;

public interface IOperationBancaire {

	public void effectuerVirement(Compte compteCrediteur, Compte compteDebiteur, double montant);

	public double simulerCredit(double montantEmprunt, int nbMois, double tauxInteret);
}
