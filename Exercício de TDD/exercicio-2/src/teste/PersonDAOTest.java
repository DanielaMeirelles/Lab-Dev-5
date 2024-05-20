package teste;

import org.junit.jupiter.api.Test;

import main.Email;
import main.Person;
import main.PersonDAO;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


public class PersonDAOTest {

	@Test
    public void testNameHasAtLeastTwoParts() {
        Person person = new Person(1, "John", 25);
        person.addEmail(new Email(1, "john@example.com"));
        PersonDAO dao = new PersonDAO();
        List<String> errors = dao.isValidToInclude(person);
        assertTrue(errors.contains("O nome deve conter pelo menos duas partes"));
    }

    @Test
    public void testAgeIsInRange() {
        Person person = new Person(1, "John Doe", 250);
        person.addEmail(new Email(1, "john@example.com"));
        PersonDAO dao = new PersonDAO();
        List<String> errors = dao.isValidToInclude(person);
        assertTrue(errors.contains("A idade deve estar no intervalo de 1 a 200"));
    }

    @Test
    public void testHasAtLeastOneEmail() {
        Person person = new Person(1, "John Doe", 25);
        PersonDAO dao = new PersonDAO();
        List<String> errors = dao.isValidToInclude(person);
        assertTrue(errors.contains("Deve haver pelo menos um email associado"));
    }

    @Test
    public void testEmailFormatIsValid() {
        Person person = new Person(1, "John Doe", 25);
        person.addEmail(new Email(1, "johnexample.com"));
        PersonDAO dao = new PersonDAO();
        List<String> errors = dao.isValidToInclude(person);
        assertTrue(errors.contains("O email deve estar no formato \"____@____.____\""));
    }

    @Test
    public void testValidPerson() {
        Person person = new Person(1, "John Doe", 25);
        person.addEmail(new Email(1, "john@example.com"));
        PersonDAO dao = new PersonDAO();
        List<String> errors = dao.isValidToInclude(person);
        assertTrue(errors.isEmpty());
    }
}
