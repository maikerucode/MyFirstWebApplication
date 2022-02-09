<%--
    Document   : index
    Created on : Feb 7, 2022, 8:31:49 PM
    Author     : michael
--%>

<%@page import="java.time.Period"%>
<%@page import="java.time.Month"%>
<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Date</title>
        <style media="screen">
      .home {
        margin: 0 auto;
        background-image: url(https://images2.alphacoders.com/960/thumb-1920-960506.png);
        background-repeat: no-repeat;
        background-size: cover;
      }

      .divider {
        display: inline-block;
        width: 47%;
        font-family: Tahoma;
      }

    </style>
    </head>
    <body class="home">
        <div class="divider" align="center" style="position:absolute; top:220px">
        <h1>(JSP Implementation)</h1>
        <h2>Date Today: </h2>
        <strong>
            <%=
                //Java Codes Output to html
                new java.util.Date()
            %>
        </strong>
        <strong><p>My Birthday is on: November 23, 2001</p></strong>
        <%
          //Java Codes
          LocalDate Birthday = LocalDate.of(2001, Month.NOVEMBER, 23);
          LocalDate Today = LocalDate.now();

          Period p = Period.between(Birthday, Today);
        %>

        <strong><p>Days: <%= p.getDays() %></p></strong>
        <strong><p>Months: <%= p.getMonths() %></p></strong>
        <strong><p>Years: <%= p.getYears() %></p></strong>
        <a href="http://localhost:8080/MyFirstWebApplication/MyDateServlet">Click here to proceed to Servlet Implementation!</a>
        </div>
    </body>
</html>
