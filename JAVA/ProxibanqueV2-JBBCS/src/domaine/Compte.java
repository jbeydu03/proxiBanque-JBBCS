package domaine;

public abstract class Compte {

	private int numCompte;
	private double solde;
	private String dateOuverture;
	private Client client;

	//Constructeur
	
	public Compte(int numCompte, double solde, String dateOuverture, Client client) {
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.client = client;
	}
	
	public Compte(int numCompte, double solde, String dateOuverture ) {
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	
	}
	
	//getters et Setters

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
}
