package tn.esprim.GestionDesFoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprim.GestionDesFoyer.entities.Foyer;
import tn.esprim.GestionDesFoyer.services.IFoyerService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {

    private final IFoyerService foyerService;

    @GetMapping("/retrieve-all")
    public List<Foyer> getAll() {
        return foyerService.retrieveAllFoyers();
    }

    @GetMapping("/retrieve/{id}")
    public Foyer get(@PathVariable Long id) {
        return foyerService.retrieveFoyer(id);
    }

    @PostMapping("/add")
    public Foyer add(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    @PutMapping("/update")
    public Foyer update(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable Long id) {
        foyerService.removeFoyer(id);
    }
}