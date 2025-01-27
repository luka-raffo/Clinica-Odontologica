<%-- 
    Document   : verOdontologos
    Created on : 24 dic 2024, 7:19:41 p. m.
    Author     : luka
--%>

<%@page import="Logica.Odontologo"%>
<%@page import="Logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Odontologos</h1>
    <p class="mb-4">visualizacion de tabla Odontologos:</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Odontologos </h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>DNI</th>
                            <th>Nombre</th>
                            <th>apellido</th>
                            <th>telefono</th>
                            <th>direccion</th>
                            <th>fecha_nac</th>
                            <th>especialidad</th>
                            <th>Usuario</th>
                            <th style="width: 200px">Accion</th> 
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>ID</th>
                            <th>DNI</th>
                            <th>Nombre</th>
                            <th>apellido</th>
                            <th>telefono</th>
                            <th>direccion</th>
                            <th>fecha_nac</th>
                            <th>especialidad</th>
                            <th>Usuario</th>
                            <th style="width: 200px">Accion</th> 
                        </tr>
                    </tfoot>

                        <%
                        List<Odontologo> listaOdontologos = (List) request.getSession().getAttribute("listaOdontologos");
                        %>
                    <tbody>
                        <%for(Odontologo odonto : listaOdontologos){%>
                                                
                        <tr>
                            <td id="id_odonto <%=odonto.getId()%>"><%=odonto.getId()%></td>
                            <td><%=odonto.getDni()%></td>

                            <td><%=odonto.getNombre()%></td>
                            <td><%=odonto.getApellido()%></td>
                            <td><%=odonto.getTelefono()%></td>
                            <td><%=odonto.getDireccion()%></td>
                            <td><%=odonto.getFecha_nac()%></td>
                            <td><%=odonto.getEspecialidad()%></td>
                            <td><%=odonto.getUnUsuario().getNombre()%></td>
                            
                            
        <td style="display: flex; flex-direction: column; width: 200px;">
        <div style="display: flex; margin-bottom: 5px;">
            
            <form name="eliminar" action="SvElimOdontologos" method="POST"style="flex: 1; margin-right: 5px;">
            <button type="submit" class="btn-primary btn-user btn-block" style="background-color: red;">
                <i class="fas fa-trash-alt"></i> Eliminar
            </button>
            <input type="hidden" name="id" value="<%=odonto.getId()%>">
        </form>
            <form name="editar" action="SvEditOdontologos" method="GET" style="flex: 1;">
                <button type="submit" class="btn-primary btn-user btn-block">
                    <i class="fas fa-pencil-alt"></i> Editar
                </button>
                <input type="hidden" name="id" value="<%=odonto.getId()%>">
            </form>
        </div>
        
        <form name="crear" action="SvHorarios" method="GET" >
                        <button type="submit" class="btn-primary btn-user btn-block" style="background-color: gray;">
                        <i class="fas fa-solid fa-stopwatch"></i> añadir horario
                        </button>
                    <input type="hidden" name="id" value="<%=odonto.getId()%>">
            </form>
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
