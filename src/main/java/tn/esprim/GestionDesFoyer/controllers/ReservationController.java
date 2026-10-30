package tn.esprim.GestionDesFoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprim.GestionDesFoyer.entities.Reservation;
import tn.esprim.GestionDesFoyer.services.IReservationService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    private final IReservationService reservationService;

    @GetMapping("/retrieve-all")
    public List<Reservation> getAll() {
        return reservationService.retrieveAllReservations();
    }

    @GetMapping("/retrieve/{id}")
    public Reservation get(@PathVariable String id) {
        return reservationService.retrieveReservation(id);
    }

    @PostMapping("/add")
    public Reservation add(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @PutMapping("/update")
    public Reservation update(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable String id) {
        reservationService.removeReservation(id);
    }
}