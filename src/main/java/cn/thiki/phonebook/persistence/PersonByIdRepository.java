package cn.thiki.phonebook.persistence;

import cn.thiki.phonebook.util.DBUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/10/19.
 */
public class PersonByIdRepository {
    public List<Map<String, Object>> loadPerson(int id) {
        String sql = "select * from persons where id="+id;
        return DBUtil.getListMapBySQL(sql);
    }
}
