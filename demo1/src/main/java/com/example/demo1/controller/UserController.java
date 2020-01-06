package com.example.demo1.controller;


import com.example.demo1.entity.User;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{username}")
    public User GetUser(@PathVariable String username){
        User user=userService.Sel(username);
        //String str=user.getId()+"--"+user.getUsername()+"--"+user.getRealname()+"--"+user.getSeclevel();
        return user;
    }
}
