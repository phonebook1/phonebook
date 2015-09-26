package cn.thiki.phonebook.persistence;

import cn.thiki.phonebook.util.DBUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/21.
 */
public class GroupsRepository {
    /**
     * 建立与数据库的方法
     */
    public List<Map<String,Object>> loaderGroups(){
        String sql = "SELECT * FROM groups ORDER BY id";
        return DBUtil.getListMapBySQL(sql);
    }
}
