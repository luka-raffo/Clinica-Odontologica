/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Controladora;
import Logica.Secretario;
import Logica.Usuario;
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


@WebServlet(name = "SvSecretarios", urlPatterns = {"/SvSecretarios"})
public class SvSecretarios extends HttpServlet {
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        control.getSecretarios();
        
        List<Secretario>listaSecretarios = new ArrayList<Secretario>();
        
        listaSecretarios = control.getSecretarios();
        
        HttpSession miSession = request.getSession();
        miSession.setAttribute("listaSecretarios", listaSecretarios);
        
        response.sendRedirect("verSecretarios.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dni = request.getParameter("dniSecretario");
        String nombre = request.getParameter("nombreSecretario");
        String apellido = request.getParameter("apellidoSecretario");
        String telefono = request.getParameter("telefonoSecretario");
        String direccion = request.getParameter("direccionSecretario");
        
        ////////////////////////////////////////////////
        //Pasar la request (String) a fechaNac (Date)
        String fechaNacStr = request.getParameter("fecha_nacSecretario");
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNac = null;
        try {
        fechaNac = formato.parse(fechaNacStr);
        }   catch (java.text.ParseException ex) {
            Logger.getLogger(SvOdontologos.class.getName()).log(Level.SEVERE, null, ex);
        }
        ////////////////////////////////////////////////
        
        String sector = request.getParameter("sectorSecretario");
        
        String nombreUsuario = request.getParameter("nombreUsu");
        String contrasenia = request.getParameter("contraseniaUsu");
        String rol = request.getParameter("rolUsu");
        Usuario usu = new Usuario();
        
        control.crearUsuario(usu, nombreUsuario, contrasenia, rol);
        
        control.crearSecretario(dni,nombre,apellido,telefono,direccion,fechaNac,sector,usu);
        response.sendRedirect("SvSecretarios");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
