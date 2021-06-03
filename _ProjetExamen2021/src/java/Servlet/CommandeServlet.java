/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeles.Produit;
import produitdao.DAOException;
import produitdao.ProduitDao;

/**
 *
 * @author ADMIN
 */
public class CommandeServlet extends HttpServlet {

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
            out.println("<title>Servlet CommandeServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CommandeServlet at " + request.getContextPath() + "</h1>");
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
    
    String sid=request.getParameter("id");
    int id=Integer.parseInt(sid);
    Produit e = null;
        try {
            e = ProduitDao.read(id);
        } catch (DAOException ex) {
            Logger.getLogger(EditProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\r\n"
        + "<style type=\"text/css\">\r\n"
        
        + "@charset \"ISO-8859-1\";\r\n"
        
        + ".bg{\r\n"
        + "   \r\n"
        + " background: url(janko-ferlic-sfL_QOnmy00-unsplash.jpg)no-repeat;"
        + "    width: 100%;\r\n"
        + "    height: 100%;\r\n"
        + " \r\n"
        + "}\r\n"
        + "\r\n"
        + ".form-container{\r\n"
        + "  \r\n"
        + "    top: 55%;\r\n"
        + "    background: #eee;\r\n"
        + "    padding: 30px;\r\n"
        + "    border-radius: 30px;\r\n"
        + "    box-shadow: 0px 0px 10px 0px #000;\r\n"
        + "}\r\n"
        + "h1{\r\n"
        + "    text-align: center;\r\n"
        + "    background-color: brown;\r\n"
        + "    color: white;\r\n"
        + "    margin-top: 5px;\r\n"
        + "    border-top-left-radius: 20px 20px;\r\n"
        + "    border-top-right-radius: 20px 20px;\r\n"
        + "    padding: 15px;\r\n"
        + "}\r\n"
        + "\r\n"
        + "</style>"
        + "<section class=\"container-fluid bg\">\r\n"
        + "  <section class=\"row justify-content-center\">\r\n"
        + "    <section class=\"col-12 col-sm-6 col-md-6\">"
        + "<form action='AjoutPanier' method='post' class=\"form-container\" >");
    out.print("<table>"
            + "<h1>Update Product</h1>");
    out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getCodeProd()+"'/></td></tr>");
    out.print("<div class=\"form-group\">"
        + "<label for=\"\">Nom du produit :</label> <input class=\"form-control\" type='text' name='nom' value='"+e.getNomProd()+"'/>"
            + "</div>");
    out.print("<div class=\\\"form-group\\\">"
        + "<label for=\"\">Categorie du produit:</label><input  class=\"form-control\" type='text' name='categorie' value='"+e.getCategorieProd()+"'>"
            + "</div>");
    out.print("<div class=\\\"form-group\\\">"
        + "<label for=\"\">Quantite du produit:</label><input  class=\"form-control\" type='number' name='qte' required>"
            + "</div>");
     out.print("<div class=\\\"form-group\\\">"
        + "<label for=\"\">Prix Unitaire:</label><input  class=\"form-control\" type='number' name='prix' value='"+e.getPrixUnitaire()+"'>"
            + "</div>");
    out.print("<div class=\\\"form-group\\\">"
        + "<label for=\"\">Date de fabrication:</label><input  class=\"form-control\" type='date' name='datefab' value='"+e.getDateFab()+"'>"
            + "</div>");
    out.print("<div class=\\\"form-group\\\">"
        + "<label for=\"\">Date d'expiration:</label><input  class=\"form-control\" type='date' name='datexp' value='"+e.getDateExp()+"'>"
            + "</div>");
    out.print("<tr><td colspan='2'><input class=\"btn btn-success mt-3\" type='submit' value='Commander '/></td></tr>");
    out.print("</table>");
    out.print(" </section>\r\n"
        + "  </section>\r\n"
        + "</section>"
        + "</form>");
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
