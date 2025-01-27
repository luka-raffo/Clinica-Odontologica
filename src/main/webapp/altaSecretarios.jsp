<%-- 
    Document   : altaSecretarios
    Created on : 1 ene 2025, 9:28:07 p. m.
    Author     : luka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<h1>Alta Secretarios</h1>

<form class="odonto" action="SvSecretarios" method="POST">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="dniSecretario" name="dniSecretario"
                                            placeholder="dni">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreSecretario" name="nombreSecretario"
                                            placeholder="Nombre">
                                    </div>

                                    <div class="col-sm-6 mb-3 ">
                                        <input type="text" class="form-control form-control-user"
                                            id="apellidoSecretario" name="apellidoSecretario" placeholder="Apellido">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="telefonoSecretario" name="telefonoSecretario" placeholder="Telefono">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="direccionSecretario" name="direccionSecretario" placeholder="Direccion">
                                    </div>
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="Date" class="form-control form-control-user"
                                            id="fecha_nacSecretario" name="fecha_nacSecretario" placeholder="fecha_nac">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="sectorSecretario" name="sectorSecretario" placeholder="Especificar sector">
                                    </div>
                                    <h5>Asignar usuario</h5>
                                    <%@include file="components/columnasAltaUsuario.jsp" %>
                                </div>
                                <button  class="btn btn-primary btn-user btn-block" type="submit">
                                    Crear secretario
                                </button>
                                
</form>

<%@include file="components/bodyFinal.jsp" %>
