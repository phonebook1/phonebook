package cn.thiki.phonebook.domain;

/**
 * Created by Administrator on 2015/9/4.
 */
public class Person {
    /**
     * 添加Person的属性;
     */
    private int id;
    private String name;
    private String phonenumber;
    private String company;
    private String birthPlace;
    private String sex;
    private int groupId;
    private String personRepository;

    /**
     * 写各属性的get and set方法;
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getPersonRepository() {
        return personRepository;
    }

    public void setPersonRepository(String personRepository) {
        this.personRepository = personRepository;
    }

    //添加"改"方法
    public void updatePerson(){

    }

    //添加"查找"方法
    public void findPerson(){

    }
}
