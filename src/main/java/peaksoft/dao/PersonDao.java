package peaksoft.dao;

import peaksoft.entity.Person;

public interface PersonDao {
    void createPersonTaable();

    void savePerson(Person person,Long compnanies_id);


    void deletePersonById(Long id);
}
