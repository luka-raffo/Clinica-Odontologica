<%-- 
    Document   : altaPacientes
    Created on : 27 dic 2024, 8:45:31 a. m.
    Author     : luka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<form class="user" action="SvPacientes" method="POST">
                                
        <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="dniPaciente" name="dniPaciente"
                                            placeholder="dni">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombrePaciente" name="nombrePaciente"
                                            placeholder="Nombre">
                                    </div>

                                    <div class="col-sm-6 mb-3 ">
                                        <input type="text" class="form-control form-control-user"
                                            id="apellidoPaciente" name="apellidoPaciente" placeholder="Apellido">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="telefonoPaciente" name="telefonoPaciente" placeholder="Telefono">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="direccionPaciente" name="direccionPaciente" placeholder="Direccion">
                                    </div>
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="Date" class="form-control form-control-user"
                                            id="fecha_nacPaciente" name="fecha_nacPaciente" placeholder="fecha_nac">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                    <select class="form-control form-control-user" id="OS_paciente" name="OS_paciente">
                                    <option value="">El paciente cuenta con una Obra Social?</option>
                                    <option value="true">Sí</option>
                                    <option value="false">No</option>
                                    </select>
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="tipo_sangrePaciente" name="tipo_sangrePaciente" placeholder="tipo de sangre">
                                    </div>
                                    
                                     
                                </div>
                                <button  class="btn btn-primary btn-user btn-block" type="submit">
                                    Alta paciente
                                </button>
                                
</form>

<%@include file="components/bodyFinal.jsp" %>
