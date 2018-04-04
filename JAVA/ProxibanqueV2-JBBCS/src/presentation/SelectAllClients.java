package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domaine.Conseiller;
import service.IServiceGestion;
import service.OperationConseiller;

/**
 * Servlet implementation class SelectAllClients
 * 
 * @author Clothide SZYMEZAK et JB BLANC Utilisation en GET pour afficher tous
 *         les clients d'un conseiller
 * 
 */
@WebServlet("/SelectAllClients")
public class SelectAllClients extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IServiceGestion opeconseiller = new OperationConseiller();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SelectAllClients() {
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
		Conseiller conseiller = new Conseiller(1, "DarkVador", "luc");
		int idConseiller = conseiller.getIdConseiller();
		request.setAttribute("listeclients", opeconseiller.lireAllClientsParConseiller(idConseiller));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ListeClients.jsp");
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
