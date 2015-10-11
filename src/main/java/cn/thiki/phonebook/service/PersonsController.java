package cn.thiki.phonebook.service;

import cn.thiki.phonebook.domain.Persons;
import cn.thiki.phonebook.util.JSONResult;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by �� on 2015/9/20.
 */
@Controller
@RequestMapping("/")
public class PersonsController {
    private Persons persons = new Persons();

    @ResponseBody
    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public Object loadPersons(@RequestParam(value = "keyword", required = false) String keyword) {
        List<Map<String, Object>> personsList = persons.loadPersons(keyword);
        return JSONResult.response("persons", personsList);
    }

    @ResponseBody
    @RequestMapping(value = "/persons", method = RequestMethod.POST)
    public Object addPerson(@RequestBody JSONObject person) {
        persons.addPerson(person);
        return JSONResult.success();
    }

    @ResponseBody
    @RequestMapping(value = "/persons/{id}", method = RequestMethod.DELETE)
    public Object deletePerson(@PathVariable int id) throws Exception {
        persons.deletePerson(id);
        return JSONResult.success();
    }

    @ResponseBody
    @RequestMapping(value = "/persons/{id}", method = RequestMethod.PUT)
    public Object updatePerson(@PathVariable int id, @RequestBody JSONObject person) throws Exception {
        persons.updatePerson(id, person);
        return JSONResult.success();
    }
}
