package com.geekster.urlhitcounter.controller;

import com.geekster.urlhitcounter.model.Visit;
import com.geekster.urlhitcounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    public UrlHitService urlHitService;

    public UrlHitController(UrlHitService urlHitService){
        this.urlHitService = urlHitService;
    }

    @GetMapping("username/{username}/count")
    public Visit getHitCount(@PathVariable String username) {
        Visit visit = urlHitService.getVisits(username);
        return visit;
    }
}
