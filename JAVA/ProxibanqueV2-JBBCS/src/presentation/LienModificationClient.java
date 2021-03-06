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
 * Servlet implementation class ModificationClient
 * 
 * @author Clothide SZYMEZAK et JB BLANC Utilisation en GET pour atteindre la
 *         fiche d'un client en modification
 */
@WebServlet("/LienModificationClient")
public class LienModificationClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IServiceGestion opeconseiller = new OperationConseiller();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LienModificationClient() {
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

		RequestDispatcher dispatcher = request.getRequestDispatcher("/ModificationClient.jsp");
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
