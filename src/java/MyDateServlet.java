

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author michael
 */
public class MyDateServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8"); // specifies the output type of the servlet

        // printwriter is used to write text to the response object
        PrintWriter out = response.getWriter();


        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Date</title>");
            out.println("<style>");

            out.println("body {");
            out.println("background-image: url(https://images2.alphacoders.com/960/thumb-1920-960506.png);\n" +
"           background-repeat: no-repeat;\n" +
"           background-size: cover;");
            out.println("margin: 0 auto;");
            out.println("}");

            out.println("div {");
            out.println("display: inline-block;");
            out.println("width: 47%;");
            out.println("font-family: Tahoma;");
            out.println("}");

            out.println("</style>");

            out.println("</head>");
            out.println("<body>");
            out.println("<div align=\"center\" style=\"position:absolute; top:220px\">");
            out.println("<h1>(Servlet Implementation)</h1>");
            out.println("<h2>Current date: </h2>");
            out.println("<strong>");
            out.println(new java.util.Date());
            out.println("</strong>");
            out.println("<strong><p>My Birthday is on: November 23, 2001</p></strong>");
            LocalDate Birthday;
            Birthday = LocalDate.of(2001, Month.NOVEMBER, 23);
            LocalDate Today = LocalDate.now();
            Period p = Period.between(Birthday, Today);

            out.println("<strong><p>");
            out.print("Days: " + p.getDays());
            out.println("</p></strong>");
            out.println("<strong><p>");
            out.print("Months: " + p.getMonths());
            out.println("</p></strong>");
            out.println("<strong><p>");
            out.print("Years: " + p.getYears());
            out.println("</p></strong>");
            out.println("</body>");
            out.println("</html>");
            out.println("<a href=\"http://localhost:8080/MyFirstWebApplication\">Click here to proceed to JSP Implementation!</a>");
            out.println("</div>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
