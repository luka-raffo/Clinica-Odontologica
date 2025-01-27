/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Controladora;
import Logica.Horario;
import Logica.Odontologo;
import Logica.Turno;
import Logica.Usuario;
import com.google.protobuf.TextFormat.ParseException;
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
@WebServlet(name = "SvOdontologos", urlPatterns = {"/SvOdontologos"})
public class SvOdontologos extends HttpServlet {
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        control.getOdontologos();
        List<Odontologo> listaOdontologos = new ArrayList<Odontologo>();
        
        listaOdontologos = control.getOdontologos();
        
        HttpSession miSession = request.getSession();
        miSession.setAttribute("listaOdontologos", listaOdontologos);
        
        response.sendRedirect("verOdontologos.jsp");
        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String dni = request.getParameter("dniOdonto");
        String nombre = request.getParameter("nombreOdonto");
        String apellido = request.getParameter("apellidoOdonto");
        String telefono = request.getParameter("telefonoOdonto");
        String direccion = request.getParameter("direccionOdonto");
        //Pasar la request (String) a fechaNac (Date)
        String fechaNacStr = request.getParameter("fecha_nacOdonto");
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNac = null;
        try {
        fechaNac = formato.parse(fechaNacStr);
        }   catch (java.text.ParseException ex) {
            Logger.getLogger(SvOdontologos.class.getName()).log(Level.SEVERE, null, ex);
        }
        ////////////
        String especialidad = request.getParameter("especialidadOdonto");
        
        
        String nombreUsuario = request.getParameter("nombreUsu");
        String contrasenia = request.getParameter("contraseniaUsu");
        String rol = request.getParameter("rolUsu");
        Usuario usu = new Usuario();
        
        control.crearUsuario(usu, nombreUsuario, contrasenia, rol);
        
        
        control.crearOdontologo(dni,nombre,apellido,telefono,direccion,fechaNac,especialidad,usu);
        
        response.sendRedirect("SvOdontologos");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
