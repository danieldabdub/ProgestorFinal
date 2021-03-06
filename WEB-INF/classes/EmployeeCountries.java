import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Vector;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

@SuppressWarnings("serial")
public class EmployeeCountries extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        String employeeId = req.getParameter("employeeId");
        PrintWriter toClient = res.getWriter();
        
        
        Vector<CountryData> employeeCountries = CountryData.getEmployeeCountryList(connection, employeeId);
        
        toClient.println("<h2 align='center'> Countries </h2>");
        toClient.println("<table class='Table1' id='employeesCountries' border='1'>");
        toClient.println("<thead>");
        toClient.println("<tr>");
        toClient.println("<th>Country</th>"); //Pending expire date
        toClient.println("</tr>"); 
        toClient.println("</thead>"); 
        
        for (int i=0; i<employeeCountries.size();i++) {
            CountryData countries = employeeCountries.elementAt(i);
            toClient.println("<tr>");
            toClient.println("<td>" + countries.countryName + "</td>");
            toClient.println("</tr>");
        }
        toClient.println("</table>");
        
        toClient.close();
    }
}