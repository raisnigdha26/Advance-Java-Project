import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServelet
 */
@WebServlet("/SecondServelet")
public class SecondServelet extends HttpServlet {
	private ServletConfig config = null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("In init method");
		this.config = config;
        System.out.println("iniside init method : " + config.getServletName());
	}
	
    public ServletConfig getServletConfig() {
        return this.config;
    }


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("In service method");
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        out.print("<b> Servlet Interface Example</b>");
        out.print("<h2> Hello! I am Snigdha Rai </h2>");
        out.print("<p> This is a paragraph </p> ");
        out.print("<b> <div> <div> This is a div </div> <div> Another div inside div </div> </div> </b>");
        out.print("<img src=\"E:\\BOOKS\\Vinnuu\\IMG_20211112_103941.jpg\"/>" );
        out.print("</body></html>");

	}
	public String getServletInfo() {
        return "Demonstrated implementaton of Servlet interface";
    }

    @Override
    public void destroy() {
        System.out.println("inside destroy method");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
