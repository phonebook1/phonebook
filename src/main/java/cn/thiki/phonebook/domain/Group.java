package cn.thiki.phonebook.domain;

/**
 * Created by Administrator on 2015/9/5.
 */
public class Group {
    /**
     * ���Group������;
     */
    private String id;
    private String groupsname;

    /**
     * д���Ե�get and set����;
     * @return
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupsname() {
        return groupsname;
    }

    public void setGroupsname(String groupsname) {
        this.groupsname = groupsname;
    }
    /*
    //���"��"����
    public void updateGroup(){

    }

    //���"����"����
    public void findGroup(){

    }
    */
    public Group(String id,String groupsname){
        this.id = id;
        this.groupsname = groupsname;
    }
}
