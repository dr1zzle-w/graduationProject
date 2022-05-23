package wangkai.graduationProject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class userTest {
    @Controller
    public class usertest {
        @RequestMapping(value = "/hello")
        public String hello(){
            return "index";
        }
    }
}
