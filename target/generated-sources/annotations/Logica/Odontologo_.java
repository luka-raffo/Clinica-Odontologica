package Logica;

import Logica.Horario;
import Logica.Turno;
import Logica.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2025-01-14T11:02:43")
@StaticMetamodel(Odontologo.class)
public class Odontologo_ extends Persona_ {

    public static volatile SingularAttribute<Odontologo, Usuario> unUsuario;
    public static volatile SingularAttribute<Odontologo, Horario> horario;
    public static volatile SingularAttribute<Odontologo, String> especialidad;
    public static volatile ListAttribute<Odontologo, Turno> listaTurnos;

}