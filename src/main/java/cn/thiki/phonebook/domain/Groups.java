package cn.thiki.phonebook.domain;

import cn.thiki.phonebook.persistence.GroupsRepository;
import com.alibaba.fastjson.JSONObject;

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

    public List<Map<String, Object>> loaderGroups(){
        return groupsRepository.loaderGroups();
    }

    public void addGroup(JSONObject group) {
        groupsRepository.addGroup(group);
    }

    public void deleteGroup(int id) throws Exception {
        groupsRepository.deleteGroup(id);
    }

    public void updateGroup(int id, JSONObject group) throws Exception {
        groupsRepository.updateGroup(id,group);
    }


}