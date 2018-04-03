package domaine;

import java.util.List;

public class Conseiller extends Personne {

	private int idConseiller;
	private List<Client> listeClients;

	public Conseiller(int idConseiller, String nom, String prenom, List<Client> listeClients) {
		super(nom, prenom);
		this.idConseiller = idConseiller;
		this.listeClients = listeClients;
	}

	public int getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	public List<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}

}
