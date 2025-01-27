/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Controladora;
import Logica.Paciente;
import Logica.Responsable;
import java.io.IOException;
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
@WebServlet(name = "SvResponsables", urlPatterns = {"/SvResponsables"})
public class SvResponsables extends HttpServlet {
    
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
        response.sendRedirect("altaResponsables.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dni = request.getParameter("dniResponsable");
        String nombre = request.getParameter("nombreResponsable");
        String apellido = request.getParameter("apellidoResponsable");
        String telefono = request.getParameter("telefonoResponsable");
        String direccion = request.getParameter("direccionResponsable");
        
        ////////////////////////////////////////////////
        //Pasar la request (String) a fechaNac (Date)
        String fechaNacStr = request.getParameter("fecha_nacResponsable");
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNac = null;
        try {
        fechaNac = formato.parse(fechaNacStr);
        }   catch (java.text.ParseException ex) {
            Logger.getLogger(SvOdontologos.class.getName()).log(Level.SEVERE, null, ex);
        }
        ////////////////////////////////////////////////
        String tipoResponsable  = request.getParameter("tipoResponsable");
        
        Responsable responsable = new Responsable();
        responsable.setDni(dni);
        responsable.setNombre(nombre);
        responsable.setApellido(apellido);
        responsable.setTelefono(telefono);
        responsable.setDireccion(direccion);
        responsable.setFecha_nac(fechaNac);
        responsable.setTipo_resp(tipoResponsable);
        
        Paciente pacien = (Paciente)request.getSession().getAttribute("pacienEditar");
        
        int idResponsable = -1;
        
        if(pacien.getUn_Responsable()!=null){
        idResponsable = pacien.getUn_Responsable().getId();
        }
        
        pacien.setUn_Responsable(responsable);
        
        
        
        control.editarPaciente(pacien);
        
        
        if(idResponsable != pacien.getUn_Responsable().getId()){
        
        control.borrarResponsable(idResponsable);
        
              
        } 
        

        
        
        
        
        response.sendRedirect("SvPacientes");
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
