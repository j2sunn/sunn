<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Hello World</title>
</head>
<body>
   <%! String str = "HelloWorld"; %>
   <%! String getString(String str){
         return str;
	   }
   %>
   
   <%
      out.println(getString(str));
   %>

</body>
</html>