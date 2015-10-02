package cn.thiki.phonebook.domain;

import cn.thiki.phonebook.persistence.PersonRepository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/4.
 */
public class Person {
    private PersonRepository personRepository;

    public Person(){
        this.personRepository = personRepository;
    }

    public PersonRepository getPersonRepository(){
        return personRepository;
    }

    public List<Map<String,Object>> loaderPerson(){
        return personRepository.loaderPerson();
    }
}
