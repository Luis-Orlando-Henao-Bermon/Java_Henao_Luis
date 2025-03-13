package persona.Gestion;

import java.util.List;

public interface IPersonaDAO {
    List<Persona> listaPersonas(List<Persona> personas);
    boolean bucarPersonaPorId(Persona persona);
    boolean agregarPersona(Persona persona);
    boolean modificarPersona(Persona persona, int id);
    boolean EliminarPersona(int id);
}
