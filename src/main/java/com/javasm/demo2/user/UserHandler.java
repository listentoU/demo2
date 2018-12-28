package com.javasm.demo2.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    IUserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        //ctrl+F9,debug运行时修改后不用重启，用此快捷键
        return "hello !!!";
    }

    @RequestMapping("/list")
    public String listPage(HttpServletRequest request){
        request.setAttribute("username","admin");
        //底层加了视图解析器，前面/templates/,后面.html
        request.setAttribute("user",new UserModel("zhangsan",13));
        List<UserModel>list=userService.selectUser();
        request.setAttribute("userlist",list);
        return "user/list";
    }
}
