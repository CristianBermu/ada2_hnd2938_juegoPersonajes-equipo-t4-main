package ada.grupo4t.apipearsonada.contoller;

import ada.grupo4t.apipearsonada.service.PartidaService;
import ada.grupo4t.apipearsonada.model.Partida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partida")
public class PartidaController {
    @Autowired
    PartidaService partidaService;

    @GetMapping("")
    public List<Partida> list(){
        return partidaService.listAllPartida();
    }

    @PostMapping("/")
    public void add(@RequestBody Partida partida){
        partidaService.savePartida(partida);
    }
}
