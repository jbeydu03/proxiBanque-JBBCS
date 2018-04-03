package domaine;

import java.util.List;

public class Conseiller extends Personne {

	private int idConseiller;
	private List<Client> listeClients;
	private String login;
	private String pwd;

	public Conseiller(int idConseiller, String nom, String prenom, List<Client> listeClients) {
		super(nom, prenom);
		this.idConseiller = idConseiller;
		this.listeClients = listeClients;
	}

	public Conseiller(String login, String pwd) {
		super();
		this.login = login;
		this.pwd = pwd;
	}
	
	public Conseiller(int idConseiller, String nom, String prenom) {
		super(nom, prenom);
		this.idConseiller = idConseiller;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
