package domaine;

public class CompteCourant extends Compte {

	private int decouvertAutorise;

	public CompteCourant(int numCompte, double solde, String dateOuverture, int decouvertAutorise) {
		super(numCompte, solde, dateOuverture);
		this.decouvertAutorise = decouvertAutorise;
	}

	public int getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(int decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

}
