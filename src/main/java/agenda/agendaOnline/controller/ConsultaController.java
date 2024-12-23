package agenda.agendaOnline.controller;

import agenda.agendaOnline.entity.Consulta;
import agenda.agendaOnline.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public List<Consulta> listarTodos(){
        return consultaService.listar();
    }

    @PostMapping
    public void marcarConsulta(@RequestBody Consulta consulta){
        consultaService.salvar(consulta);
    }
}
