package com.hxin.controller;

import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author Hxin
 * @describe
 * @since 2018/6/14 上午11:26
 */
public class BaseController {
    public static void responseJson(HttpServletResponse response, Map<String,Object> data) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().write(JSONObject.fromObject(data).toString());
    }
}
