package dao;

import java.util.List;

import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;


/**
 * @author Clothide SZYMEZAK et JB BLANC
 * Signature de méthodes pour les comptes courants et comptes epargnes
 * Liste de tous les comptes
 *
 */
public interface IDaoCompte {

	//partie compte courant
	
	public void creerCompteCourant(CompteCourant compteCourant);

	public CompteCourant lireCompteCourant(int numCompte);

	public void modifierCompteCourant(CompteCourant CompteCourant);

	public void supprimerCompteCourant(CompteCourant CompteCourant);

	
	//partie compte epargne
	
	public void creerCompteEpargne(CompteEpargne compteEpargne);
	
	public CompteEpargne lireCompteEpargne(int numCompte);

	public void modifierCompteEpargne(CompteEpargne CompteEpargne);

	public void supprimerCompteEpargne(CompteEpargne CompteEpargne);
	
	
	//partie compte 
	
	public List<Compte> lireAllCompte();
}
