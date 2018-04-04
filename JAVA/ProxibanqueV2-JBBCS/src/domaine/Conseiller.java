package domaine;

import java.util.List;

/**
 * @author Clothide SZYMEZAK et JB BLANC
 * Classe conseiller
 *
 */
public class Conseiller extends Personne {

	private int idConseiller;
	private List<Client> listeClients;
	private String login;
	private String pwd;
	private Agence agence;


	 //Constructeur

	
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
	
	public Conseiller(int idConseiller, String nom, String prenom, String login, String pwd) {
		super(nom, prenom);
		this.idConseiller = idConseiller;
		this.login = login;
		this.pwd = pwd;
	}
	

	 //getters & setters
	
	
	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
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
