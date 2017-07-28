package com.bwei.songzhen.controller;

import com.bwei.songzhen.entity.User;
import com.bwei.songzhen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by songzhen on 2017/7/28.
 */
@Controller
public class UserController {
    @Autowired
    DiscoveryClient discoveryClient;
    @Autowired
    private UserService userService;
    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
    @RequestMapping("/index")
    private String index(){
       return "index";
    }
    @RequestMapping("/addUser.do")
    public String addUser(User user){
        userService.addUser(user);
        return "login";
    }
    @RequestMapping("/loginUser")
    private String login(User user, HttpSession session){
        User user1 = userService.loginUser(user);
        session.setAttribute("user",user1);
        return "redirect:selectU";
    }
    @RequestMapping("/selectU")
    public String selectUser(Model model){
        List<User> users = userService.selectUser();
        model.addAttribute("users",users);
        return "information";
    }
    //通过id查询
    @RequestMapping("/selectU")
    public String selectUserId(int id,Model model){
        User user = userService.selectUserId(id);
        model.addAttribute("users",user);
        return "update";
    }
    @RequestMapping
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:selectU";
    }
}
