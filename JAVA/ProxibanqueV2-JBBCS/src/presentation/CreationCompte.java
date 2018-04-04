package presentation;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domaine.Client;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import service.IServiceGestion;
import service.OperationConseiller;

/**
 * Servlet implementation class CreationCompte
 * 
 * @author Clothide SZYMEZAK et JB BLANC
 * Utilisation en POST pour associer la création de compte (courant et/ou epargne) à un utilisateur
 * 
 * 
 */
@WebServlet("/CreationCompte")
public class CreationCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IServiceGestion opeconseiller = new OperationConseiller();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreationCompte() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idClient = Integer.parseInt(request.getParameter("idclient"));
		if (request.getParameter("compteC") != null) {

			double solde = Double.parseDouble(request.getParameter("soldecourant"));
			String dateOuverture = new Date().toString();
			double decouvertAutorise = Double.parseDouble(request.getParameter("decouvert"));
			String carteVisa = request.getParameter("cartevisa");

			CompteCourant courant = new CompteCourant(solde, dateOuverture, decouvertAutorise, carteVisa);
			opeconseiller.ajouterCompteCourant(courant, idClient);
		}
		if (request.getParameter("compteE") != null) {

			double solde = Double.parseDouble(request.getParameter("soldeepargne"));
			String dateOuverture = new Date().toString();
			double tauxRemuneration = Double.parseDouble(request.getParameter("tauxremuneration"));

			// Client client = new Client(3, "lala", "nom", "adresse", 45000, "ville",
			// "telephone");

			CompteEpargne epargne = new CompteEpargne(solde, dateOuverture, tauxRemuneration);
			opeconseiller.ajouterCompteEpargne(epargne, idClient);

		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("SelectAllClients");
		dispatcher.forward(request, response);
	}

}
