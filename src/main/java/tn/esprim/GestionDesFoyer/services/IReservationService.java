package tn.esprim.GestionDesFoyer.services;

import tn.esprim.GestionDesFoyer.entities.Reservation;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservations();
    Reservation retrieveReservation(String id);
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void removeReservation(String id);
}