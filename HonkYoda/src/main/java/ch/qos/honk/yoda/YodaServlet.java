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
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.core.joran.spi.JoranException;

/**
 * Servlet implementation class YodaServlet
 */
public class YodaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private LoggerContext defaultLoggerContext = new LoggerContext();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YodaServlet() {
        super();
        initLogging();
    }

	private void initLogging() {
		 try {
			 defaultLoggerContext.setName("yoda-context");
			new ContextInitializer(defaultLoggerContext).autoConfig();
		} catch (JoranException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.append("Served at: ").append(request.getContextPath());
		Logger logger = defaultLoggerContext.getLogger(this.getClass());
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
