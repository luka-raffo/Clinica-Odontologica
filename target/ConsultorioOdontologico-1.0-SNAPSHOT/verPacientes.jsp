<%-- 
    Document   : verPacientes
    Created on : 27 dic 2024, 10:11:51 a. m.
    Author     : luka
--%>

<%@page import="Logica.Paciente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPart1.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">
    

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Pacientes</h1>
    <p class="mb-4">visualizacion de tabla Pacientes</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Pacientes </h6>
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
                            <th>Tiene OS</th>
                            <th>Tipo de sangre</th>
                            <th>Responsable</th>
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
                            <th>Tiene OS</th>
                            <th>Tipo de sangre</th>
                            <th>Responsable</th>
                            <th style="width: 200px">Accion</th> 
                        </tr>
                    </tfoot>

                        <%
                        List<Paciente> listaPacientes = (List)request.getSession().getAttribute("listaPacientes");
                        %>
                    <tbody>
                        <%for(Paciente pacien : listaPacientes){%>
                                                
                        <tr>
                            <td><%=pacien.getId()%></td>
                            <td><%=pacien.getDni()%></td>

                            <td><%=pacien.getNombre()%></td>
                            <td><%=pacien.getApellido()%></td>
                            <td><%=pacien.getTelefono()%></td>
                            <td><%=pacien.getDireccion()%></td>
                            <td><%=pacien.getFecha_nac()%></td>
                            <td><%=pacien.isTiene_OS()%></td>
                            <td><%=pacien.getTipoSangre()%></td>
                            <td><%if(pacien.getUn_Responsable()!=null){%>
                            <%=pacien.getUn_Responsable().getTipo_resp()%></td>
                            <%}%>
                            
                            
                            
                            
                          <td style="display: flex; width: 250px;">
                            <form name="eliminar" action="SvElimPacientes" method="POST">
                                <button type="submit" class="btn-primary btn-user btn-block" style="background-color: red;margin-right:5px;">
                                <i class="fas fa-trash alt"></i>Eliminar
                                </button>
                                <input type="hidden" name="id" value="<%=pacien.getId()%>">    
                            </form>
                            
                    
                            <form name="editar" action="SvEditPacientes" method="GET">
                                <button type="submit" class="btn-primary btn-user btn-block" style="margin-left:5px;">
                                <i class="fas fa-pencil-alt"></i>Editar
                                </button>
                                <input type="hidden" name="id" value="<%=pacien.getId()%>">    
                            </form>
                            <form name="add_responsable" action="SvResponsables" method="GET">
                                <button type="submit" class="btn-primary btn-user btn-block" style="margin-left:10px;">
                                <i class="fa fa-user-plus" aria-hidden="true"></i>Añadir responsable
                                </button>
                                <input type="hidden" name="id" value="<%=pacien.getId()%>">    
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
