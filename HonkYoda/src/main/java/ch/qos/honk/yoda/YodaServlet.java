package ch.qos.honk.yoda;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.honk.common.Fruit;

/**
 * Servlet implementation class YodaServlet
 */
public class YodaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Logger logger = LoggerFactory.getLogger(YodaServlet.class);
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YodaServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.append("Served at: ").append(request.getContextPath());
		logger.info("hello yoda");
		Fruit fruit = new Fruit();
		fruit.foo("Yoda");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
