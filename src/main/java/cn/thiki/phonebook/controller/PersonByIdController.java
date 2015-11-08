package cn.thiki.phonebook.controller;

import cn.thiki.phonebook.domain.PersonById;
import cn.thiki.phonebook.util.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Administrator on 2015/10/19.
 */
@Controller
@RequestMapping("/")
public class PersonByIdController {
    private PersonById personById = new PersonById();

    @ResponseBody
    @RequestMapping(value = "/persons/{id}",method = RequestMethod.GET)
    public Object loadPerson(@PathVariable int id){
        Map<String,Object> person = personById.loadPerson(id);
        return JSONResult.response("person", person);
    }
}
