package domaine;

/**
 * @author Clothide SZYMEZAK et JB BLANC classe Client factorisant héritant de
 *         la classe personne
 */
public class Client extends Personne {

	private int idClient;
	private String adresse;
	private String ville;
	private int codePostal;
	private String telephone;
	private Conseiller conseiller;

	public Client(int idClient, String nom, String prenom, String adresse, int codePostal, String ville,
			String telephone, Conseiller conseiller) {
		super(nom, prenom);
		this.idClient = idClient;
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.telephone = telephone;
		this.conseiller = conseiller;
	}

	public Client(String nom, String prenom, String adresse, int codePostal, String ville, String telephone,
			Conseiller conseiller) {
		super(nom, prenom);
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.telephone = telephone;
		this.conseiller = conseiller;
	}

	public Client(int idClient, String nom, String prenom, String adresse, int codePostal, String ville,
			String telephone) {
		super(nom, prenom);
		this.idClient = idClient;
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.telephone = telephone;
	}

	public Client(String nom, String prenom, String adresse, int codePostal, String ville, String telephone) {
		super(nom, prenom);
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.telephone = telephone;
	}

	public Client(int idClient) {
		super();
		this.idClient = idClient;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
}
