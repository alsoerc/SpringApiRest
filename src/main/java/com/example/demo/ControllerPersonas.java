package com.example.demo;


import com.example.models.ModelPersona;
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
public class ControllerPersonas {
    
    @Autowired
    private IRepoPersona repoPersona;
    
    @GetMapping(path="/personas")
    public List<ModelPersona> getPersonas(){
        return repoPersona.findAll();
    }
    
    @GetMapping(path="/personas/{id}")
    public ModelPersona getPersonaById(@PathVariable String id){
        Optional<ModelPersona> per = repoPersona.findById(id);
        return per.get();
    }
    
    @PostMapping(path="/personas")
    public void insertPersona(@RequestBody ModelPersona persona){
        repoPersona.save(persona);
    }
    
    @PutMapping(path="/personas")
    public void updatePersona(@RequestBody ModelPersona persona){
        repoPersona.save(persona);
    }
    
    @DeleteMapping(value = "/personas/{id}")
    public void deletePersona(@PathVariable("id") String id){
        repoPersona.deleteById(id);
    }
    

    
}
