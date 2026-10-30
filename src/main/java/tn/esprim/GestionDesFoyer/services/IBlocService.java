package tn.esprim.GestionDesFoyer.services;

import tn.esprim.GestionDesFoyer.entities.Bloc;
import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveAllBlocs();
    Bloc retrieveBloc(Long id);
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    void removeBloc(Long id);
}