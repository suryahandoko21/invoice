package com.api.invoice.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class MainController {
    @Autowired
    @GetMapping("/")
    public ResponseEntity<Object>  home(){
        Map<String, Object> response = new HashMap<>();
        response.put("APP_NAME", "Spring boot APP Invoice"); 
        return ResponseEntity.ok(response);
    }
}
