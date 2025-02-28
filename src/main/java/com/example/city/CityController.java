package com.example.city;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my" )
public class CityController {
    @GetMapping("hello")
    public ResponseEntity<String> hello (){
        return ResponseEntity.ok("<b>hello</b>");
    }
}
