package com.deploy.deploy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    Repo repo;


    @GetMapping("/hello")
    @CrossOrigin(origins = "*")
    public String getHello(){
        Optional<Data> data = repo.findById(1);
        if(data.isPresent()){
            Data datas =  new Data();
            datas = data.get();
            return datas.getName();
        }
        else{
            return "No name";
        }
    }
}
