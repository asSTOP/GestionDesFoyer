package tn.esprim.GestionDesFoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprim.GestionDesFoyer.entities.Universite;
import tn.esprim.GestionDesFoyer.services.IUniversiteService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {

    private final IUniversiteService universiteService;

    @GetMapping("/retrieve-all")
    public List<Universite> getAll() {
        return universiteService.retrieveAllUniversites();
    }

    @GetMapping("/retrieve/{id}")
    public Universite get(@PathVariable Long id) {
        return universiteService.retrieveUniversite(id);
    }

    @PostMapping("/add")
    public Universite add(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @PutMapping("/update")
    public Universite update(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable Long id) {
        universiteService.removeUniversite(id);
    }
}