package com.mflyyou.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class DemoController {
    private final UserMapper userMapper;

    @GetMapping("/hello-world")
    public Map<String, String> helloWorld() {
        Map<String, String> res = new HashMap<>();
        res.put("aa", "bb");
        return res;
    }

    @GetMapping("/demo/{id}")
    public User demo(@PathVariable Long id) {
        return userMapper.selectById(id);
    }

    @PostMapping("/demo")
    public Long demo(@RequestBody User user) {
        userMapper.insert(user);
        return user.getId();
    }

}
