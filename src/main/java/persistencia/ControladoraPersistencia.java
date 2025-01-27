/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Logica.Horario;
import Logica.Odontologo;
import Logica.Paciente;
import Logica.Responsable;
import Logica.Secretario;
import Logica.Turno;
import Logica.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author luka
 */
public class ControladoraPersistencia {
    
    HorarioJpaController horarioJPA = new HorarioJpaController();
    OdontologoJpaController odontoJPA = new OdontologoJpaController();
    PacienteJpaController pacienJPA = new PacienteJpaController();
    PersonaJpaController persJPA = new PersonaJpaController();
    ResponsableJpaController respJPA = new ResponsableJpaController();
    SecretarioJpaController secreJPA = new SecretarioJpaController();
    TurnoJpaController turnoJPA = new TurnoJpaController();
    UsuarioJpaController usuJPA = new UsuarioJpaController();

    public void crearUsuario(Usuario usu) {
        usuJPA.create(usu);

    }

    public List<Usuario> getUsuarios() {
        return usuJPA.findUsuarioEntities();
    }

    public void borrarUsuario(int id) {
        try {
            usuJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario getUsuario(int id) {
        return usuJPA.findUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearOdontologo(Odontologo odonto) {
        odontoJPA.create(odonto);
    }

    public List<Odontologo> getOdontologos() {
        return odontoJPA.findOdontologoEntities();
    }

    public Odontologo getOdontologo(int id) {
        return odontoJPA.findOdontologo(id);
    }

    public void editarOdonto(Odontologo odonto) {
        try { 
            odontoJPA.edit(odonto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarOdontologo(int id) {
        try {
            odontoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearPaciente(Paciente pacien) {
        pacienJPA.create(pacien);
    }

    public List<Paciente> getPacientes() {
        return pacienJPA.findPacienteEntities();
    }

    public void borrarPaciente(int id) {
        try {
            pacienJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Paciente getPaciente(int id) {
        return pacienJPA.findPaciente(id);
    }

    public void editarPaciente(Paciente pacien) {
        try {
            pacienJPA.edit(pacien);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarResponsable(int id) {
        
        try {
            respJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void editarResponsable(Responsable responsable) {
        try {
            respJPA.edit(responsable);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearResponsable(Responsable responsable) {
        respJPA.create(responsable);
    }

    public void crearSecretario(Secretario secretario) {
        secreJPA.create(secretario);
    }

    public List<Secretario> getSecretarios(){
        
        return secreJPA.findSecretarioEntities();
    }

    public void borrarSecretario(int id) {
        try {
            secreJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Secretario getSecretario(int id) {
        return secreJPA.findSecretario(id);
    }

    public void editarSecretario(Secretario secretario) {
        try {
            secreJPA.edit(secretario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearTurno(Turno turno) {
        turnoJPA.create(turno);
    }

    public List<Turno> getTurnos() {
        return turnoJPA.findTurnoEntities();
    }

    public void borrarTurno(int id) {
        try {
            turnoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Turno getTurno(int id){
        return turnoJPA.findTurno(id);
    }

    public void editarTurno(Turno turno) {
        try {
            turnoJPA.edit(turno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearHorario(Horario horario) {
        horarioJPA.create(horario);
    }

    public List<Horario> getHorarios() {
        return horarioJPA.findHorarioEntities();
    }

    public void borrarHorario(int id) {
        try {
            horarioJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Horario getHorario(int id) {
        return horarioJPA.findHorario(id);
    }

    public void editarHorario(Horario horario) {
        try {
            horarioJPA.edit(horario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    

    

    

    
    
    
    
    
}
