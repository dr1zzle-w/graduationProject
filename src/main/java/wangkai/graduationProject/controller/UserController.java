package wangkai.graduationProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import wangkai.graduationProject.entity.User;
import wangkai.graduationProject.service.UserService;
import wangkai.graduationProject.service.impl.UserServiceImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.http.HttpRequest;
import java.util.List;

import static wangkai.graduationProject.util.MD5Util.getMD5;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService = new UserServiceImpl();


    @ResponseBody
    @RequestMapping(value = "reg", method = RequestMethod.POST)
    public String reg(@RequestParam("uName") String uName, @RequestParam("pwd") String pwd, @RequestParam("phone") String phone, String uid) {
        userService.insert(uName, getMD5(pwd), phone, uid);
        return "success";
    }

    @RequestMapping(value = "userLogin", method = RequestMethod.GET)
    public User userLogin(HttpServletRequest request, @RequestParam("uName") String uName, @RequestParam("pwd") String pwd) {
        User user = userService.userLogin(uName, getMD5(pwd));
        System.out.println(user.getPwd());
        HttpSession userSession = request.getSession();
        userSession.setAttribute("uid", user.getUid());
        System.out.println(user.getUid());
        return user;
    }

}
