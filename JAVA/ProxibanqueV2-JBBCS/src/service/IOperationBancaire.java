package service;

import domaine.Compte;

/**
 * @author Clothide SZYMEZAK et JB BLANC Signature de m�thode pour r�aliser un
 *         virements
 */
public interface IOperationBancaire {

	public void effectuerVirement(Compte compteCrediteur, Compte compteDebiteur, double montant);

	public double simulerCredit(double montantEmprunt, int nbMois, double tauxInteret);
}
