import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

public class CountryList extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
		
        toClient.println(Utils.header("Countries"));
		toClient.println("<table class='Table1'>");
		toClient.println("<thead>");
		toClient.println("<tr>");
		toClient.println("<th>Country Name</th>");
		toClient.println("<th>Processing Time</th>");
        toClient.println("<th>Validity Time</th>");
		toClient.println("</thead>");
		
		
        Vector<CountryData> CountryList;
        CountryList= CountryData.getCountryList(connection);
        for(int i=0; i< CountryList.size(); i++){
                CountryData country =CountryList.elementAt(i);
                toClient.println("<tr>");
				toClient.println("<td><a href='CountryView?id=" + country.countryName + "'>"+ country.countryName +"</a></td>");
                toClient.println("<td>" + country.processingTime + " </td>");
                toClient.println("<td>" + country.validityTime + " </td>");
                toClient.println("</tr>");


        }
		
		
		toClient.println("</tbody>");
        toClient.println("</table>");
		toClient.println("</body>");
		toClient.println(Utils.footer());
        toClient.close();
    }
}