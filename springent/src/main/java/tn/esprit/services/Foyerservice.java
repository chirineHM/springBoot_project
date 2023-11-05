package tn.esprit.services;

import tn.esprit.springent.Foyer;

import java.util.List;

public interface Foyerservice {
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer (Foyer f);
    Foyer updateFoyer (Foyer f);
    Foyer retrieveFoyer (long idfoyer);
    void archiverFoyer (long idfoyer);  // Ajoutez un attribut boolean archived dans l'entité Foyer, par défault false et le modifier à true suite à l'exécution de ce service
}

