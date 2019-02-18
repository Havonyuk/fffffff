<%@ page contentType="text/html;charset=UTF-8" import="jewelry.web.FoodParse" %>
<html>
<head>
 <title>Welcome page</title>
 <style>
     h1{
         text-align: center;
         color: black;
     }
  body{
   width: 1200px;
   margin: 0 auto;
   background: #ffd1d8;
   text-align: left;
  }
 span{
   color: #5e514d;
  }
 </style>
</head>
<body>
<h1>Food List</h1>

<p>
    <ol>
<%
    FoodParse t = new FoodParse();
    String[] str = t.init();
    for(int i=0; i < str.length; i++) 
        {%>
           <li><%=str[i]%> </li> <br>
 <%} 
 %>
</ol>
 <span>Total food amount: </span><%=str.length%>
</p>


</body>
</html>
