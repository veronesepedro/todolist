package br.com.pedroveronese.todolist.task;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItaskRepository extends JpaRepository<TaskModel, UUID> {
    List<TaskModel> findByIdUser(UUID idUser);
    TaskModel findByIdAndIdUser(UUID id, UUID idUser);
}
