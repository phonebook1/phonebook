package cn.thiki.phonebook;

import cn.thiki.phonebook.domain.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/9/4.
 */
public class PersonTest {

    @Test
    public void 查询(){

    }

    @Test
    public void 删除(){

    }

    @Test
    public void 插入(){

    }

    @Test
    public void 修改(){

    }

    /**
     * 建立用于存放Person属性值的List;
     */
    public List personToAdd;
    public PersonTest(){
        this.personToAdd = new ArrayList();
    }

    /**
     * 往List中添加属性值;
     */
    public void personAdd(){
        Person person1 = new Person(1,"Jack","13776305706","Mircrosoft"
                ,"American","male",4);
        Person person2 = new Person(2,"Lucy","13776305707","Mircrosoft"
                ,"American","female",3);
        Person person3 = new Person(3,"Mike","13776305708","Google"
                ,"England","male",2);
        Person person4 = new Person(4,"John","13776305709","Apple"
                ,"American","male",1);

        for (int i=0;i<4;i++){
            personToAdd.add(i);
        }

        for (int i=0;i<4;i++){
            Person temp = (Person) personToAdd.get(i);
            System.out.println(temp.getId()+" "+temp.getName()+" "
                +temp.getPhonenumber()+" "+temp.getCompany()+" "+temp.getBirthPlace()
            +" "+temp.getSex()+" "+temp.getGroupId());
        }
    }

    public static void main(String[] args){
        PersonTest personTest = new PersonTest();
        personTest.personAdd();
    }
}