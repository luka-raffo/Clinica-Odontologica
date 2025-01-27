<%-- 
    Document   : altaUsuarios
    Created on : 20 dic 2024, 9:39:44 a. m.
    Author     : luka
--%>

<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<%Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar");%>

<h1>Editar Usuarios</h1>


                            <form class="user" action="SvEditUsuarios" method="POST">
                                <div class="form-group col">
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreUsu" name="nombreUsu"
                                            placeholder="" value="<%= usu.getNombre() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3 ">
                                        <input type="password" class="form-control form-control-user"
                                            id="contraseniaUsu" name="contraseniaUsu" placeholder="Contraseña" value="<%= usu.getContrasenia() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="rolUsu" name="rolUsu" placeholder="Rol" value="<%= usu.getRol() %>">
                                     </div>
                                </div>    
                                <button class="btn btn-primary btn-user btn-block" type="submit">
                                    Guardar modificacion usuario
                                </button> 
                                
                            </form>

<%@include file="components/bodyFinal.jsp" %>
