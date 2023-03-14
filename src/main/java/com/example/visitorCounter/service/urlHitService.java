package com.example.visitorCounter.service;

import com.example.visitorCounter.model.Visit;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class urlHitService {
    static Map<String,Integer> map = new HashMap<>();
    public Visit getVisit(String username){
        int count = map.getOrDefault(username,0)+1;
        map.put(username,count);

        Visit visit = new Visit(username,count);
        return visit;
    }
}
