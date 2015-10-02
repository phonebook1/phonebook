package cn.thiki.phonebook.service;

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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * Created by �� on 2015/9/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class PersonsServiceTest {
    public static final String URL = "/persons";
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
                .andExpect(content().json("{\"code\":\"0000\",\"message\":\"响应成功\",\"persons\":[{\"name\":\"小明\",\"phoneNumber\":\"15050788711\",\"groupId\":1,\"groupName\":\"家人\"},{\"name\":\"小红\",\"phoneNumber\":\"15050788721\",\"groupId\":3,\"groupName\":\"同事\"}]}"))
        ;
    }
    @Test
    public void 新增联系人() throws Exception {
        String json="{\"name\":\"王五\",\"phoneNumber\":\"13800000001\",\"groupId\":\"1\"}";
        mockMvc.perform(post(URL, "json").characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json.getBytes()))
                .andExpect(status().isOk());
    }

}