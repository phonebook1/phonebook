package cn.thiki.phonebook.service;

import cn.thiki.phonebook.domain.Groups;
import cn.thiki.phonebook.util.JSONResult;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/21.
 */
@Controller
@RequestMapping("/")
public class GroupsService {
    private Groups groups = new Groups();

    @ResponseBody
    @RequestMapping(value = "/groups" ,method = RequestMethod.GET)
    public Object loaderGroups(){
        List<Map<String,Object>> groupsList = groups.loaderGroups();
        return JSONResult.response("groups", groupsList);
    }

    @ResponseBody
    @RequestMapping(value = "/groups" , method = RequestMethod.POST)
    public Object addGroup(@RequestBody JSONObject group){
        groups.addGroup(group);
        return JSONResult.success();
    }

    @ResponseBody
    @RequestMapping(value = "/groups/{id}",method = RequestMethod.DELETE)
    public Object deleteGroup(@PathVariable int id) throws Exception {
        groups.deleteGroup(id);
        return JSONResult.success();
    }

    @ResponseBody
    @RequestMapping(value = "/groups/{id}",method = RequestMethod.PUT)
    public Object updateGroup(@PathVariable int id ,@RequestBody JSONObject group) throws Exception {
        groups.updateGroup(id ,group);
        return JSONResult.success();
    }
}
