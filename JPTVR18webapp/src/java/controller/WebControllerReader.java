/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Book;
import entity.Reader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.ReaderFacade;

/**
 *
 * @author pupil
 */
@WebServlet(name = "WebControllerReader", urlPatterns = {"/addReader","/addReaderAction","/listReader","/deleteReader", "/deleteReaderAction"})
public class WebControllerReader extends HttpServlet {
@EJB ReaderFacade readerFacade;
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
        request.setCharacterEncoding("UTF-8");
        String path = request.getServletPath();
        switch(path){
            case ("/addReader"):
                request.getRequestDispatcher("/addReader.jsp").forward(request, response);
                break;
            case ("/addReaderAction"):
                String Fname = request.getParameter("Fname");
                String Lname = request.getParameter("Lname");
                String day = request.getParameter("day");
                String mounth = request.getParameter("mounth");
                String year = request.getParameter("year");
                String number = request.getParameter("number");
                Reader r = new Reader(Fname, Lname,day,mounth,year,number,"none");
                readerFacade.create(r);
                request.setAttribute("info", "Reader : " + r.toString() + " was added");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                break;
            case ("/listReader"):
                List<Reader> listReader = readerFacade.findAll();
                request.setAttribute("listReaders", listReader);
                request.getRequestDispatcher("/listReader.jsp").forward(request, response);
                break;
            case ("/deleteReader"):
                List<Reader> readerList = readerFacade.findAll();
                request.setAttribute("listReader", readerList);
                request.getRequestDispatcher("/deleteReader.jsp").forward(request, response);
                break;
            case ("/deleteReaderAction"):
                String id = request.getParameter("readerId");
                Reader r2 = readerFacade.find(Long.parseLong(id));
                readerFacade.remove(r2);
                request.setAttribute("info", "Reader: " + r2.toString() + " was deleted");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                break;
                
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
