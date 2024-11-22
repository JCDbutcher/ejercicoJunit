package ejercicioMvn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {

    @Test
    void testAddContacto() {
        ContactManager manager = new ContactManager();
        Contacto contacto = new Contacto(1, "Juan", "juan@example.com", 25);
        manager.addContacto(contacto);
        assertEquals(1, manager.getAllContactos().size());
    }

    @Test
    void testGetContactoById() {
        ContactManager manager = new ContactManager();
        Contacto contacto = new Contacto(1, "Juan", "juan@example.com", 25);
        manager.addContacto(contacto);
        assertNotNull(manager.getContactoById(1));
        assertNull(manager.getContactoById(2));
    }

    @Test
    void testDeleteContacto() {
        ContactManager manager = new ContactManager();
        Contacto contacto = new Contacto(1, "Juan", "juan@example.com", 25);
        manager.addContacto(contacto);
        assertTrue(manager.deleteContacto(1));
        assertFalse(manager.deleteContacto(2));
    }

    @Test
    void testGetAllContactos() {
        ContactManager manager = new ContactManager();
        Contacto contacto1 = new Contacto(1, "Juan", "juan@example.com", 25);
        Contacto contacto2 = new Contacto(2, "Ana", "ana@example.com", 30);
        manager.addContacto(contacto1);
        manager.addContacto(contacto2);
        assertEquals(2, manager.getAllContactos().size());
    }
}

