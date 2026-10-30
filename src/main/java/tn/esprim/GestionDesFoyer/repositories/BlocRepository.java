package tn.esprim.GestionDesFoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.GestionDesFoyer.entities.Bloc;

@Repository 

public interface BlocRepository extends JpaRepository<Bloc , Long>{

}
