package cn.thiki.phonebook.persistence;

import cn.thiki.phonebook.util.DBUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/10/8.
 */
public class GroupPersonsRepository {
    public List<Map<String, Object>> loadPersons(int groupId) {
        String sql = "select name,phoneNumber,groupId,groupName from persons join groups on persons.groupId=groups.id" +
                " where persons.groupId =" + groupId;
        return DBUtil.getListMapBySQL(sql);
    }
}