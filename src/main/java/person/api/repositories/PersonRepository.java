package person.api.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import person.api.entities.Person;

/**
 *
 * @author Uellington Damasceno
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByCpf(String cpf);
}
