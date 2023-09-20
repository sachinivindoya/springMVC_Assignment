package lk.ijse.aad.service.impl;

import lk.ijse.aad.dto.ProjectDTO;
import lk.ijse.aad.repository.ProjectRepo;
import lk.ijse.aad.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepo projectRepo;

    @Override
    public boolean saveProject(ProjectDTO projectDTO) {
        System.out.println("saveProject() invoked: Service Layer");
//        projectRepo.save(new Project(projectDTO.getProjectID(), projectDTO.getProjectName(), projectDTO.getProjectDetail(), projectDTO.getProjectNumMembers()));
        return true;
    }
}
