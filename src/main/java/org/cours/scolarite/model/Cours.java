package org.cours.scolarite.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;

    @ManyToOne // Each Cours belongs to one Module
    @JoinColumn(name = "module_id", nullable = false) // Foreign key to module
    private Module module;  // Fix the relationship mapping
}
