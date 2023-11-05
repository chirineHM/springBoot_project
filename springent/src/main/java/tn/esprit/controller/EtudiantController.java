package tn.esprit.controller;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.services.Etudiantservice;
import tn.esprit.springent.Etudiant;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/Etudiant")
@CrossOrigin("*")
public class EtudiantController {
    Etudiantservice etudiantservice;
    @GetMapping("/all")
    public List<Etudiant> getAll() {
        return etudiantservice.retrieveAllEtudiants();
    }
    @GetMapping("/{id}")
    public Etudiant getEtudiantById(@PathVariable Long id){
        return etudiantservice.retrieveEtudiant(id);
    }

    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantservice.addEtudiant(e);
    }
    @PutMapping("/update")
    public Etudiant updateEtudiant( @RequestBody Etudiant  etudiant){
        return etudiantservice.updateEtudiant(etudiant);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteetudiant(@PathVariable Long id){
        etudiantservice.removeEtudiant(id);

    }
    @PostMapping("/addall")
    public List<Etudiant> addEtudiants(@RequestBody List<Etudiant> etudiants) {
        return etudiantservice.addEtudiants(etudiants);
    }

}