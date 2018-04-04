package service;

import domaine.Conseiller;

/**
 * @author Clothide SZYMEZAK et JB BLANC
 * Interface de connexion du conseiller
 *
 */
public interface IConnexion {

	public Conseiller connexionConseiller(String login);
	
}
