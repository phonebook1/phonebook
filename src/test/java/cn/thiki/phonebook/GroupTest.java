package cn.thiki.phonebook;

import cn.thiki.phonebook.domain.Group;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/9/5.
 */
public class GroupTest {
    /**
     *用于存放Group组中id,groupsname的List;
     */
    public List groupToAdd;
    public GroupTest(){
        this.groupToAdd = new ArrayList();
    }

    /**
     * 用于往groupToAdd中添加属性值
     */
    public void groupAdd(){
        Group group1 = new Group("1","家人");
        Group group2 = new Group("2","同学");
        Group group3 = new Group("3","同事");
        Group group4 = new Group("4","朋友");

        groupToAdd.add(group1);
        groupToAdd.add(group2);
        groupToAdd.add(group3);
        groupToAdd.add(group4);

        for (int i=0;i<4;i++){
            Group temp = (Group) groupToAdd.get(i);
            System.out.println(temp.getId()+" "+temp.getGroupsname());
        }
    }

    public static void main(String[] args){
        GroupTest groupTest = new GroupTest();
        groupTest.groupAdd();
    }
}