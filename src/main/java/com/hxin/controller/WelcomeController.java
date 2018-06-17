package com.hxin.controller;

import com.hxin.business.UserBusiness;
import com.hxin.entity.BO.UserBo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Hxin
 * @since 2018/5/20 下午1:49
 */
@Controller
@RequestMapping("/welcome")
public class WelcomeController extends BaseController {
    @Resource
    private UserBusiness userBusiness;

    @RequestMapping("/loginpage")
    public ModelAndView loginPage(HttpServletResponse response, HttpServletRequest request) {
        return new ModelAndView("start/Login");
    }

    @RequestMapping("/login")
    public void login(HttpServletResponse response, HttpServletRequest request) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserBo userBo = userBusiness.userLogin(username);
        Map<String, Object> map = new HashMap<>();
        if (userBo == null || !userBo.getPassword().equals(password)) {
            map.put("status", 0);
            responseJson(response, map);
        } else if (userBo.getPassword().equals(password)) {
            map.put("status", 1);
            responseJson(response, map);
        }
    }

    @RequestMapping("/registerpage")
    public ModelAndView registerPager() {
        return new ModelAndView("start/Register");
    }

    @RequestMapping("/register")
    public void Register(HttpServletResponse response, HttpServletRequest request, UserBo userBo) throws IOException {
        boolean b = userBusiness.userRegister(userBo);
        Map<String, Object> data = new HashMap<>();
        if (b) {
            data.put("status", 1);
            responseJson(response, data);
        } else {
            data.put("status", 0);
            responseJson(response, data);
        }

    }

    @RequestMapping("/firstPage")
    public ModelAndView firstPage() {
        return new ModelAndView("mainPage/firstPage");
    }
}
