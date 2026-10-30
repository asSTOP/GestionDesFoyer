package tn.esprim.GestionDesFoyer.services;

import tn.esprim.GestionDesFoyer.entities.Chambre;
import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre retrieveChambre(Long id);
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void removeChambre(Long id);
}