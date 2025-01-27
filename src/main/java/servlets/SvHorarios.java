/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Controladora;
import Logica.Horario;
import Logica.Odontologo;
import Logica.Turno;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvHorarios", urlPatterns = {"/SvHorarios"})
public class SvHorarios extends HttpServlet {
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         
        int id = Integer.parseInt(request.getParameter("id"));
        
        
        Odontologo odonto = control.getOdontologo(id);
        HttpSession mysession = request.getSession();
        mysession.setAttribute("odontoEditar", odonto);
        
        response.sendRedirect("altaHorarios.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
         
        int id = Integer.parseInt(request.getParameter("id"));
        
        
        Odontologo odonto = control.getOdontologo(id);
        
        
        
                   
        
        
        String horarioInicio = request.getParameter("HorarioInicio");
        String horarioFin = request.getParameter("HorarioFin"); 
        
        Horario horario = new Horario();
        
        
        control.crearHorario(horarioInicio,horarioFin,horario);
        
        int idExHorario;
        
        if(odonto.getHorario()!=null){
        idExHorario = odonto.getHorario().getId_horario();
        odonto.setHorario(horario);
        control.editarOdontologo(odonto);
        control.borrarHorario(idExHorario);
        }
        else{
            odonto.setHorario(horario);
            control.editarOdontologo(odonto);
        }
        
        
        
        
        
        
        
        
        response.sendRedirect("SvVerHorarios");
        
        
    
    
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
