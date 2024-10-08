package org.cours.scolarite.repository;

import org.cours.scolarite.model.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours, Integer> {

    List<Cours> findByModuleId(Integer moduleId);

}
