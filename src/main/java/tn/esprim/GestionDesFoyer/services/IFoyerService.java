package tn.esprim.GestionDesFoyer.services;

import tn.esprim.GestionDesFoyer.entities.Foyer;
import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();
    Foyer retrieveFoyer(Long id);
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    void removeFoyer(Long id);
}