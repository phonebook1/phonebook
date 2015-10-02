package cn.thiki.phonebook.persistence;

import org.junit.Test;

/**
 * Created by Administrator on 2015/9/23.
 */
public class PersonsRepositoryTest {
    @Test
    public void 获取联系人列表() {
        PersonsRepository personsRepository = new PersonsRepository();
        System.out.println(personsRepository.loadPersons());
    }
}