package cn.watson.rent.web;

import cn.watson.rent.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("test")
@Slf4j
public class Test {
    //    @Resource
//    User user;
    @Resource
    private UserService userService;
//    @Resource
//    private JedisSentinelPool jedisSentinelPool;
//    private JedisPool jedisPool;

    @GetMapping("/say")
    public void say() {
//        userService.insert();
//        user.say();
//        Jedis jedis = jedisPool.getResource();

//        Jedis jedis=jedisSentinelPool.getResource();
//        if (jedis == null)
//            System.out.println("null===========");
//
//        String s = jedis.get("a");
//        System.out.println(s);

        for (int i = 0; i < 1; i++) {
//            log.error("test================");
            System.out.println("dfsdfsd");
        }
    }

    @GetMapping("/test1")
    public ModelMap test() {
        System.out.println("test");
        return new ModelMap();
    }


    @PostMapping("/learn")
    public String learn(@RequestBody String name) {
        System.out.println(name);
        return name + "========";
    }


}
