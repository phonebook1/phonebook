package cn.thiki.phonebook.persistence;

import cn.thiki.phonebook.util.DBUtil;
import com.alibaba.fastjson.JSONObject;

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
        String sql = "select name,phoneNumber,groupId,groupName from persons join groups on pe" +
                "rsons.groupId=groups.id ORDER BY persons.id DESC;";
        return DBUtil.getListMapBySQL(sql);
    }

    public int addPerson(JSONObject person) {
        return DBUtil.insert("persons", person);
    }

    public int deletePerson(int id) throws Exception {
        int effectedRows = DBUtil.delete("persons", id);
        if (effectedRows == 0) {
            throw new Exception("删除未成功");
        }
        return effectedRows;
    }

    public int updatePerson(int id, JSONObject person) throws Exception {
        int effectedRows = DBUtil.update("persons", id, person);
        if (effectedRows == 0) {
            throw new Exception("更新失败");
        }
        return effectedRows;
    }
}
