package cn.thiki.phonebook.domain;

/**
 * Created by Administrator on 2015/9/5.
 */
public class Group {
    /**
     * ���Group������;
     */
    private int id;
    private String groupsname;

    /**
     * д���Ե�get and set����;
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupsname() {
        return groupsname;
    }

    public void setGroupsname(String groupsname) {
        this.groupsname = groupsname;
    }

    //���"��"����
    public void updateGroup(){

    }

    //���"����"����
    public void findGroup(){

    }
}
