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

/**
 * Servlet implementation class SessionConseiller
 */
@WebServlet("/ConnexionConseiller")
public class ConnexionConseiller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConnexionConseiller() {
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
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Récupération des paramètres de requête

		String login = request.getParameter("login");
		String mdp = request.getParameter("pwd");

		// Création de la Session
		Conseiller conseiller = new Conseiller(login, mdp);
		HttpSession session = request.getSession(false);
		session.setAttribute("conseiller", conseiller);

		// Redirection vers la page JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Accueil.jsp");
		dispatcher.forward(request, response);
	}

}
