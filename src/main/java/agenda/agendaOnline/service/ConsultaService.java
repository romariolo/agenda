package agenda.agendaOnline.service;

import agenda.agendaOnline.entity.Consulta;
import agenda.agendaOnline.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository repository;

   public List<Consulta> listar(){
       return repository.findAll();
   }

   public void salvar(Consulta consulta){
       repository.save(consulta);
   }


}
