/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Book;
import entity.History;
import entity.Reader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.BookFacade;
import session.HistoryFacade;
import session.ReaderFacade;

/**
 *
 * @author pupil
 */
@WebServlet(name = "WebControllerHistory", urlPatterns = {
    "/addHistory",
    "/addHistoryAction",
    "/returnBook",
    "/returnHistoryAction",
    "/listHistory",

})
public class WebControllerHistory extends HttpServlet {
@EJB BookFacade bookFacade;
@EJB ReaderFacade readerFacade;
@EJB HistoryFacade historyFacade;
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
        response.setCharacterEncoding("UTF-8");
        String path = request.getServletPath();
        switch(path){
            case "/addHistory":
                List<Book> b = bookFacade.findAll();
                List<Reader> r = readerFacade.findAll();
                request.setAttribute("listBook", b);
                request.setAttribute("listReader", r);
                request.getRequestDispatcher("/addHistory.jsp").forward(request, response);
                break;
            case "/addHistoryAction":
                String bookId = request.getParameter("bookId");
                String readerId = request.getParameter("readerId");
                Book b2 = bookFacade.find(Long.parseLong(bookId));
                Reader r2 = readerFacade.find(Long.parseLong(readerId));
                History h = new History(new Date(),null,b2,r2);
                historyFacade.create(h);
                request.setAttribute("info", "History: " + h.toString() + " was created");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                break;
            case "/returnBook":
                List<History> listHistory = historyFacade.findAll();
                ArrayList<History> listHistory2 = new ArrayList<History>();
                for (History history : listHistory) {
                    if(history.getReturnOfDate() == null){
                        listHistory2.add(history);
                    }
                }
                request.setAttribute("listHistory", listHistory2);
                request.getRequestDispatcher("/returnHistory.jsp").forward(request, response);
                break;
            case "/returnHistoryAction":
                String historyId = request.getParameter("historyId");
                History h2 = historyFacade.find(Long.parseLong(historyId));
                h2.setReturnOfDate(new Date());
                historyFacade.edit(h2);
                request.setAttribute("info", "History was edited");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                break;
            case "/listHistory":
                List<History> listHistory3 = historyFacade.findAll();
                request.setAttribute("listHistory", listHistory3);
                request.getRequestDispatcher("/listHistory.jsp").forward(request, response);
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
