package cn.thiki.phonebook.persistence;

import cn.thiki.phonebook.util.DBUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/21.
 */
public class GroupRepository {
    public List<Map<String,Object>> loaderGroup(){
        String sql = "SELECT * FROM groups WHERE id = 1";
        return DBUtil.getListMapBySQL(sql);
    }
}
