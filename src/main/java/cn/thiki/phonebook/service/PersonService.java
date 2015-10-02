package cn.thiki.phonebook.service;

import cn.thiki.phonebook.domain.Person;
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
public class PersonService {
    private Person person = new Person();

    @ResponseBody
    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Object loaderPerson() {
        List<Map<String, Object>> personList = person.loaderPerson();
        return JSONResult.response("persons", personList);
    }
}
