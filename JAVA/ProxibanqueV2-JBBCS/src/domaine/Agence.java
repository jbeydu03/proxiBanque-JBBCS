package domaine;

public class Agence {

	private String idAgence;
	private String dateCreation;

	public Agence(String idAgence, String dateCreation) {
		super();
		this.idAgence = idAgence;
		this.dateCreation = dateCreation;
	}

	public String getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(String idAgence) {
		this.idAgence = idAgence;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
}
