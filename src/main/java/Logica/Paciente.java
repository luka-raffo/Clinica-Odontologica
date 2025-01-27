
package Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable{
    
    //Obra Social
    private boolean tiene_OS;
    
    private String tipoSangre;
    
    @OneToOne
    private Responsable un_Responsable;
    
    @OneToMany(mappedBy="pacien") 
    private List<Turno>listaTurnos;

    public Paciente() {
    }

    public Paciente(boolean tiene_OS, String tipoSangre, Responsable un_Responsable, List<Turno> listaTurnos, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.tiene_OS = tiene_OS;
        this.tipoSangre = tipoSangre;
        this.un_Responsable = un_Responsable;
        this.listaTurnos = listaTurnos;
    }

    

    

    

    public Responsable getUn_Responsable() {
        return un_Responsable;
    }

    public void setUn_Responsable(Responsable un_Responsable) {
        this.un_Responsable = un_Responsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }


    public boolean isTiene_OS() {
        return tiene_OS;
    }

    public void setTiene_OS(boolean tiene_OS) {
        this.tiene_OS = tiene_OS;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    
    
    
        
    
}
