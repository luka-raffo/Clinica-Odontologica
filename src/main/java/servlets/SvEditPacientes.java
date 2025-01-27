/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Controladora;
import Logica.Paciente;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "SvEditPacientes", urlPatterns = {"/SvEditPacientes"})
public class SvEditPacientes extends HttpServlet {

    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        
        Paciente pacien = control.getPaciente(id);
        
        HttpSession mysession = request.getSession();
        mysession.setAttribute("pacienEditar", pacien);
        response.sendRedirect("editarPaciente.jsp");

        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dni = request.getParameter("dniPacien");
        String nombre = request.getParameter("nombrePacien");
        String apellido = request.getParameter("apellidoPacien");
        String telefono = request.getParameter("telefonoPacien");
        String direccion = request.getParameter("direccionPacien");
        
        ////////////////////////////////////////////////
        //Pasar la request (String) a fechaNac (Date)
        String fechaNacStr = request.getParameter("fecha_nacPacien");
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNac = null;
        try {
        fechaNac = formato.parse(fechaNacStr);
        }   catch (java.text.ParseException ex) {
            Logger.getLogger(SvOdontologos.class.getName()).log(Level.SEVERE, null, ex);
        }
        ////////////////////////////////////////////////
        boolean tieneOS  = Boolean.parseBoolean(request.getParameter("tieneOS_Pacien"));
        String tipoSangre = request.getParameter("tipoSangrePacien");
        
        Paciente pacien = (Paciente)request.getSession().getAttribute("pacienEditar");
        
        pacien.setDni(dni);
        pacien.setNombre(nombre);
        pacien.setApellido(apellido);
        pacien.setTelefono(telefono);
        pacien.setDireccion(direccion);
        pacien.setFecha_nac(fechaNac);
        pacien.setTiene_OS(tieneOS);
        pacien.setTipoSangre(tipoSangre);
        
        
        
        control.editarPaciente(pacien);
        
        response.sendRedirect("SvPacientes");
    
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
