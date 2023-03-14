package com.example.visitorCounter.controller;

import com.example.visitorCounter.model.Visit;
import com.example.visitorCounter.service.urlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitor-counter-app")
public class urlHitController {
    @Autowired
    private urlHitService hitService;

    @GetMapping("username/{username}/count")
    public Visit getCount(@PathVariable String username){
        Visit visit = hitService.getVisit(username);
        return visit;
    }
}
