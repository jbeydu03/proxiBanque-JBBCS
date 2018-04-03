package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoClient;
import dao.IDao;
import domaine.Client;
import service.IService;
import service.ServiceClient;

/**
 * Servlet implementation class CreationClient
 */
@WebServlet("/CreationClient")
public class CreationClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IService service = new ServiceClient();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreationClient() {
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
		doGet(request, response);
		int idClient = Integer.parseInt(request.getParameter("idClient"));
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		int codePostal = Integer.parseInt(request.getParameter("codePostal"));
		String ville = request.getParameter("ville");
		String telephone = request.getParameter("telephone");

		Client client = new Client(idClient, nom, prenom, adresse, codePostal, ville, telephone);
		request.setAttribute("Client", client);

		service.creationClient(idClient, nom, prenom, adresse, codePostal, ville, telephone);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/CreationCompte.jsp");
		dispatcher.forward(request, response);
	}

}
