package com.example.demo;

import com.example.models.Taco;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alsorc
 */
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api")
public class ControllerTacos {
    
    @Autowired
    private IRepoTaco repoTaco;
  
    @GetMapping(path="/tacos")
    public List<Taco> getTacos(){
        return repoTaco.findAll();
    }
    
    @GetMapping(path="/tacos/{id}")
    public Taco getTacosById(@PathVariable Long id){
        Optional<Taco> per = repoTaco.findById(id);
        return per.get();
    }
    
    @PostMapping(path="/tacos")
    public void insertTaco(@RequestBody Taco taco){
        repoTaco.save(taco);
    }
    
    @PutMapping(path="/tacos")
    public void updateTacos(@RequestBody Taco taco){
        repoTaco.save(taco);
    }
    
    @DeleteMapping(value = "/tacos/{id}")
    public void deleteTaco(@PathVariable("id") Long id){
        repoTaco.deleteById(id);
    }
    
}
