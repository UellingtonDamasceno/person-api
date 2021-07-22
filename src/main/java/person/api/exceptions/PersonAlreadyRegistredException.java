package person.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Uellington Damasceno
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PersonAlreadyRegistredException extends Exception{

    public PersonAlreadyRegistredException(String cpf) {
        super(String.format("Person with cpf: %s already registred in the system.", cpf));
    }
    
}
