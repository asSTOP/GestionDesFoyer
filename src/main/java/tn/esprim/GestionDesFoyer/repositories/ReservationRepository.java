package tn.esprim.GestionDesFoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.GestionDesFoyer.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {
}