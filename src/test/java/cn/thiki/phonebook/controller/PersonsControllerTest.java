package cn.thiki.phonebook.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * Created by �� on 2015/9/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class PersonsControllerTest {
    public static final String URL = "/persons";
    public static final String QUERY_BY_KEYWORD_URL = "/persons?keyword=小";
    private MockMvc mockMvc;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    protected WebApplicationContext wac;

    @Before
    public void setup() {
        this.mockMvc = webAppContextSetup(this.wac).build();
    }

    @Test
    public void 获取联系人列表() throws Exception {
        mockMvc.perform(get(URL))
                .andExpect(status().isOk())
        ;
    }

    @Test
    public void 新增联系人() throws Exception {
        String json = "{\"name\":\"王五\",\"phoneNumber\":\"13800000001\",\"groupId\":\"4\"}";
        mockMvc.perform(post(URL, "json").characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json.getBytes()))
                .andExpect(status().isOk());
    }

    @Test
    public void 删除联系人() throws Exception {
        mockMvc.perform(delete("/persons/10"))
                .andExpect(status().isOk());
    }

    @Test
 public void 根据ID更新联系人() throws Exception {
    String person = "{\"name\":\"李六\",\"phoneNumber\":\"13600000001\"}";
    mockMvc.perform(put("/persons/16").characterEncoding("UTF-8")
            .contentType(MediaType.APPLICATION_JSON)
            .content(person))
            .andExpect(status().isOk());
}

    @Test
    public  void 根据关键字查询联系人() throws Exception {
        mockMvc.perform(get(QUERY_BY_KEYWORD_URL))
                .andExpect(status().isOk())
        ;
    }

}