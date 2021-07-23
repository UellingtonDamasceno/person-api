package person.api.services;

import java.util.List;
import static java.util.stream.Collectors.toList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import person.api.dto.request.PersonDTO;
import person.api.entities.Person;
import person.api.exceptions.PersonAlreadyRegistredException;
import person.api.exceptions.PersonNotFoundException;
import person.api.mapper.PersonMapper;
import person.api.repositories.PersonRepository;

/**
 *
 * @author Uellington Damasceno
 */
@Service
public class PersonService {

    @Autowired
    private final PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person create(PersonDTO personDTO) throws PersonAlreadyRegistredException {
        Person personToSave = personMapper.toModel(personDTO);
        return personRepository.save(personToSave);
    }

    public List<PersonDTO> listAll() {
        return personRepository.findAll()
                .stream()
                .map(personMapper::toDTO)
                .collect(toList());
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {
        Person person = this.verifyIfExist(id);
        return this.personMapper.toDTO(person);
    }

    public void deleteById(Long id) throws PersonNotFoundException {
        this.verifyIfExist(id);
        this.personRepository.deleteById(id);
    }

    private Person verifyIfExist(Long id) throws PersonNotFoundException {
        return personRepository
                .findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }

}
