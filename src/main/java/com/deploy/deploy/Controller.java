package com.deploy.deploy;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/hello")
    @CrossOrigin(origins = "*")
    public String getHello(){
        return "Hello Team trust me its working";
    }
}
