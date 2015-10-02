package cn.thiki.phonebook.domain;

import cn.thiki.phonebook.persistence.GroupRepository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/5.
 */
public class Group {
    private GroupRepository groupRepository;

    public Group(){
        this.groupRepository = groupRepository;
    }

    public GroupRepository getGroupRepository(){
        return groupRepository;
    }

    public List<Map<String, Object>> loaderGroup(){
        return groupRepository.loaderGroup();
    }
}
