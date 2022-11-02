package peaksoft.service;

import peaksoft.entity.Person;

public interface PersonService {

    void createPerson();

    void savePersonTable(Person person,Long compnanies_id);

    void deletePersonById(Long id);
}
