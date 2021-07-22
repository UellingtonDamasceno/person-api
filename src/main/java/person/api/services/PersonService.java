package person.api.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import person.api.entities.Person;
import person.api.exceptions.PersonAlreadyRegistredException;
import person.api.exceptions.PersonNotFoundException;
import person.api.repositories.PersonRepository;

/**
 *
 * @author Uellington Damasceno
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person create(Person person) throws PersonAlreadyRegistredException {
        String cpf = person.getCpf();
        if (personRepository.findByCpf(cpf).isPresent()) {
            throw new PersonAlreadyRegistredException(cpf);
        }
        return personRepository.save(person);
    }

    public List<Person> listAll() {
        return personRepository.findAll();
    }

    public Person findById(Long id) throws PersonNotFoundException {
        return personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }

}
