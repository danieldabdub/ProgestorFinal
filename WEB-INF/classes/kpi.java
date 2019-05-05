import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.Date;

@SuppressWarnings("serial")
public class kpi extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();

        // HACER UN HEADER EN UTILS UNICO PARA KPI
        
        toClient.println(Utils.headerKPI("KPIs"));
		
        int numActiveProjects = ProjectData.getNumberOfActiveProjects(connection);
		int numFinishedProjects = ProjectData.getNumberOfFinishedProjects(connection);
		int numDelayedProjects = ProjectData.getNumberOfDelayedProjects(connection);
		
		Vector<ProjectData> delayedProjectList;
        delayedProjectList = ProjectData.getDelayedProjectList(connection);
		
		int numAssignedEmployees = EmployeeData.getNumberAssignedEmployees(connection);
		int numEmployees = EmployeeData.getNumberEmployees(connection);
		
		Vector<CountryData> countryProjectsList;
        countryProjectsList = CountryData.getNumberOfProjectsCountry(connection);
   
        toClient.println("<div class='row'>");
        toClient.println("<div class='column left'>");
            
            toClient.println("<script type='text/javascript' src='https://www.gstatic.com/charts/loader.js'></script>");
            
            toClient.println("<script src='donut.js'></script>   "); 
            
            toClient.println("<div id='donut_single' style='width: 900px; height: 500px;'></div>");
            
        toClient.println("</div>");
    
        toClient.println("<div class='column right'>");
            toClient.println("<br><br><br><br><br>");
            toClient.println("<table>");
        
            toClient.println(" <tr><td><div><i class='far fa-calendar' style='font-size:48px'></i><font size='6'> - Active Projects:</font><font size='6' color=#962B33><b>"+ numActiveProjects +"</b></font></div><br><br><br></td></tr>");
            
            toClient.println("<tr><td><div><i class='fa fa-check' style='font-size:48px'></i><font size='6'> - Finished Projects:</font> <font  size='6' color=#962B33><b>" + numFinishedProjects + "</b></font></div><br><br><br></td></tr>");
            
            toClient.println("<tr><td onclick='openForm()'><div><i class='fa fa-thumbs-o-down' style='font-size:48px'></i> <font size='6'> - Delayed Projects:</font> <font size='6' color=#962B33><b> "+ numDelayedProjects +" </b></font></div></td></tr>");
            toClient.println("</table>");
        
            
            toClient.println("<div class='form-popup' id='myForm'>");
                toClient.println("<form class='form-container'>");
                toClient.println("<h1>Delayed Projects</h1>");
        
                    toClient.println("<table class='Table1'>");
                    toClient.println("<thead>");
		            toClient.println("<tr>");
                            toClient.println("<th>Project</th>");
                            toClient.println("<th>Day Delayed</th></tr>");
        
                    toClient.println("</thead>");
					toClient.println("<tbody>");
                    
        
						 for(int i=0; i< delayedProjectList.size(); i++){
							 
								ProjectData project =delayedProjectList.elementAt(i);
								toClient.println("<tr>");
								toClient.println("<td><a href='ProjectView?id=" + project.projectId + "'>"+ project.projectId +"</a></td>");
								toClient.println("<td>" + project.daysDelayed + " </td>");
								toClient.println("</tr>");
						}
		
		
					toClient.println("</tbody>");
					toClient.println("</table>");
        
        
                    toClient.println("<br><br>");
          
                toClient.println("<button type='button' class='btn cancel' onclick='closeForm()'>Close</button>");
                toClient.println("</form>");
            toClient.println("</div>");
        
         toClient.println("</div>");
        
    toClient.println("</div>");
    
    toClient.println("<script>");
        toClient.println("function openForm() {");
          toClient.println("document.getElementById('myForm').style.display = 'block';");
        toClient.println("}");

        toClient.println("function closeForm() {");
          toClient.println("document.getElementById('myForm').style.display = 'none';");
        toClient.println("}");
    toClient.println("</script>");
        
    toClient.println("<script>");
                             
        // SEGUN ESTO ME PASAN AL DONUT
        
        toClient.println("rawData=[{\"value\":"+ numAssignedEmployees +"},{\"value\":"+ (numEmployees - numAssignedEmployees) +"}];");
    
    toClient.println("</script>");
        
//		toClient.println(numActiveProjects);
//		toClient.println(numFinishedProjects);
//		toClient.println(numDelayedProjects);
//		
//		toClient.println(numAssignedEmployees);
//		toClient.println(numEmployees);
//		
        
        toClient.println(Utils.footer());
        toClient.close();
    }
}