package lk.ijse.aad.service;

import lk.ijse.aad.dto.ProjectDTO;

import java.util.List;

public interface ProjectService {
    public void saveProject(ProjectDTO dto);

    public void deleteProject(String id);

    public void updateProject(ProjectDTO dto);

    public ProjectDTO searchProject(String id);

    public List<ProjectDTO> getAllProject();
}
