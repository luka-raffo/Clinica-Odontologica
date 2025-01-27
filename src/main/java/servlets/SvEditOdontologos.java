/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Controladora;
import Logica.Odontologo;
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
@WebServlet(name = "SvEditOdontologos", urlPatterns = {"/SvEditOdontologos"})
public class SvEditOdontologos extends HttpServlet {
    
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
        response.sendRedirect("editarOdontologo.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String dni = request.getParameter("dniOdonto");
        String nombre = request.getParameter("nombreOdonto");
        String apellido = request.getParameter("apellidoOdonto");
        String telefono = request.getParameter("telefonoOdonto");
        String direccion = request.getParameter("direccionOdonto");
        
        ////////////////////////////////////////////////
        //Pasar la request (String) a fechaNac (Date)
        String fechaNacStr = request.getParameter("fecha_nacOdonto");
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNac = null;
        try {
        fechaNac = formato.parse(fechaNacStr);
        }   catch (java.text.ParseException ex) {
            Logger.getLogger(SvOdontologos.class.getName()).log(Level.SEVERE, null, ex);
        }
        ////////////////////////////////////////////////
        
        String especialidad = request.getParameter("especialidadOdonto");
        
        Odontologo odonto = (Odontologo)request.getSession().getAttribute("odontoEditar");
        
        odonto.setDni(dni);
        odonto.setNombre(nombre);
        odonto.setApellido(apellido);
        odonto.setTelefono(telefono);
        odonto.setDireccion(direccion);
        odonto.setFecha_nac(fechaNac);
        odonto.setEspecialidad(especialidad);
        
        control.editarOdontologo(odonto);
        response.sendRedirect("SvOdontologos");

    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
