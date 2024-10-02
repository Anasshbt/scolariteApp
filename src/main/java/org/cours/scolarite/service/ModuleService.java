package org.cours.scolarite.service;

import org.cours.scolarite.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.cours.scolarite.model.Module;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    // Retrieve all modules from the repository
    public List<Module> getAllModules() {
        return (List<Module>) moduleRepository.findAll();
    }

    // Add a new module to the repository
    public void ajouterModule(Module module) {
        moduleRepository.save(module);
    }

    // Get a module by its ID
    public Module getModule(Integer id) {
        Optional<Module> module = moduleRepository.findById(id);
        return module.orElse(null);
    }

    // Update an existing module
    public void modifierModule(Integer id, Module module) {
        if (moduleRepository.existsById(id)) {
            moduleRepository.save(module);  // `save` will update if the module already exists
        }
    }

    // Delete a module by its ID
    public void supprimerModule(Integer id) {
        moduleRepository.deleteById(id);
    }
}
