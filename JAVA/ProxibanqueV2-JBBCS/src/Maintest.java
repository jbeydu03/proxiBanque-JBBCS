import java.util.List;

import domaine.Client;
import domaine.Conseiller;
import service.OperationConseiller;

public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		System.out.println("-----------------");
		
		
		OperationConseiller OC = new OperationConseiller();
		Client c1 = OC.lireClient(1);
		System.out.println(c1.getNom());

		System.out.println("-----------------");
		List<Client> lC1 = OC.lireAllClients();
		for (Client client : lC1) {
			System.out.println(client.getPrenom());
		}
		
		System.out.println("-----------------");
		
		Conseiller cons1 = new Conseiller(1,"test","root");
		Client cli1 = new Client("Le Cigne","Anthony", "4 rue de bac", 75015, "Paris", "0800727272", cons1);
		//OC.creerClient(cli1);
		
		System.out.println("-----------------");
		cli1.setIdClient(4);
		cli1.setCodePostal(77015);
		//OC.modifierClient(cli1);
		
		//OC.supprimerClient(cli1);
		System.out.println("ça marche !");
		
		

	}

}
