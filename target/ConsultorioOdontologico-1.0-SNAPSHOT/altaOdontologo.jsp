<%-- 
    Document   : altas
    Created on : 19 dic 2024, 9:03:06 a. m.
    Author     : luka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<h1>Alta odontologo</h1>

<form class="odonto" action="SvOdontologos" method="POST">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="dniOdonto" name="dniOdonto"
                                            placeholder="dni">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreOdonto" name="nombreOdonto"
                                            placeholder="Nombre">
                                    </div>

                                    <div class="col-sm-6 mb-3 ">
                                        <input type="text" class="form-control form-control-user"
                                            id="apellidoOdonto" name="apellidoOdonto" placeholder="Apellido">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="telefonoOdonto" name="telefonoOdonto" placeholder="Telefono">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="direccionOdonto" name="direccionOdonto" placeholder="Direccion">
                                    </div>
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="Date" class="form-control form-control-user"
                                            id="fecha_nacOdonto" name="fecha_nacOdonto" placeholder="fecha_nac">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user"
                                            id="especialidadOdonto" name="especialidadOdonto" placeholder="Especialidad">
                                    </div>
                                    <h5>Asignar usuario</h5>
                                    <%@include file="components/columnasAltaUsuario.jsp" %>
                                </div>
                                <button  class="btn btn-primary btn-user btn-block" type="submit">
                                    Crear odontologo
                                </button>
                                
</form>

<%@include file="components/bodyFinal.jsp" %>