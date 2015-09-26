package cn.thiki.phonebook.service;

import cn.thiki.phonebook.domain.Groups;
import cn.thiki.phonebook.util.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
