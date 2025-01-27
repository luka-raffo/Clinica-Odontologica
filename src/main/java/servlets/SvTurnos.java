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
@WebServlet(name = "SvTurnos", urlPatterns = {"/SvTurnos"})
public class SvTurnos extends HttpServlet {
    
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        control.getTurnos();
        
        List<Turno>listaTurnos = new ArrayList<Turno>();
        listaTurnos = control.getTurnos();
        
        HttpSession mySession = request.getSession();
        
        mySession.setAttribute("listaTurnos", listaTurnos);
        response.sendRedirect("verTurnos.jsp");
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
        
        
        
        List<Turno>listaTurnos = new ArrayList<Turno>();
        
        Paciente paciente = control.getPaciente(idPaciente);
        
        Odontologo odontologo = control.getOdontologo(idOdontologo);
        
        
        
        Turno turno = new Turno();
        
        control.crearTurno(turno,fechaTurno, horaTurno, afeccionTurno,paciente ,odontologo);
        
        
        listaTurnos=control.getTurnos();
        
        paciente.setListaTurnos(listaTurnos);
        control.editarPaciente(paciente);
        
        odontologo.setListaTurnos(listaTurnos);
        control.editarOdontologo(odontologo);
        
        
        response.sendRedirect("SvTurnos");
        
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
