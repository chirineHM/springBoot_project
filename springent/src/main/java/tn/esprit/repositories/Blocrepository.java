package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springent.Bloc;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface Blocrepository  extends JpaRepository<Bloc, Long> {


    }
