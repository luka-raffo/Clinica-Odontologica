/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author luka
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearSoloUsuario(String nombreUsuario,String contrasenia, String rol){
        Usuario usu = new Usuario();
        
        
        usu.setNombre(nombreUsuario);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        controlPersis.crearUsuario(usu);
    }
    
    public void crearUsuario(Usuario usu,String nombreUsuario,String contrasenia, String rol){
        
        
        usu.setNombre(nombreUsuario);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        controlPersis.crearUsuario(usu);
    }
    

    public List<Usuario> getUsuarios() {
       return controlPersis.getUsuarios();
        
    }

    public void borrarUsuario(int id) {
        controlPersis.borrarUsuario(id);

    }

    public Usuario getUsuario(int id) {
       return controlPersis.getUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
       controlPersis.editarUsuario(usu);
    }

    public void crearOdontologo(String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNac, String especialidad, Usuario usu) {
        Odontologo odonto = new Odontologo();
        odonto.setDni(dni);
        odonto.setNombre(nombre);
        odonto.setApellido(apellido);
        odonto.setTelefono(telefono);
        odonto.setDireccion(direccion);
        odonto.setFecha_nac(fechaNac);
        odonto.setEspecialidad(especialidad);
        odonto.setUnUsuario(usu);
        
        controlPersis.crearOdontologo(odonto);
    }

    public List<Odontologo> getOdontologos() {
        return controlPersis.getOdontologos();
    }

    public Odontologo getOdontologo(int id) {
        return controlPersis.getOdontologo(id);
    }

    public void editarOdontologo(Odontologo odonto) {
        controlPersis.editarOdonto(odonto);
    }

    public void borrarOdontologo(int id) {
        controlPersis.borrarOdontologo(id);
    }

    public void crearPaciente(String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNac, boolean tieneOS, String tipoSangre) {
        Paciente pacien = new Paciente();
        pacien.setDni(dni);
        pacien.setNombre(nombre);
        pacien.setApellido(apellido);
        pacien.setTelefono(telefono);
        pacien.setDireccion(direccion);
        pacien.setFecha_nac(fechaNac);
        pacien.setTiene_OS(tieneOS);
        pacien.setTipoSangre(tipoSangre);
        
        controlPersis.crearPaciente(pacien);
    }

    public List<Paciente> getPacientes() {
        return controlPersis.getPacientes();
    }

    public void borrarPaciente(int id) {
        controlPersis.borrarPaciente(id);
    }

    public Paciente getPaciente(int id) {
        return controlPersis.getPaciente(id);
    }

    public void editarPaciente(Paciente pacien) {
        controlPersis.editarPaciente(pacien);
    }

    public void borrarResponsable(int id) {
        controlPersis.borrarResponsable(id);
    }

    public void editarResponsable(Responsable responsable) {
        controlPersis.editarResponsable(responsable);
    }

    public void crearResponsable(String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNac, String tipoResponsable) {
        Responsable responsable = new Responsable();
        
        responsable.setDni(dni);
        responsable.setNombre(nombre);
        responsable.setApellido(apellido);
        responsable.setTelefono(telefono);
        responsable.setDireccion(direccion);
        responsable.setFecha_nac(fechaNac);
        responsable.setTipo_resp(tipoResponsable);
        
        controlPersis.crearResponsable(responsable);
    }

    public void crearSecretario(String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNac, String sector, Usuario usu) {
        Secretario secretario = new Secretario();
        secretario.setDni(dni);
        secretario.setNombre(nombre);
        secretario.setApellido(apellido);
        secretario.setTelefono(telefono);
        secretario.setDireccion(direccion);
        secretario.setFecha_nac(fechaNac);
        secretario.setSector(sector);
        secretario.setUnUsuario(usu);
        
        controlPersis.crearSecretario(secretario);
    }

    public List<Secretario> getSecretarios() {
        
        return controlPersis.getSecretarios();
    }

    public void borrarSecretario(int id) {
        controlPersis.borrarSecretario(id);
    }

    public Secretario getSecretario(int id) {
        
        return controlPersis.getSecretario(id);
        
    }

    public void editarSecretario(Secretario secretario) {
        controlPersis.editarSecretario(secretario);
    }

    public void crearTurno(Turno turno, Date fechaTurno, String horaTurno, String afeccionTurno,Paciente pacien,Odontologo odonto) {
        turno.setFecha_turno(fechaTurno);
        turno.setHora_turno(horaTurno);
        turno.setAfeccion(afeccionTurno);
        turno.setPacien(pacien);
        turno.setOdonto(odonto);
        
        controlPersis.crearTurno(turno);
    }

    public List<Turno> getTurnos() {
        return controlPersis.getTurnos();
    }

    public void borrarTurno(int id) {
        controlPersis.borrarTurno(id);
    }

    public Turno getTurno(int id) {
        
        return controlPersis.getTurno(id);
    }

    public void editarTurno(Turno turno) {
        controlPersis.editarTurno(turno);
    }

    public void crearHorario(String horarioInicio, String horarioFin, Horario horario) {
        horario.setHorario_inicio(horarioInicio);
        horario.setHorario_fin(horarioFin);
        
        controlPersis.crearHorario(horario);
    }

    public List<Horario> getHorarios() {
        return controlPersis.getHorarios();
    }

    public void borrarHorario(int id) {
        controlPersis.borrarHorario(id);
    }

    public Horario getHorario(int id) {
        return controlPersis.getHorario(id);
    }

    public void editarHorario(Horario horario) {
        controlPersis.editarHorario(horario);
    }

    public boolean comprobarIngreso(String usuario, String contrasenia) {
        List<Usuario>listaUsu = new ArrayList<Usuario>();
        
        listaUsu = controlPersis.getUsuarios();
        boolean validacion = false;
        for(Usuario usu : listaUsu){
            if(usu.getNombre().equals(usuario) & usu.getContrasenia().equals(contrasenia)){
                validacion= true;
            }
            }
        return validacion;
    }

    



    
   
}
