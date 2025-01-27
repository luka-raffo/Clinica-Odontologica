<%-- 
    Document   : altaResponsables
    Created on : 30 dic 2024, 7:44:49?a.�m.
    Author     : luka
--%>

<%@page import="Logica.Paciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<%Paciente pacien = (Paciente)request.getSession().getAttribute("pacienEditar");%>

<h1>Añadir responsable</h1>


                            <form class="user" action="SvResponsables" method="POST">
                                <div class="form-group col">
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="dniResponsable" name="dniResponsable"
                                            placeholder="dni">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreResponsable" name="nombreResponsable"
                                            placeholder="Nombre">
                                    </div>

                                    <div class="col-sm-6 mb-3 ">
                                        <input type="text" class="form-control form-control-user"
                                            id="apellidoResponsable" name="apellidoResponsable" placeholder="Apellido">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="telefonoResponsable" name="telefonoResponsable" placeholder="Telefono">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="direccionResponsable" name="direccionResponsable" placeholder="Direccion">
                                    </div>
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="Date" class="form-control form-control-user"
                                            id="fecha_nacResponsable" name="fecha_nacResponsable" placeholder="fecha_nac">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="tipoResponsable" name="tipoResponsable" placeholder="Ingrese el tipo de responsable">
                                    </div>
                                     
                                </div>    
                                <button class="btn btn-primary btn-user btn-block" type="submit">
                                    Añadir responsable
                                </button> 
                                
                            </form>

<%@include file="components/bodyFinal.jsp" %>
