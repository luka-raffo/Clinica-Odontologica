<%-- 
    Document   : verHorarios
    Created on : 3 ene 2025, 7:07:38 a. m.
    Author     : luka
--%>

<%@page import="Logica.Horario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver horarios</h1>
    <p class="mb-4">visualizacion de tabla horarios</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Horarios </h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>horario inicio</th>
                            <th>horario fin</th>
                            <th style="width: 210px">Accion</th> 
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>ID</th>
                            <th>horario inicio</th>
                            <th>horario fin</th>
                            <th style="width: 210px">Accion</th> 
                        </tr>
                    </tfoot>
                    <%
                        List<Horario> listahorarios = (List) request.getSession().getAttribute("listaHorarios");
                    %>

                    <tbody>
                        
                        <%for(Horario horario : listahorarios){ %>                        
                        <tr>
                            <td id="id_usu<%=horario.getId_horario() %>"><%=horario.getId_horario() %></td>
                            <td><%=horario.getHorario_inicio()%></td>
                            <td><%=horario.getHorario_fin() %></td>
                            
                            <td style="display: flex; width: 230px;">
                            <%--<form name="eliminar" action="SvElimUsuarios" method="POST">
                                <button type="submit" class="btn-primary btn-user btn-block" style="background-color: red;margin-right:5px;">
                                <i class="fas fa-trash alt"></i>Eliminar
                                </button>
                                <input type="hidden" name="id" value="<%=usu.getId_usuario() %>">    
                            </form>--%>
                            
                    
                            <form name="editar" action="SvEditHorarios" method="GET">
                                <button type="submit" class="btn-primary btn-user btn-block" style="margin-left:5px;">
                                <i class="fas fa-pencil-alt"></i>Editar
                                </button>
                                <input type="hidden" name="id" value="<%=horario.getId_horario() %>">    
                            </form>
                          </td>  
                        </tr>
                        <%} %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid --> 

<%@include file="components/bodyFinal.jsp" %> 
