package com.example.demo.service;

import com.google.common.collect.Lists;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CacheService {

    private List<String> dbData = Lists.newArrayList("1", "2", "3");

    @Cacheable(cacheNames = "test", key = "#key", sync = true)
    public List<String> testCacheGet(String key) {
        if (key.equals("1")) {
            return dbData;
        }
        return null;
    }

    @CacheEvict(cacheNames = "test", key = "#key")
    public void testCacheAdd(String key) {
        if (key.equals("1")) {
            dbData.add("4");
        }
    }

}
