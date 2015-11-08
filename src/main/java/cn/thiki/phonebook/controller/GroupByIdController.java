package cn.thiki.phonebook.controller;

import cn.thiki.phonebook.domain.GroupById;
import cn.thiki.phonebook.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Administrator on 2015/10/29.
 */
@Controller
@RequestMapping("/")
public class GroupByIdController {
    private GroupById groupById = new GroupById();

    @ResponseBody
    @RequestMapping(value = "/groups/{id}",method = RequestMethod.GET)
    public Object loadGroup(@PathVariable int id){
        Map<String,Object> group = groupById.loadGroup(id);
        return JSONResult.response("group",group);
    }

}
