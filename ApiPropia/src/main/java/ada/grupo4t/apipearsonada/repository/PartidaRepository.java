package ada.grupo4t.apipearsonada.repository;

import ada.grupo4t.apipearsonada.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PartidaRepository extends JpaRepository<Partida, Integer> {
    @Query(
            value = "SELECT * FROM partida  ORDER BY puntuacion ASC",
            nativeQuery = true)
    List<Partida> findAllActivePartidasNative();


}
