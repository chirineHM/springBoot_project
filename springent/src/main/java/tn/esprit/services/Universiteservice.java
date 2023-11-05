package tn.esprit.services;

import tn.esprit.springent.Universite;

import java.util.List;

public interface Universiteservice {
    List<Universite> retrieveAllUniversities();
    Universite addUniversity (Universite u);
    Universite updateUniversity (Universite u);
    Universite retrieveUniversity (long iduni);
    void removeUniversity  (long iduni );
}
