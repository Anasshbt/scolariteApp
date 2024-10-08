package org.cours.scolarite.service;

import org.cours.scolarite.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.cours.scolarite.model.Module;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    public List<Module> getAllModules() {
        List<Module> modules=new ArrayList<>();
        moduleRepository.findAll().forEach(modules::add);
        return modules;

    }

    public Optional<Module> getModule(Integer id) {
        return moduleRepository.findById(id);

    }

    public void ajouterModule(Module module) {
        moduleRepository.save(module);

    }

    public void modiﬁerModule(Integer id, Module module) {
        moduleRepository.save(module);

    }

    public void supprimerModule(Integer id) {
        moduleRepository.deleteById(id);

    }

}