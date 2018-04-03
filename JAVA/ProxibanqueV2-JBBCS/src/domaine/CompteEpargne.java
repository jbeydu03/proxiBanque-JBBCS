package domaine;

public class CompteEpargne extends Compte {

	private double tauxRemuneration;

	public CompteEpargne(int numCompte, double solde, String dateOuverture, double tauxRemuneration) {
		super(numCompte, solde, dateOuverture);
		this.tauxRemuneration = tauxRemuneration;
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
