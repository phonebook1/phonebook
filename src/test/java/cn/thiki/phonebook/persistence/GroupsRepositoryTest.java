package cn.thiki.phonebook.persistence;

import org.junit.Test;

/**
 * Created by Administrator on 2015/9/26.
 */
public class GroupsRepositoryTest {
    @Test
    public void 获取分组列表(){
        GroupsRepository groupsRepository = new GroupsRepository();
        System.out.println(groupsRepository.loaderGroups());
    }
}