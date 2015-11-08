package cn.thiki.phonebook.domain;

import cn.thiki.phonebook.persistence.GroupByIDRepository;

import java.util.Map;

/**
 * Created by Administrator on 2015/10/29.
 */
public class GroupById {
    private GroupByIDRepository groupByIDRepository = new GroupByIDRepository();

    public GroupById(){
        this.groupByIDRepository = new GroupByIDRepository();
    }

    public Map<String, Object> loadGroup(int id) {
        return groupByIDRepository.loadGroup(id);
    }
}
