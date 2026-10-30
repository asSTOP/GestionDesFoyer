package tn.esprim.GestionDesFoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprim.GestionDesFoyer.entities.Chambre;
import tn.esprim.GestionDesFoyer.services.IChambreService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {

    private final IChambreService chambreService;

    @GetMapping("/retrieve-all")
    public List<Chambre> getAll() {
        return chambreService.retrieveAllChambres();
    }

    @GetMapping("/retrieve/{id}")
    public Chambre get(@PathVariable Long id) {
        return chambreService.retrieveChambre(id);
    }

    @PostMapping("/add")
    public Chambre add(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @PutMapping("/update")
    public Chambre update(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable Long id) {
        chambreService.removeChambre(id);
    }
}