package dao;

import java.util.List;

import domaine.Conseiller;

/**
 * @author Clothide SZYMEZAK et JB BLANC Opération du CRUD sur les conseillers
 */
public interface IDaoConseiller {

	public void creerConseiller(Conseiller conseiller);

	public Conseiller lireConseiller(int idConseiller);

	public void modifierConseiller(Conseiller conseiller);

	public void supprimerConseiller(Conseiller conseiller);

	public List<Conseiller> lireAllConseillers();

	public Conseiller lireConseillerParLogin(String login);
}
