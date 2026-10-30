package tn.esprim.GestionDesFoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprim.GestionDesFoyer.entities.Etudiant;
import tn.esprim.GestionDesFoyer.services.IEtudiantService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {

    private final IEtudiantService etudiantService;

    @GetMapping("/retrieve-all")
    public List<Etudiant> getAll() {
        return etudiantService.retrieveAllEtudiants();
    }

    @GetMapping("/retrieve/{id}")
    public Etudiant get(@PathVariable Long id) {
        return etudiantService.retrieveEtudiant(id);
    }

    @PostMapping("/add")
    public Etudiant add(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    @PutMapping("/update")
    public Etudiant update(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable Long id) {
        etudiantService.removeEtudiant(id);
    }
}