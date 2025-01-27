<%-- 
    Document   : altaHorarios
    Created on : 2 ene 2025, 8:56:16 p. m.
    Author     : luka
--%>

<%@page import="Logica.Odontologo"%>
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>


    <%Odontologo odonto = (Odontologo)request.getSession().getAttribute("odontoEditar");%>

<h1>Horarios</h1>


                            <form class="user" action="SvHorarios" method="POST">
                                <div class="form-group col" >
                                    
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="HorarioInicio" name="HorarioInicio"
                                            placeholder="Horario inicio" >
                                    </div>
                                    <div class="col-sm-6 mb-3 ">
                                        <input type="text" class="form-control form-control-user"
                                            id="HorarioFin" name="HorarioFin" placeholder="fin del horario" >
                                    </div>
                                    
                                </div>
                                
                                <button class="btn btn-primary btn-user btn-block" type="submit">
                                    Añadir horario
                                </button> 
                                <input type="hidden" name="id" value="<%=odonto.getId() %>">   
                            </form>

<%@include file="components/bodyFinal.jsp" %>
