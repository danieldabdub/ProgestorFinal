function viewEmployeeCountries() {
	var employeeId = document.getElementById("empId").value;
    var xhttp=new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            if (document.getElementById("button2").innerHTML == "View countries") {
                document.getElementById("employeeCountries").innerHTML = this.responseText;
                document.getElementById("button2").innerHTML = "Hide countries";           
            } else {
            document.getElementById("employeeCountries").innerHTML = " ";
            document.getElementById("button2").innerHTML = "View countries";    
            }
        }
    };
    xhttp.open("GET", "EmployeeCountries?employeeId="+employeeId+"", true);
    xhttp.send(); 
}