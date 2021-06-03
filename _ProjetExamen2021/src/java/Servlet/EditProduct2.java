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
public class EditProduct2 extends HttpServlet {

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
            out.println("<title>Servlet EditProduct2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditProduct2 at " + request.getContextPath() + "</h1>");
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
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String sid=request.getParameter("id");
             int id=Integer.parseInt(sid); 
            String name=request.getParameter("nom");
            String categorie=request.getParameter("categorie"); 
            int quantite=(Integer.parseInt(request.getParameter("qte")));
            int prix=(Integer.parseInt(request.getParameter("prix")));
            String dateFab=request.getParameter("datefab");
            String dateExp=request.getParameter("datexp");
            
            Produit p = new Produit();
            p.setCodeProd(id);
            p.setNomProd(name);
            p.setCategorieProd(categorie); 
            p.setQteProd(quantite); 
            p.setPrixUnitaire(prix);
            p.setDateFab(dateFab);
            p.setDateExp(dateExp);
            
            int status = ProduitDao.update(p);
            if(status > 0){
                out.println("<script type=\"text/javascript\">");
                                 out.println("alert('Votre produit a bien été modifié');");
                                 out.println("location='Viewproduct';");
                                 out.println("</script>");
            }else {
                out.println("Sorry! unable to save record");
            }  
        } catch (DAOException ex) {
            Logger.getLogger(EditProduct2.class.getName()).log(Level.SEVERE, null, ex);
        }
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
