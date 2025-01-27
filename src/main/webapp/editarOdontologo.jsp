<%-- 
    Document   : editarOdontologo
    Created on : 25 dic 2024, 1:48:02 p. m.
    Author     : luka
--%>

<%@page import="Logica.Odontologo"%>
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<%Odontologo odonto = (Odontologo)request.getSession().getAttribute("odontoEditar");%>

<h1>Editar Usuarios</h1>


                            <form class="user" action="SvEditOdontologos" method="POST">
                                <div class="form-group col">
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="dniOdonto" name="dniOdonto"
                                            placeholder="Dni" value="<%= odonto.getDni() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3 ">
                                        <input type="text" class="form-control form-control-user"
                                            id="nombreOdonto" name="nombreOdonto" placeholder="Nombre" value="<%= odonto.getNombre()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="apellidoOdonto" name="apellidoOdonto" placeholder="Apellido" value="<%= odonto.getApellido() %>">
                                     </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                               id="telefonoOdonto" name="telefonoOdonto" placeholder="Telefono" value="<%= odonto.getTelefono() %>">
                                     </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="direccionOdonto" name="direccionOdonto" placeholder="Direccion" value="<%= odonto.getDireccion() %>">
                                     </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="Date" class="form-control form-control-user"
                                            id="fecha_nacOdonto" name="fecha_nacOdonto" placeholder="fecha nacimiento odontologo" value="<%= odonto.getFecha_nac() %>">
                                     </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="especialidadOdonto" name="especialidadOdonto" placeholder="Especialidad" value="<%= odonto.getEspecialidad() %>">
                                     </div>
                                </div>    
                                <button class="btn btn-primary btn-user btn-block" type="submit">
                                    Guardar modificacion odontologo
                                </button> 
                                
                            </form>

<%@include file="components/bodyFinal.jsp" %>
