package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springent.Etudiant;


@Repository
public interface Etudiantrepository extends JpaRepository<Etudiant, Long>{
}
