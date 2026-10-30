package tn.esprim.GestionDesFoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprim.GestionDesFoyer.entities.Bloc;
import tn.esprim.GestionDesFoyer.services.IBlocService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {

    private final IBlocService blocService;

    @GetMapping("/retrieve-all")
    public List<Bloc> getAll() {
        return blocService.retrieveAllBlocs();
    }

    @GetMapping("/retrieve/{id}")
    public Bloc get(@PathVariable Long id) {
        return blocService.retrieveBloc(id);
    }

    @PostMapping("/add")
    public Bloc add(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @PutMapping("/update")
    public Bloc update(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable Long id) {
        blocService.removeBloc(id);
    }
}