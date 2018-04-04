package domaine;

/**
 * @author Clothide SZYMEZAK et JB BLANC
 * Classe CompteEpargne, hérite de la classe compte
 */
public class CompteEpargne extends Compte {

	private double tauxRemuneration;

	public CompteEpargne(int numCompte, double solde, String dateOuverture, double tauxRemuneration,Client client) {
		super(numCompte, solde, dateOuverture, client);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	public CompteEpargne(double solde, String dateOuverture, double tauxRemuneration){
		super(solde, dateOuverture);
		this.tauxRemuneration = tauxRemuneration;

	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
