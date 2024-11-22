package ejercicioMvn;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contacto> contactos;

    public ContactManager() {
        this.contactos = new ArrayList<>();
    }

    // Crear contacto
    public void addContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    // Buscar contacto por ID
    public Contacto getContactoById(int id) {
        return contactos.stream()
                .filter(contacto -> contacto.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Eliminar contacto por ID
    public boolean deleteContacto(int id) {
        return contactos.removeIf(contacto -> contacto.getId() == id);
    }

    // Obtener todos los contactos
    public List<Contacto> getAllContactos() {
        return contactos;
    }
}

