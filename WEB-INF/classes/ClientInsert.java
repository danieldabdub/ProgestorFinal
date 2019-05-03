import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.Date;

@SuppressWarnings("serial")
public class ClientInsert extends HttpServlet {
    Connection connection;

	//the method init is executed when the servlet starts working
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();

        
		toClient.println(Utils.header(" New Client "));
		
        toClient.println("<form action='ClientNew' method='GET'>");
		
        toClient.println("<table class='Table1'>");
        toClient.println("<tr><td>clientId</td>");
        toClient.println("<td><input name='clientId'></td></tr>");
        
		toClient.println("<tr><td>Client</td>");
        toClient.println("<td><input name='companyName'></td></tr>");

		toClient.println("<tr><td>HQ</td>");
        toClient.println("<td><input name='countryHq' ></td>");		
	
	    toClient.println("<tr><td>Contact</td>");
        toClient.println("<td><input name='contact' ></td>");
		
        toClient.println("<tr><td>Phone</td>");
        toClient.println("<td><input name='phone' ></td>");
        toClient.println("</tr>");
		
		toClient.println("<tr><td>Mail</td>");
        toClient.println("<td><input name='mail' ></td>");
        toClient.println("</tr>");

        toClient.println("</table>");
		toClient.println("<div style='text-align: right;'>");
		toClient.println("<button class='button button1'  type='submit'>Save</button>");
		toClient.println("</div>");
        toClient.println("</form>");
		
        toClient.println(Utils.footer());
        toClient.close();
    }
}