package person.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Uellington Damasceno
 */
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class PersonNotFoundException extends Exception {

    public PersonNotFoundException(Long id) {
        super(String.format("Person with id: %s not found in the system.", id));
    }

    public PersonNotFoundException(String cpf) {
        super(String.format("Person with cpf: %s not found in the system.", cpf));
    }
}
