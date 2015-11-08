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
 * Created by Administrator on 2015/10/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class GroupsControllerTest {
    public static String URL = "/groups";
    private MockMvc mockMvc;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    protected WebApplicationContext wac;

    @Before
    public void setup() {
        this.mockMvc = webAppContextSetup(this.wac).build();
    }

    @Test
    public void 获取分组列表() throws Exception {
        mockMvc.perform(get(URL))
                .andExpect(status().isOk())
        ;
    }

    @Test
    public void 新增分组() throws Exception {
        String json = "{\"groupName\":\"学生\"}";
        mockMvc.perform(post(URL, "json").characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json.getBytes()))
                .andExpect(status().isOk());
    }

    @Test
    public void 删除分组() throws Exception {
        mockMvc.perform(delete("/groups/1"))
                .andExpect(status().isOk());
    }

    @Test
    public void 根据ID更新分组() throws Exception {
        String group = "{\"groupName\":\"老师\"}";
        mockMvc.perform(put("/groups/5").characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON)
                .content(group))
                .andExpect(status().isOk());
    }

}