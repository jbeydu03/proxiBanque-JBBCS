package dao;

import java.util.List;

import domaine.Conseiller;

public interface IDaoConseiller {
	public void creerConseiller(Conseiller conseiller );

	public Conseiller lireConseiller(int idConseiller);

	public void modifierConseiller(Conseiller conseiller);

	public void supprimerConseiller(Conseiller conseiller);

	public List<Conseiller> lireAllConseillers();
}
