import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.Date;

@SuppressWarnings("serial")
public class ClientNew extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");

		
        ClientData client = new ClientData(
                    req.getParameter("clientId"),
                    req.getParameter("companyName"),
					req.getParameter("countryHq"),
					req.getParameter("contact"),
					req.getParameter("phone"),
					req.getParameter("mail")
                );
				
    int n = ClientData.insertClient(connection, client);
    res.sendRedirect("ClientList");
        
    }
}