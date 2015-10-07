package cn.thiki.phonebook.persistence;

import cn.thiki.phonebook.util.DBUtil;
import com.alibaba.fastjson.JSONObject;

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

    public int addGroup(JSONObject group) {
        return DBUtil.insert("groups", group);
    }

    public int deleteGroup(int id) throws Exception {
        int effectedRows = DBUtil.delete("groups",id);
        if (effectedRows == 0){
            throw new Exception("删除失败");
        }
        return effectedRows;
    }

    public int updateGroup(int id, JSONObject group) throws Exception {
        int effectedRows = DBUtil.update("groups",id,group);
        if (effectedRows==0){
            throw new Exception("更新失败");
        }
        return effectedRows;
    }
}
