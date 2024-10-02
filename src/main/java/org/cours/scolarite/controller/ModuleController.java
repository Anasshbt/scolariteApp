package org.cours.scolarite.controller;

import org.cours.scolarite.model.Module;
import org.cours.scolarite.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ModuleController {

    @Autowired

    private ModuleService moduleService;

    @RequestMapping("/modules")

    public List<Module> getModules() {

        return moduleService.getAllModules();
    }

    @RequestMapping("/modules/{id}")

    public Module getModule(@PathVariable Integer id){

        return moduleService.getModule(id);

    }

    @RequestMapping(method= RequestMethod.POST, value="/modules")
    public void ajouterModule(@RequestBody Module module) {
        moduleService.ajouterModule(module);
    }
    @RequestMapping(method=RequestMethod.PUT, value="/modules/{id}")
    public void modifierModule(@RequestBody Module module, @PathVariable Integer id) {
        moduleService.modifierModule(id, module);
    }
    @RequestMapping(method=RequestMethod.DELETE, value="/modules/{id}")
    public void supprimerModule(@PathVariable Integer id) {
        moduleService.supprimerModule(id);
    }

}
