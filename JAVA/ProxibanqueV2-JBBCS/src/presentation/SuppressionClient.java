package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domaine.Client;
import service.IServiceGestion;
import service.OperationConseiller;

/**
 * Servlet implementation class SuppressionClient
 */
@WebServlet("/SuppressionClient")
public class SuppressionClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IServiceGestion opeconseiller = new OperationConseiller();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SuppressionClient() {
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
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		int codePostal = Integer.parseInt(request.getParameter("codePostal"));
		String ville = request.getParameter("ville");
		String telephone = request.getParameter("telephone");

		Client client = new Client(idClient, nom, prenom, adresse, codePostal, ville, telephone);

		opeconseiller.supprimerClient(client);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Accueil.jsp");
		dispatcher.forward(request, response);

	}

}
