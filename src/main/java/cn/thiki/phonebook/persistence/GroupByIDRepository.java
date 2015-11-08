package cn.thiki.phonebook.persistence;

import cn.thiki.phonebook.util.DBUtil;

import java.util.Map;

/**
 * Created by Administrator on 2015/10/29.
 */
public class GroupByIDRepository {
    public Map<String, Object> loadGroup(int id) {
        String sql = "select * from groups where id="+id;
        return DBUtil.getMapBySQL(sql);
    }
}
