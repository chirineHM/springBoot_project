package tn.esprit.controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.services.Foyerservice;
import tn.esprit.springent.Foyer;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/foyer")
@CrossOrigin("*")

public class FoyerController {
    Foyerservice foyerservice;
    @GetMapping("/all")
    public List<Foyer> getAll() {
        return foyerservice.retrieveAllFoyers();
    }
    @GetMapping("/{id}")
    public Foyer getFoyerById(@PathVariable Long id){
        return foyerservice.retrieveFoyer(id);
    }

    @PostMapping("/add")
    public Foyer addFoyer(@RequestBody Foyer e) {
        return foyerservice.addFoyer(e);
    }
    @PutMapping("/update")
    public Foyer updateFoyer( @RequestBody Foyer f){
        return foyerservice.updateFoyer(f);
    }
    @PutMapping("/SetArchiveTrue/{id}")
    public void ArchiveFoyer(@PathVariable Long id){
        foyerservice.archiverFoyer(id);

    }

}