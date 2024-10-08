package org.cours.scolarite.controller;


import java.util.List;
import java.util.Optional;

import org.cours.scolarite.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.cours.scolarite.model.Module;
@RestController
public class ModuleController {
    @Autowired
    private ModuleService moduleService;
    @RequestMapping("/modules")
    public List<Module> getModules(){
        return moduleService.getAllModules();

    }
    @RequestMapping("/modules/{id}")
    public Optional<Module> getModule(@PathVariable Integer id){
        return moduleService.getModule(id);

    }

    @RequestMapping(method=RequestMethod.POST, value="/modules")
    public void ajouterModule(@RequestBody Module module) {
        moduleService.ajouterModule(module);

    }

    @RequestMapping(method=RequestMethod.PUT, value="/modules/{id}")
    public void modiﬁerModule(@RequestBody Module module, @PathVariable Integer id) {
        moduleService.modiﬁerModule(id, module);

    }

    @RequestMapping(method=RequestMethod.DELETE, value="/modules/{id}")
    public void supprimerModule(@PathVariable Integer id) {
        moduleService.supprimerModule(id);

    }

}