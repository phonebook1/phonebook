package cn.thiki.phonebook.domain;

import cn.thiki.phonebook.persistence.PersonsRepository;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/5.
 */
public class Persons {
    private PersonsRepository personsRepository;

    public Persons() {
        this.personsRepository = new PersonsRepository();
    }

    public PersonsRepository getPersonsRepository() {
        return personsRepository;
    }

    public List<Map<String, Object>> loadPersons() {
        return personsRepository.loadPersons();
    }

    public void addPerson(JSONObject person) {
        personsRepository.addPerson(person);
    }

    public void deletePerson(int id) throws Exception {
        personsRepository.deletePerson(id);
    }

    public void updatePerson(int id, JSONObject person) throws Exception {
        personsRepository.updatePerson(id,person);
    }
}
