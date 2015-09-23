package cn.thiki.phonebook.service;

import cn.thiki.phonebook.domain.Persons;
import cn.thiki.phonebook.util.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by ù˝ on 2015/9/20.
 */
@Controller
@RequestMapping("/")
public class PersonsService {
    private Persons persons = new Persons();

    @ResponseBody
    @RequestMapping(value = "/persons",method = RequestMethod.GET)
    public Object loadPersons() {
        List<Map<String, Object>> personsList = persons.loadPersons();
        return JSONResult.response("persons", personsList);
    }
}
