package cn.thiki.phonebook.domain;

import cn.thiki.phonebook.persistence.PersonByIdRepository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/10/19.
 */
public class PersonById {
    private PersonByIdRepository personByIdRepository;

    public PersonById(){
        this.personByIdRepository = new PersonByIdRepository();
    }

    public List<Map<String,Object>> loadPerson(int id) {
        return personByIdRepository.loadPerson(id);
    }
}
