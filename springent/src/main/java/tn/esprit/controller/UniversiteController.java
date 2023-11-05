package tn.esprit.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.services.Universiteservice;
import tn.esprit.springent.Universite;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/universite")
@CrossOrigin("*")
public class UniversiteController {
    Universiteservice universiteservice;

    @GetMapping("/all")
    @JsonIgnore
    public List<Universite> getAll() {
        return universiteservice.retrieveAllUniversities();
    }

    @GetMapping("/{id}")
    public Universite getUniversiteById(@PathVariable Long id) {
        return universiteservice.retrieveUniversity(id);
    }

    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite e) {
        return universiteservice.addUniversity(e);
    }

    @PutMapping("/update")
    public Universite updateUniversite(@RequestBody Universite Universite) {
        return universiteservice.updateUniversity(Universite);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUniversite(@PathVariable Long id) {
        universiteservice.removeUniversity(id);

    }
}