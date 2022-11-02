package peaksoft.serviceImpl;

import peaksoft.dao.PersonDao;
import peaksoft.daoImpl.PersonDaoImpl;
import peaksoft.entity.Person;
import peaksoft.service.PersonService;

public class PersonServiceImpl implements PersonService {
    PersonDao personDao = new PersonDaoImpl();

    @Override
    public void createPerson() {
        personDao.createPersonTaable();

    }

    @Override
    public void savePersonTable(Person person,Long compnanies_id) {
        personDao.savePerson(person,compnanies_id);
    }


    @Override
    public void deletePersonById(Long id) {
        personDao.deletePersonById(id);

    }
}
