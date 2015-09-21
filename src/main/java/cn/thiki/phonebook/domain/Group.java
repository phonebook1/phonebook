package cn.thiki.phonebook.domain;

/**
 * Created by Administrator on 2015/9/5.
 */
public class Group {
    /**
     * 添加Group的属性;
     */
    private int id;
    private String groupsname;

    /**
     * 写属性的get and set方法;
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

    //添加"改"方法
    public void updateGroup(){

    }

    //添加"查找"方法
    public void findGroup(){

    }
}
