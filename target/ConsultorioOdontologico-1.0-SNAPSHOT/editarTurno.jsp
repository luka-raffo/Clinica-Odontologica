<%-- 
    Document   : editarturno
    Created on : 2 ene 2025, 1:21:11 p. m.
    Author     : luka
--%>


<%@page import="Logica.Turno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<%Turno turno = (Turno)request.getSession().getAttribute("turnoEditar");%>


<h1>Alta Turnos</h1>

<form class="odonto" action="SvEditTurnos" method="POST">
                                <div class="form-group col">   
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="idPaciente" name="idPaciente" placeholder="ID del paciente" value="<%= turno.getPacien().getId() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="idOdontologo" name="idOdontologo" placeholder="ID del odontologo" value="<%= turno.getOdonto().getId()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="Date" class="form-control form-control-user"
                                            id="fechaTurno" name="fechaTurno" placeholder="Fecha_turno" value="<%= turno.getFecha_turno() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="horaTurno" name="horaTurno" placeholder="Hora del turno" value="<%= turno.getHora_turno() %>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="afeccionTurno" name="afeccionTurno" placeholder="Afeccion" value="<%= turno.getAfeccion() %>">
                                    </div>
                                </div>
                                <button  class="btn btn-primary btn-user btn-block" type="submit">
                                    Editar turno
                                </button>
                                
</form>

<%@include file="components/bodyFinal.jsp" %>