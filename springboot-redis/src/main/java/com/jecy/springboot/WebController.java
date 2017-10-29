package com.jecy.springboot;

import com.jecy.springboot.redis.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    private RedisClient redisClient;
    @RequestMapping("/set")
    public String set(String key, String value) {
        redisClient.set(key,value);
        return "success";
    }
    @RequestMapping("/get")
    public String get(String key) throws Exception {
        return redisClient.get(key);
    }
}
