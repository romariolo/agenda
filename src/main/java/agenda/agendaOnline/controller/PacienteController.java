package agenda.agendaOnline.controller;


import agenda.agendaOnline.entity.Paciente;
import agenda.agendaOnline.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> listarPacientes(){
        return pacienteService.listar();
    }

    @PostMapping
    public void salvar(@RequestBody Paciente paciente){
        pacienteService.salvar(paciente);
    }
}
