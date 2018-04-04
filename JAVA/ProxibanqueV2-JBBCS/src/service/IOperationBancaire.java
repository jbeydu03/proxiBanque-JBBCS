package service;

import domaine.Compte;

/**
 * @author Clothide SZYMEZAK et JB BLANC Signature de méthode pour réaliser un
 *         virements
 */
public interface IOperationBancaire {

	public void effectuerVirement(Compte compteCrediteur, Compte compteDebiteur, double montant);

	public double simulerCredit(double montantEmprunt, int nbMois, double tauxInteret);
}
