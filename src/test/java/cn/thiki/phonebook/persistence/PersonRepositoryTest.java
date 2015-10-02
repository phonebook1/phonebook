package cn.thiki.phonebook.persistence;

import org.junit.Test;

/**
 * Created by Administrator on 2015/9/29.
 */
public class PersonRepositoryTest {
    @Test
    public void 获取个人信息(){
        PersonRepository personRepository = new PersonRepository();
        System.out.println(personRepository.loaderPerson());
    }
}