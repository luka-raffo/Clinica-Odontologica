/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Controladora;
import Logica.Horario;
import Logica.Odontologo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luka
 */
@WebServlet(name = "SvElimOdontologos", urlPatterns = {"/SvElimOdontologos"})
public class SvElimOdontologos extends HttpServlet {
    Controladora control = new Controladora();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        
        Odontologo odonto = control.getOdontologo(id);
        
        
        
        int idUsuario = odonto.getUnUsuario().getId_usuario();
        int idHorario= odonto.getHorario().getId_horario();
        
        control.borrarOdontologo(id);
        control.borrarHorario(idHorario);
        control.borrarUsuario(idUsuario);
        
        response.sendRedirect("SvOdontologos");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
