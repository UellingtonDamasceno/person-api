package person.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import person.api.entities.Person;
import person.api.exceptions.PersonAlreadyRegistredException;
import person.api.exceptions.PersonNotFoundException;
import person.api.services.PersonService;

/**
 *
 * @author Uellington Damasceno
 */
@RestController
@RequestMapping(path = "api/v1/people")
public class PeopleController {

    private PersonService personService;

    @Autowired
    public PeopleController(PersonService personRepository) {
        this.personService = personRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person create(@RequestBody Person person) throws PersonAlreadyRegistredException {
        return personService.create(person);
    }

    @GetMapping
    public List<Person> listAll() {
        return personService.listAll();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findById(id);
    }
}
