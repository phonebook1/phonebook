package cn.thiki.phonebook.controller;

import cn.thiki.phonebook.domain.GroupPersons;
import cn.thiki.phonebook.util.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/10/8.
 */
@Controller
@RequestMapping("/")
public class GroupPersonsController {
    private GroupPersons groupPersons = new GroupPersons();

    @ResponseBody
    @RequestMapping(value = "/groups/{groupId}/persons", method = RequestMethod.GET)
    public Object loaderPersons(@PathVariable int groupId){
        List<Map<String,Object>> personsList = groupPersons.loadPersons(groupId);
        return JSONResult.response("persons",personsList);
    }
}
