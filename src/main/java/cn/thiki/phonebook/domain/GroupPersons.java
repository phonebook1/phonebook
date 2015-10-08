package cn.thiki.phonebook.domain;

import cn.thiki.phonebook.persistence.GroupPersonsRepository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/10/8.
 */
public class GroupPersons {
    private GroupPersonsRepository groupPersonsRepository;
    public GroupPersons(){
        this.groupPersonsRepository = new GroupPersonsRepository();
    }

    public List<Map<String, Object>> loadPersons(int groupId) {
        return groupPersonsRepository.loadPersons(groupId);
    }
}
