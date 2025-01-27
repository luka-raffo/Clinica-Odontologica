/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Controladora;
import Logica.Paciente;
import java.io.IOException;
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
@WebServlet(name = "SvPacientes", urlPatterns = {"/SvPacientes"})
public class SvPacientes extends HttpServlet {
    
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        control.getPacientes();
        List<Paciente> listaPacientes = new ArrayList<Paciente>();
        
        listaPacientes=control.getPacientes();
        
        HttpSession miSession = request.getSession();
        miSession.setAttribute("listaPacientes", listaPacientes);
        
        response.sendRedirect("verPacientes.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dni = request.getParameter("dniPaciente");
        String nombre = request.getParameter("nombrePaciente");
        String apellido = request.getParameter("apellidoPaciente");
        String telefono = request.getParameter("telefonoPaciente");
        String direccion = request.getParameter("direccionPaciente");
        //Pasar la request (String) a fechaNac (Date)
        String fechaNacStr = request.getParameter("fecha_nacPaciente");
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNac = null;
        try {
        fechaNac = formato.parse(fechaNacStr);
        }   catch (java.text.ParseException ex) {
            Logger.getLogger(SvOdontologos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean tieneOS  = Boolean.parseBoolean(request.getParameter("OS_paciente"));
         
               //Boolean.parseBoolean(osPacienteStr);        
        String tipoSangre = request.getParameter("tipo_sangrePaciente");
        
        
        
        control.crearPaciente(dni,nombre,apellido,telefono,direccion,fechaNac,tieneOS,tipoSangre);

        response.sendRedirect("SvPacientes");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
