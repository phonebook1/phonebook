package cn.thiki.phonebook.persistence;

import org.junit.Test;

/**
 * Created by Administrator on 2015/9/29.
 */
public class GroupRepositoryTest {
    @Test
    public void 获取分组信息(){
        GroupRepository groupRepository = new GroupRepository();
        System.out.println(groupRepository.loaderGroup());
    }
}