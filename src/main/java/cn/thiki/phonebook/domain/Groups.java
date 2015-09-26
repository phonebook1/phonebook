package cn.thiki.phonebook.domain;

import cn.thiki.phonebook.persistence.GroupsRepository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/5.
 */
public class Groups {
    private GroupsRepository groupsRepository;

    public Groups(){
        this.groupsRepository = new GroupsRepository();
    }

    public GroupsRepository getGroupsRepository(){
        return groupsRepository;
    }

    public List<Map<String, Object>> loaderGroups(){
        return groupsRepository.loaderGroups();
    }
}
