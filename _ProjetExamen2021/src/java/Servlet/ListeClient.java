/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import clientdao.ClientDao;
import clientdao.DAOException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeles.Client;

/**
 *
 * @author ADMIN
 */
public class ListeClient extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListeClient</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListeClient at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
      response.setContentType("text/html");
    PrintWriter out=response.getWriter();
  
   ClientDao dao = new ClientDao();
    List<Client> list = null;
      
          try {
              list = dao.list();
          } catch (DAOException ex) {
              Logger.getLogger(ViewClient.class.getName()).log(Level.SEVERE, null, ex);
          }
        
    out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\r\n"
        + ""
        + "<style type=\"text/css\">\r\n"
        + "body{\r\n"
        + "    background: url(micah-williams-lmFJOx7hPc4-unsplash.jpg);\r\n"
        + "    \r\n"
        + " \r\n"
        + "    opacity: 0.8;\r\n"
        + "}"
        
        + "h1{\r\n"
        + "    text-align: center;\r\n"
        + "    background-color: brown;\r\n"
        + "    color: white;\r\n"
        + "    margin-top: 0px;\r\n"
        + "    border-top-left-radius: 20px 20px;\r\n"
        + "    border-top-right-radius: 20px 20px;\r\n"
        + "    padding: 15px;\r\n"
        + "}\r\n"
        + "table{\r\n"
        + "    background-color: transparent;\r\n"
        + ""
        
        + "}"
        
        + "\r\n"
        + "</style>"
        + "<table class=\"table table-danger table-hover\">"
            + "<h1>Products List</h1>");
    out.print("<tr>"
        + "<th>IdClient</th>"
        + "<th>NomClient</th>"
        + "<th>TypeClient</th>"
        + "<th>AdresseClient</th>"
        + "<th>SpecialiteClient</th>"
        + "<th>Login</th>"
        + "<th>Password</th>"
        + "<th>Profil</th>"
        + "<th>Delete</th>"    
        + "</tr>");
        for(Client e :list){
        out.print("<tr><td>"+e.getIdClient()+"</td><td>"+e.getNomClient()+"</td><td>"+e.getTypeClient()+"</td><td>"+e.getAdresseClient()+"</td><td>"+e.getSpecialiteClient()+"</td><td>"+e.getLogin()+"</td><td>"+e.getPassword()+"</td><td>"+e.getProfil()+"</td>"
          
                + "<td><a class=\"btn btn-danger mt-3\" href='DeleteClient?id="+e.getIdClient()+"'>delete</a></td>"
                    + "</tr>");
        }
        out.print("</table>");
        out.println("<a class=\"btn btn-success mt-3\"  href='Admin/form.jsp'>Add New Client</a>");
        out.close();
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
