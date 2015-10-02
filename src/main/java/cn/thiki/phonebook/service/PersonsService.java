package cn.thiki.phonebook.service;

import cn.thiki.phonebook.domain.Persons;
import cn.thiki.phonebook.util.JSONResult;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by �� on 2015/9/20.
 */
@Controller
@RequestMapping("/")
public class PersonsService {
    private Persons persons = new Persons();

    @ResponseBody
    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public Object loadPersons() {
        List<Map<String, Object>> personsList = persons.loadPersons();
        return JSONResult.response("persons", personsList);
    }

    @ResponseBody
    @RequestMapping(value = "/persons", method = RequestMethod.POST)
    public Object addPerson(@RequestBody JSONObject person) {
        persons.addPerson(person);
        return JSONResult.success();
    }
}
