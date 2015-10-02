package cn.thiki.phonebook.service;

import cn.thiki.phonebook.domain.Group;
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
@RequestMapping
public class GroupService {
    private Group group = new Group();

    @ResponseBody
    @RequestMapping(value="/group",method = RequestMethod.GET)
    public Object loaderGroup(){
        List<Map<String,Object>> groupList = group.loaderGroup();
        return JSONResult.response("groups",groupList);
    }
}
