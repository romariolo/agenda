package agenda.agendaOnline.repository;

import agenda.agendaOnline.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
