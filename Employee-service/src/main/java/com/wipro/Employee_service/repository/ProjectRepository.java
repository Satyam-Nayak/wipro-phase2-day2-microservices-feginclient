package com.wipro.Employee_service.repository;

import com.wipro.Employee_service.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    Optional<Project> findByPcode(Long pcode);
}
