<%-- 
    Document   : editarPacientes
    Created on : 27 dic 2024, 2:05:18 p. m.
    Author     : luka
--%>

<%@page import="Logica.Paciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<%Paciente pacien = (Paciente)request.getSession().getAttribute("pacienEditar");%>

<h1>Editar Paciente</h1>


                            <form class="user" action="SvEditPacientes" method="POST">
                                <div class="form-group col">
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="dniPacien" name="dniPacien"
                                            placeholder="Dni" value="<%= pacien.getDni() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3 ">
                                        <input type="text" class="form-control form-control-user"
                                            id="nombrePacien" name="nombrePacien" placeholder="Nombre" value="<%= pacien.getNombre()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="apellidoPacien" name="apellidoPacien" placeholder="Apellido" value="<%= pacien.getApellido() %>">
                                     </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                               id="telefonoPacien" name="telefonoPacien" placeholder="Telefono" value="<%= pacien.getTelefono() %>">
                                     </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="direccionPacien" name="direccionPacien" placeholder="Direccion" value="<%= pacien.getDireccion() %>">
                                     </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="Date" class="form-control form-control-user"
                                            id="fecha_nacPacien" name="fecha_nacPacien" placeholder="fecha nacimiento Paciente" value="<%= pacien.getFecha_nac() %>">
                                     </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                               id="tieneOS_Pacien" name="tieneOS_Pacien" placeholder="Especialidad" value="<%= pacien.isTiene_OS() %>">
                                     </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="tipoSangrePacien" name="tipoSangrePacien" placeholder="Tipo de sangre" value="<%= pacien.getTipoSangre() %>">
                                     </div>
                                </div>    
                                <button class="btn btn-primary btn-user btn-block" type="submit">
                                    Guardar modificacion usuario
                                </button> 
                                
                            </form>

<%@include file="components/bodyFinal.jsp" %>
