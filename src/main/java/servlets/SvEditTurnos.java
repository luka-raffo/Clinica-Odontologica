/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Controladora;
import Logica.Odontologo;
import Logica.Paciente;
import Logica.Turno;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "SvEditTurnos", urlPatterns = {"/SvEditTurnos"})
public class SvEditTurnos extends HttpServlet {
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        
        
        Turno turno = control.getTurno(id);
        
        HttpSession mysession = request.getSession();
        mysession.setAttribute("turnoEditar", turno);
        response.sendRedirect("editarTurno.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
        int idOdontologo = Integer.parseInt(request.getParameter("idOdontologo"));
        
        ////////////////////////////////////////////////
        //Pasar la request (String) a fechaNac (Date)
        String fechaNacStr = request.getParameter("fechaTurno");
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaTurno = null;
        try {
        fechaTurno = formato.parse(fechaNacStr);
        }   catch (java.text.ParseException ex) {
            Logger.getLogger(SvOdontologos.class.getName()).log(Level.SEVERE, null, ex);
        }
        ////////////////////////////////////////////////
        
        String horaTurno = request.getParameter("horaTurno");
        String afeccionTurno = request.getParameter("afeccionTurno");
        
        
        
        Turno turno = (Turno)request.getSession().getAttribute("turnoEditar");
        
        Paciente paciente = control.getPaciente(idPaciente);
        
        Odontologo odontologo = control.getOdontologo(idOdontologo);
        
        turno.setPacien(paciente);
        turno.setOdonto(odontologo);
        turno.setFecha_turno(fechaTurno);
        turno.setHora_turno(horaTurno);
        turno.setAfeccion(afeccionTurno);
        
        control.editarTurno(turno);
        
        response.sendRedirect("index.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
