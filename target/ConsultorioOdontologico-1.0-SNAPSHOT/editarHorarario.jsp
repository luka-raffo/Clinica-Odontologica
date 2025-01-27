<%-- 
    Document   : editarHorarario
    Created on : 13 ene 2025, 8:24:35 p. m.
    Author     : luka
--%>

<%@page import="Logica.Horario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<%Horario horario = (Horario)request.getSession().getAttribute("horarioEditar");%>

<h1>Editar Paciente</h1>


                            <form class="user" action="SvEditHorarios" method="POST">
                                <div class="form-group col">
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="HorarioInicio" name="HorarioInicio"
                                            placeholder="HorarioInicio" value="<%= horario.getHorario_inicio() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3 ">
                                        <input type="text" class="form-control form-control-user"
                                            id="HorarioFin" name="HorarioFin" placeholder="HorarioFin" value="<%= horario.getHorario_fin() %>">
                                    </div>
                                    
                                </div>    
                                <button class="btn btn-primary btn-user btn-block" type="submit">
                                    Guardar modificacion Horario
                                </button> 
                                
                            </form>

<%@include file="components/bodyFinal.jsp" %>
