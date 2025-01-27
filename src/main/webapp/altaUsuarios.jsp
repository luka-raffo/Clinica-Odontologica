<%-- 
    Document   : altaUsuarios
    Created on : 20 dic 2024, 9:39:44 a. m.
    Author     : luka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<h1>Alta Usuarios</h1>


                            <form class="user" action="SvUsuarios" method="POST">
                                <%@include file="components/columnasAltaUsuario.jsp" %>
  
                                <button class="btn btn-primary btn-user btn-block" type="submit">
                                    Crear Usuario
                                </button> 
                                
                            </form>

<%@include file="components/bodyFinal.jsp" %>
