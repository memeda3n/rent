package cn.watson.rent.web;

import cn.watson.rent.common.User;
import cn.watson.rent.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Test {
    @Resource
    User user;
    @Resource
    private UserService userService;

    @GetMapping("/say")
    public void say() {
        userService.insert();
        user.say();
    }
}
