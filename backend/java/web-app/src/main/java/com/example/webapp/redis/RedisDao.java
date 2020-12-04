package com.example.webapp.redis;

import org.springframework.stereotype.Service;

import cn.hutool.db.nosql.redis.RedisDS;
import cn.hutool.setting.Setting;

@Service
public class RedisDao {
    public String getByAudioList(){
        RedisDS.create().setStr("something", "good");
        return null;
    }
}
