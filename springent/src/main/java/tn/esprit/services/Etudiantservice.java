package tn.esprit.services;

import tn.esprit.springent.Etudiant;

import java.util.List;

public interface Etudiantservice {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Long idEtudiant);

    void removeEtudiant(Long idEtudiant);
    List<Etudiant> addEtudiants(List<Etudiant> etudiants);
}
