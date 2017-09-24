package WebLesson;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegistServlet extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
				req. setCharacterEncoding("UTF-8");

				String english = req.getParameter("english");
				String japanese = req.getParameter("japanese");

				ArrayList<Word> words = new ArrayList<Word>();
				WordDAO wdao = new WordDAO();
				Word wd = new Word(english, japanese);
				words.add(wd);
				int count = wdao.registWords(words);
				HttpSession session = req. getSession(true);
				session.setAttribute("registCount", count);

				wdao.registWords(words);

				int wordNum = wdao.getWords().size();

				session.setAttribute("total", wordNum);

				req.getRequestDispatcher("result.jsp").forward(req, res);
		}
	}