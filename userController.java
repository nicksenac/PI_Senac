package com.atividadePI.PI7_8.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import.org.springframework.web.bind.annotation.RestController;
import.java.util.List;
import com.devsuperior.userdept.entities.usuario;
import com.devsuperior.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMopping(value = "/users" )
public class userController {
    
    @Autowired
    private UserRepository repository;
    
    @GetMapping
    public List<usuario> findAll(){
        List <usuario> result = repository.findAll();
        return result;
    }
    
    @GetMapping(value = "/{Id}")
    public <usuario> findId(@PathVariable Long Id){
        User <usuario> result = repository.findById(Id).get();
        return result;
    }
    
    @PostMapping
    public <usuario> insert(@RequestBody usuario user){
        User <usuario> result = repository.save(user);
        return result;
    }
}
