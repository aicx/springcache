package com.example.demo.controller;

import com.example.demo.model.Result;
import com.example.demo.service.CacheService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TestController {
    private final CacheService cacheService;

    @PostMapping("/add/{key}")
    public Result testCacheGet(@PathVariable("key") String key) {
        return Result.success(cacheService.testCacheGet(key));
    }

    @PostMapping("/get/{key}")
    public Result testCacheAdd(@PathVariable("key") String key) {
        cacheService.testCacheAdd(key);
        return Result.success();
    }
}
