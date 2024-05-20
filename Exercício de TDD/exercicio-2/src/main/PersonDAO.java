package main;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

	public void save(Person p) {
        // Implementação do método save
    }

    public List<String> isValidToInclude(Person p) {
        List<String> errors = new ArrayList<>();

        // Validar se o nome tem pelo menos duas partes
        if (p.getName().trim().split("\\s+").length < 2) {
            errors.add("O nome deve conter pelo menos duas partes");
        }

        // Validar se a idade está no intervalo [1, 200]
        if (p.getAge() < 1 || p.getAge() > 200) {
            errors.add("A idade deve estar no intervalo de 1 a 200");
        }

        // Validar se há pelo menos um email associado
        if (p.getEmails() == null || p.getEmails().isEmpty()) {
            errors.add("Deve haver pelo menos um email associado");
        } else {
            // Validar se os emails estão no formato correto
            for (Email email : p.getEmails()) {
                if (!email.getName().matches("^\\S+@\\S+\\.\\S+$")) {
                    errors.add("O email deve estar no formato \"_____@____.____\"");
                    break;
                }
            }
        }

        return errors;
    }
}
