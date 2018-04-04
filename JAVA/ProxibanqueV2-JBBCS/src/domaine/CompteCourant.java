package domaine;
/**
 * @author Clothide SZYMEZAK et JB BLANC
 * Classe CompteCourant, hérite de la classe compte
 */
public class CompteCourant extends Compte {

	private double decouvertAutorise;
	private String carteVisa;

	public CompteCourant(int numCompte, double solde, String dateOuverture, double decouvertAutorise,
			String carteVisa, Client client) {
		super(numCompte, solde, dateOuverture, client);
		this.decouvertAutorise = decouvertAutorise;
		this.carteVisa = carteVisa;
	}
	
	public CompteCourant(int numCompte, double solde, String dateOuverture, double decouvertAutorise,
			String carteVisa) {
		super(numCompte, solde, dateOuverture);
		this.decouvertAutorise = decouvertAutorise;
		this.carteVisa = carteVisa;
	}

	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

	public String getCarteVisa() {
		return carteVisa;
	}

	public void setCarteVisa(String carteVisa) {
		this.carteVisa = carteVisa;
	}
}
