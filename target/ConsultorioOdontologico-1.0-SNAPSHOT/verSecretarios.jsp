<%-- 
    Document   : verSecretarios
    Created on : 2 ene 2025, 6:41:11 a. m.
    Author     : luka
--%>


<%@page import="Logica.Secretario"%>
<%@page import="Logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Secretarios</h1>
    <p class="mb-4">visualizacion de tabla Secretarios:</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Secretarios </h6>
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
                            <th>sector</th>
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
                            <th>sector</th>
                            <th>Usuario</th>
                            <th style="width: 200px">Accion</th> 
                        </tr>
                    </tfoot>

                        <%
                        List<Secretario> listaSecretarios = (List) request.getSession().getAttribute("listaSecretarios");
                        %>
                    <tbody>
                        <%for(Secretario secretario : listaSecretarios){%>
                                                
                        <tr>
                            <td><%=secretario.getId()%></td>
                            <td><%=secretario.getDni()%></td>

                            <td><%=secretario.getNombre()%></td>
                            <td><%=secretario.getApellido()%></td>
                            <td><%=secretario.getTelefono()%></td>
                            <td><%=secretario.getDireccion()%></td>
                            <td><%=secretario.getFecha_nac()%></td>
                            <td><%=secretario.getSector()%></td>
                            <td><%=secretario.getUnUsuario().getNombre()%></td>
                            
                            
        <td style="display: flex; flex-direction: column; width: 200px;">
        <div style="display: flex; margin-bottom: 5px;">
            
            <form name="eliminar" action="SvElimSecretario" method="POST"style="flex: 1; margin-right: 5px;">
            <button type="submit" class="btn-primary btn-user btn-block" style="background-color: red;">
                <i class="fas fa-trash-alt"></i> Eliminar
            </button>
            <input type="hidden" name="id" value="<%=secretario.getId()%>">
        </form>
            <form name="editar" action="SvEditSecretarios" method="GET" style="flex: 1;">
                <button type="submit" class="btn-primary btn-user btn-block">
                    <i class="fas fa-pencil-alt"></i> Editar
                </button>
                <input type="hidden" name="id" value="<%=secretario.getId()%>">
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
