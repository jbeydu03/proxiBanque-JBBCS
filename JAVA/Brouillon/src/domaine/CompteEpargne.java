package domaine;

public class CompteEpargne extends Compte {
	private double txRemuneration;

	public CompteEpargne(int numCompte, double solde, String dateOuverture, double txRemuneration) {
		super(numCompte, solde, dateOuverture);
		this.txRemuneration = txRemuneration;
	}

	public double getTxRemuneration() {
		return txRemuneration;
	}

	public void setTxRemuneration(double txRemuneration) {
		this.txRemuneration = txRemuneration;
	}

}
