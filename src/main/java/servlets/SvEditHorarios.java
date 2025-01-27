/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Controladora;
import Logica.Horario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author luka
 */
@WebServlet(name = "SvEditHorarios", urlPatterns = {"/SvEditHorarios"})
public class SvEditHorarios extends HttpServlet {
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        
        Horario horario = control.getHorario(id);
        
        HttpSession mysession = request.getSession();
        mysession.setAttribute("horarioEditar", horario);
        response.sendRedirect("editarHorarario.jsp");
    
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String horarioInicio = request.getParameter("HorarioInicio");
        String horarioFin = request.getParameter("HorarioFin"); 
        
        Horario horario = (Horario)request.getSession().getAttribute("horarioEditar");
        
        horario.setHorario_inicio(horarioInicio);
        horario.setHorario_fin(horarioFin);
        
        control.editarHorario(horario);
        
        response.sendRedirect("SvVerHorarios");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
