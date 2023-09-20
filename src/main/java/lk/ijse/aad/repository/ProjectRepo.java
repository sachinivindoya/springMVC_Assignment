package lk.ijse.aad.repository;

import lk.ijse.aad.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project,String> {
}
