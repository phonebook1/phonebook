package cn.thiki.phonebook.persistence;

import cn.thiki.phonebook.util.DBUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/20.
 */
public class PersonsRepository {

    /**
     * 建立获取数据的方法
     */
    public List<Map<String, Object>> loadPersons() {
        String sql = "select * from persons ORDER BY id DESC";
        return DBUtil.getListMapBySQL(sql);
    }
}
