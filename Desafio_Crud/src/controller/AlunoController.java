package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AlunoDao;
import model.Aluno;




@WebServlet (name = "Alunos", urlPatterns = {"/AlunoController"})
public class AlunoController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static String INSERT_OR_EDIT = "/aluno.jsp";
	private static String LIST_ALUNO = "/listAluno.jsp";
	private AlunoDao dao;
	
	public AlunoController() {
		super();
		dao = new AlunoDao();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward="";
		String action = request.getParameter("action");
		
		if (action.equalsIgnoreCase("delete")) {
				int aluno_id = Integer.parseInt(request.getParameter("Id"));
				dao.deleteAluno(aluno_id);
				forward = LIST_ALUNO;
				request.setAttribute("alunos", dao.getAllAlunos());
		}else if (action.equalsIgnoreCase("edit")) {
			forward = INSERT_OR_EDIT;
			int aluno_id = Integer.parseInt(request.getParameter("Id"));
			Aluno aluno = dao.getAlunoById(aluno_id);
			request.setAttribute("aluno", aluno);
		}else if (action.equalsIgnoreCase("listAluno")) {
			forward = LIST_ALUNO;
			request.setAttribute("alunos", dao.getAllAlunos());
		}else {
			forward = INSERT_OR_EDIT;
		}
		
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletExceptionm IOException{
		Aluno aluno = new Aluno();
		aluno.setAluno_nome(request.getParameter("Nome"));
		aluno.setAluno_idade(request.getParameter("Idade"));
		String aluno_id = request.getParameter("Id");
		if(aluno_id == null || aluno_id.isEmpty()) {
			dao.createAluno(aluno);
		}else {
			aluno.setAluno_id(Integer.parseInt(aluno_id));
			dao.updateAluno(aluno);
		}
		RequestDispatcher view = request.getRequestDispatcher(LIST_ALUNO);
		view.forward(request, response);
	}
}
