<%-- 
    Document   : editarsecretario
    Created on : 2 ene 2025, 7:17:34 a. m.
    Author     : luka
--%>

<%@page import="Logica.Secretario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<%Secretario secretario = (Secretario)request.getSession().getAttribute("secretarioEditar");%>

<h1>Editar Secretario</h1>


                            <form class="user" action="SvEditSecretarios" method="POST">
                                <div class="form-group col">
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="dniSecretario" name="dniSecretario"
                                            placeholder="Dni" value="<%= secretario.getDni() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3 ">
                                        <input type="text" class="form-control form-control-user"
                                            id="nombreSecretario" name="nombreSecretario" placeholder="Nombre" value="<%= secretario.getNombre()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="apellidoSecretario" name="apellidoSecretario" placeholder="Apellido" value="<%= secretario.getApellido() %>">
                                     </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                               id="telefonoSecretario" name="telefonoSecretario" placeholder="Telefono" value="<%= secretario.getTelefono() %>">
                                     </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="direccionSecretario" name="direccionSecretario" placeholder="Direccion" value="<%= secretario.getDireccion() %>">
                                     </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="Date" class="form-control form-control-user"
                                            id="fecha_nacSecretario" name="fecha_nacSecretario" placeholder="fecha nacimiento Secretario" value="<%= secretario.getFecha_nac() %>">
                                     </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                               id="sectorSecretario" name="sectorSecretario" placeholder="Sector" value="<%= secretario.getSector() %>">
                                     </div>
                                     
                                </div>    
                                <button class="btn btn-primary btn-user btn-block" type="submit">
                                    Guardar modificacion usuario
                                </button> 
                                
                            </form>

<%@include file="components/bodyFinal.jsp" %>
