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
import service.IConnexion;
import service.OperationConseiller;

/**
 * Servlet implementation class ConnexionConseiller
 * 
 * @author Clothide SZYMEZAK et JB BLANC
 * Utilisation en POST pour le traitement de la connexion du conseiller
 */
@WebServlet("/ConnexionConseiller")
public class ConnexionConseiller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IConnexion opeconseiller = new OperationConseiller();

	/**
	 * Default constructor.
	 */
	public ConnexionConseiller() {
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
		String login = request.getParameter("login");
		String pwd = request.getParameter("pwd");

		Conseiller conseillerPage = new Conseiller(login, pwd);
		Conseiller conseillerBDD = opeconseiller.connexionConseiller(login);

		RequestDispatcher dispatcher;
		if (login.isEmpty() || pwd.isEmpty() || conseillerBDD == null) {
			dispatcher = request.getRequestDispatcher("ErreurAuthentification.jsp");
		} else if (conseillerBDD.getLogin().equals(conseillerPage.getLogin())
				&& conseillerBDD.getPwd().equals(conseillerPage.getPwd())) {
			
			HttpSession session = request.getSession(false);
			session.setAttribute("conseiller", conseillerBDD);
			
			dispatcher = request.getRequestDispatcher("Accueil.jsp");
		} else {
			dispatcher = request.getRequestDispatcher("ErreurAuthentification.jsp");
		}

		dispatcher.forward(request, response);
	}

}
