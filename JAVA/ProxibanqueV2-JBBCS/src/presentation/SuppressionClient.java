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
 * 
 * Servlet implementation class SuppressionClient
 * 
 * @author Clothide SZYMEZAK et JB BLANC Utilisation en GET pour supprimer un
 *         client par son id
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
		int idClient = Integer.parseInt(request.getParameter("idclient"));

		Client client = new Client(idClient);
		opeconseiller.supprimerClient(client);

		RequestDispatcher dispatcher = request.getRequestDispatcher("SelectAllClients");
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
