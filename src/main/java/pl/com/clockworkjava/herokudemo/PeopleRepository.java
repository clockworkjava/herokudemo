package pl.com.clockworkjava.herokudemo;

import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends CrudRepository<Person, Long> {
}
