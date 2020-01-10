package com.blingcavalry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigClientController {

    @Value("${profile}")
    // 名称必须跟git仓库的匹配
    private String profile;

    @GetMapping("/profile")
    public ResponseEntity<String> getConfigProfile(){
        String str = this.profile;
        return ResponseEntity.ok(str);
    }
}
