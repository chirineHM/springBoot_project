package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springent.Universite;

public interface Universiterepository extends JpaRepository<Universite, Long> {
}
