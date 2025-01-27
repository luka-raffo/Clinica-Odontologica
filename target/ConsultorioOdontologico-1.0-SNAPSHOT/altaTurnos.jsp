<%-- 
    Document   : altaTurnos
    Created on : 2 ene 2025, 8:57:37 a. m.
    Author     : luka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<h1>Alta Turnos</h1>

<form class="odonto" action="SvTurnos" method="POST">
                                <div class="form-group col">   
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="idPaciente" name="idPaciente" placeholder="ID del paciente">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="idOdontologo" name="idOdontologo" placeholder="ID del odontologo">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="Date" class="form-control form-control-user"
                                            id="fechaTurno" name="fechaTurno" placeholder="Fecha_turno">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="horaTurno" name="horaTurno" placeholder="Hora del turno">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="afeccionTurno" name="afeccionTurno" placeholder="Afeccion">
                                    </div>
                                </div>
                                <button  class="btn btn-primary btn-user btn-block" type="submit">
                                    Crear turno
                                </button>
                                
</form>

<%@include file="components/bodyFinal.jsp" %>
