package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.IServiceGestion;
import service.OperationConseiller;

/**
 * Servlet implementation class AffichageClient
 * 
 * @author Clothide SZYMEZAK et JB BLANC Utilisation en GET pour afficher les
 *         donn�es d'un client et ses comptes associ�s.
 */
@WebServlet("/AffichageClient")
public class AffichageClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IServiceGestion opeconseiller = new OperationConseiller();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AffichageClient() {
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
		int idClient = Integer.parseInt(request.getParameter("idclient"));

		request.setAttribute("client", opeconseiller.lireClient(idClient));
		request.setAttribute("comptecourant", opeconseiller.lireCompteCourant(idClient));
		request.setAttribute("compteepargne", opeconseiller.lireCompteEpargne(idClient));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/AffichageClient.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
