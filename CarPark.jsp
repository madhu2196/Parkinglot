<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
   @ page import="src.Gate"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><input type="text" name  = "vehiclenumber" value = "Enter Vehicle Number" ></tr>
<tr><input type="text" name  = "ownername" value = "Enter name" ></tr>
<tr><input type="text" name  = "contactnumber" value = "Enter Contact Number" ></tr>
<tr><input type="Submit" name  = "submitdetails" value = "Submit" ></tr>
</table>
<%
	String vno = request.getParameter("vehiclenumber");
    String uname = request.getParameter("ownername");
    String cnum = request.getParameter("contactnumber");
    
    if(vno!= null && uname != null && cnum != null && vno.length()!= 0 && uname.length()!=0 && cnum.length()!=0)
    {
    long id = Gate.CheckIn(uname, vno, cnum);
    }
    else
    {%>
    Entered Details cannot be empty
    <%}
    
    
    
%>
</body>
</html>