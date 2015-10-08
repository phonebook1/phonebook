package cn.thiki.phonebook.util;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by Administrator on 2015/9/23.
 */
public class JSONResult {

    public static JSONObject response(final String key, final List data) {
        return new JSONObject() {{
            put("code", "0000");
            put("message", "响应成功");
            put(key, data);
        }};
    }

    public static Object success() {
        return new JSONObject() {{
            put("code", "0000");
            put("message", "响应成功");
        }};
    }
}
