package domaine;

/**
 * @author Clothide SZYMEZAK et JB BLANC classe Personne factorisant les données
 *         communes (nom, prénom) pour la création de personne dans
 *         l'application
 *
 */
public abstract class Personne {

	private String nom;
	private String prenom;

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne() {

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
