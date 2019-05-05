public class Utils {
    public static String headerKPI(String title) {
        StringBuilder str = new StringBuilder();
        str.append("<head>");
        str.append("<A HREF='menu'>");
        str.append("<IMG SRC='logo.png' style='left;width:266,7px;height:150px;'>");
        str.append("</A>");
        str.append("<title>"+ title +"</title>");
        
        str.append("<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' crossorigin='anonymous'>");
        str.append("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>");
        
        str.append("<link rel='stylesheet' type='text/css' href='styleKPI.css'>");
        str.append("<link rel='stylesheet' type='text/css' href='style.css'></head>");
		
		str.append("<body>");
        str.append("<div class='dropdown' style='float: right;'>");
        str.append("<button  class='dropbtn'><b>__<br>__<br>__</b></button>");
        str.append("<div class='dropdown-content'>");
        str.append("<a href='#'>Search</a>");
        str.append("<a href='#'>Notifications</a>");
        str.append("<a href='Dashboard'>Dashboard</a>");
        str.append("<a href='ProjectList'>Projects</a>");
        str.append("<a href='ClientList'>Clients</a>");
        str.append("<a href='EmployeeList'>Employees</a>");
        str.append("<a href='QualificationList'>Qualifications</a>");
		str.append("<a href='CountryList'>Countries</a>");
        str.append("</div>");
        str.append("</div>");           
        str.append("<h1 align ='center'>" + title + "</h1>");
        return str.toString();
    }
    
    public static String header(String title) {
        StringBuilder str = new StringBuilder();
        str.append("<head>");
        str.append("<A HREF='menu'>");
        str.append("<IMG SRC='logo.png' style='left;width:266,7px;height:150px;'>");
        str.append("</A>");
        str.append("<title>"+ title +"</title>");
        str.append("<link rel='stylesheet' type='text/css' href='style.css'></head>");
        str.append("<div class='dropdown' style='float: right;'>");
        str.append("<button  class='dropbtn'><b>__<br>__<br>__</b></button>");
        str.append("<div class='dropdown-content'>");
        str.append("<a href='#'>Search</a>");
        str.append("<a href='#'>Notifications</a>");
        str.append("<a href='Dashboard'>Dashboard</a>");
        str.append("<a href='ProjectList'>Projects</a>");
        str.append("<a href='ClientList'>Clients</a>");
        str.append("<a href='EmployeeList'>Employees</a>");
        str.append("<a href='QualificationList'>Qualifications</a>");
		str.append("<a href='CountryList'>Countries</a>");
        str.append("</div>");
        str.append("</div>");           
        str.append("<h1 align ='center'>" + title + "</h1>");
        return str.toString();
    }
    
    public static String headerD(String title) {
        StringBuilder str = new StringBuilder();
        str.append("<head>");
        str.append("<A HREF='Menu.html'>");
        str.append("<IMG SRC='logo.png' style='left;width:266,7px;height:150px;'>");
        str.append("</A>");
        str.append("<title>"+ title +"</title>");
        str.append("<link rel='stylesheet' type='text/css' href='style.css'></head>");
        str.append("<link rel='stylesheet' type='text/css' href='style1.css'>");
        str.append("<div class='dropdown' style='float: right;'>");
        str.append("<button  class='dropbtn'><b>__<br>__<br>__</b></button>");
        str.append("<div class='dropdown-content'>");
        str.append("<a href='#'>Search</a>");
        str.append("<a href='#'>Notifications</a>");
        str.append("<a href='Dashboard'>Dashboard</a>");
        str.append("<a href='ProjectList'>Projects</a>");
        str.append("<a href='ClientList'>Clients</a>");
        str.append("<a href='EmployeeList'>Employees</a>");
        str.append("<a href='QualificationList'>Qualifications</a>");
		str.append("<a href='CountryList'>Countries</a>");
        str.append("</div>");
        str.append("</div>");           
        str.append("<h1 align ='center'>" + title + "</h1>");
        return str.toString();
    }
    
    
    public static String footer(){
        StringBuilder str = new StringBuilder();
		str.append("<br>");
		str.append("<br>");
		str.append("<br>");
		str.append("<br>");
		str.append("<br>");
		str.append("<br>");
		str.append("<br>");
		str.append("<br>");
		str.append("<br>");
		str.append("<hr style= 'color:#FFFFFF;' noshade='noshade' width='0%' height: 0px border='0' bordercolor='#FFFFFF'/>");
        
		str.append("<div style='text-align: right;' class='navbar'>");
        str.append("<a href='#'><b>About Us</b></a>");
        str.append("<a href='#'>Search</a>");
        str.append("<a href='#'>Notifications</a>");
        str.append("<a href='Dashboard'>Dashboard</a>");
        str.append("<a href='ProjectList'>Projects</a>");
        str.append("<a href='ClientList'>Clients</a>");
        str.append("<a href='EmployeeList'>Employees</a>");
        str.append("<a href='QualificationList'>Qualifications</a>");
		str.append("<a href='CountryList'>Countries</a>");
        str.append("<p> <font color='white'>Sancho el sabio n8 8 Izq. </font></p>");
        str.append("<p> <font color='white'>654-321-000 </font></p>");
        str.append("<p> <font color='white'>help@progestor.es</font></p>");
        return str.toString();
		
		
    }
	
	public static String footerD(){
        StringBuilder str = new StringBuilder();
        str.append("<div style='text-align: right;' class='navbardash'>");
        str.append("<a href='#'><b>About Us</b></a>");
        str.append("<a href='#'>Search</a>");
        str.append("<a href='#'>Notifications</a>");
        str.append("<a href='Dashboard'>Dashboard</a>");
        str.append("<a href='ProjectList'>Projects</a>");
        str.append("<a href='ClientList'>Clients</a>");
        str.append("<a href='EmployeeList'>Employees</a>");
        str.append("<a href='QualificationList'>Qualifications</a>");
		str.append("<a href='CountryList'>Countries</a>");
        str.append("<p> <font color='white'>Sancho el sabio n8 / 8 Izq. </font></p>");
        str.append("<p> <font color='white'>654-321-000 </font></p>");
        str.append("<p> <font color='white'>help@progestor.es</font></p>");
        return str.toString();
		
		
    }
	

    }

