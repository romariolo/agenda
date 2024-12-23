package agenda.agendaOnline.service;

import agenda.agendaOnline.entity.Paciente;
import agenda.agendaOnline.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public List<Paciente> listar(){
        return repository.findAll();
    }

    public void salvar(Paciente paciente){
        repository.save(paciente);
    }
}
