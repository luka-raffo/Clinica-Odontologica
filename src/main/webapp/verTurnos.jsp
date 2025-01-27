<%-- 
    Document   : verTurnos
    Created on : 2 ene 2025, 12:09:52 p. m.
    Author     : luka
--%>

<%@page import="Logica.Turno"%>
<%@page import="Logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Turnos</h1>
    <p class="mb-4">visualizacion de tabla Turnos</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Turnos </h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>id Turno</th>
                            <th>id Paciente</th>
                            <th>id Odontologo</th>
                            <th>fecha</th>
                            <th>hora</th>
                            <th>afeccion</th>
                            
                            <th style="width: 200px">Accion</th> 
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>id Turno</th>
                            <th>id Paciente</th>
                            <th>id Odontologo</th>
                            <th>fecha</th>
                            <th>hora</th>
                            <th>afeccion</th>
                            <th style="width: 200px">Accion</th> 
                        </tr>
                    </tfoot>

                        <%
                        List<Turno> listaTurnos = (List) request.getSession().getAttribute("listaTurnos");
                        %>
                    <tbody>
                        <%for(Turno turno : listaTurnos){%>
                                                
                        <tr>
                            <th><%=turno.getId_turno()%></th>
                            <td><%=turno.getPacien().getId()%></td>
                            <td><%=turno.getOdonto().getId()%> </td>
                            <td><%=turno.getFecha_turno()%></td>
                            <td><%=turno.getHora_turno()%></td>
                            <td><%=turno.getAfeccion()%></td>
                            
                            
                            
        <td style="display: flex; flex-direction: column; width: 200px;">
        <div style="display: flex; margin-bottom: 5px;">
            
            <form name="eliminar" action="SvElimTurnos" method="POST"style="flex: 1; margin-right: 5px;">
            <button type="submit" class="btn-primary btn-user btn-block" style="background-color: red;">
                <i class="fas fa-trash-alt"></i> Eliminar
            </button>
            <input type="hidden" name="id" value="<%=turno.getId_turno()%>">
        </form>
            <form name="editar" action="SvEditTurnos" method="GET" style="flex: 1;">
                <button type="submit" class="btn-primary btn-user btn-block">
                    <i class="fas fa-pencil-alt"></i> Editar
                </button>
                <input type="hidden" name="id" value="<%=turno.getId_turno()%>">
            </form>
        </div>
        
        
    </td>
</tr>
                        <%}%>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid --> 

<%@include file="components/bodyFinal.jsp" %>
