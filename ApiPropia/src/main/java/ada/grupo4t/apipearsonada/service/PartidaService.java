package ada.grupo4t.apipearsonada.service;


import ada.grupo4t.apipearsonada.model.Partida;
import ada.grupo4t.apipearsonada.repository.PartidaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PartidaService {
    @Autowired
    private PartidaRepository partidaRepository;
    public List<Partida> listAllPartida(){
        return partidaRepository.findAllActivePartidasNative();
    }

    public void savePartida(Partida partida){
        partidaRepository.save(partida);
    }
}
