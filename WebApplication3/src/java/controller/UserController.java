/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import services.UserService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.simple.JSONObject;

/**
 *
 * @author bksof
 */
public class UserController extends HttpServlet {

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
        HttpSession session = request.getSession(false);
        String userPath = request.getServletPath();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin", "*");

        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        int id = -1;
        int status = -1;
        String mes = "Co loi trong qua trinh xu ly. Vui long thuc hien lai!";

        if (email != null && pass != null) {
            switch (userPath) {
                case "/api/user/signup": {
                    // dang ky
                    Integer kq = -1;
                    try {
                        kq = signup(email, pass);
                    } catch (Exception ex) {
                        mes = ex.getMessage();
                    }
                    if (kq > 0) {
                        // dang ky thanh cong
                        id = kq;
                        status = 1;
                        mes = "Dang ky thanh cong!";
                    } else {
                        status = -2;
                    }
                }
                case "/api/user/signin": {
                    //da nhap
                }
            }
        }

        JSONObject rs = new JSONObject();
        rs.put("path", userPath);
        response.getWriter().write(rs.toString());
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

    private Integer signup(String email, String pass) throws Exception {
        Integer rs = -1;
        try {
            rs = new UserService().signup(email, pass);
        } catch (Exception e) {
            new Throwable(e.getMessage());
            rs = -1;
        }
        return rs;
    }

}
