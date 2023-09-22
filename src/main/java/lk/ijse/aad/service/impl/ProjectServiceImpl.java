package lk.ijse.aad.service.impl;

import lk.ijse.aad.dto.ProjectDTO;
import lk.ijse.aad.entity.Project;
import lk.ijse.aad.entity.TechLead;
import lk.ijse.aad.repository.ProjectRepository;
import lk.ijse.aad.repository.TechLeadRepository;
import lk.ijse.aad.service.ProjectService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository repo;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private TechLeadRepository tlRepo;
    @Override
    public void saveProject(ProjectDTO dto) {
        if (!repo.existsById(dto.getProjectId())){
            TechLead techLead = mapper.map(tlRepo.getTechLeadsById(dto.getTlID()), TechLead.class);
            if (techLead!=null){
                repo.save( mapper.map(dto, Project.class));
            }else {
                throw new RuntimeException("Project Does Not Exist...!");
            }
        }else {
            throw new RuntimeException("Project Already Exist...!");
        }
    }

    @Override
    public void deleteProject(String id) {
        if (repo.existsById(id)){
            repo.deleteById(id);
        }else {
            throw new RuntimeException("Project Already Exist...!");
        }
    }

    @Override
    public void updateProject(ProjectDTO dto) {
        if (repo.existsById(dto.getProjectId())) {
            repo.save(mapper.map(dto, Project.class));
        }else {
            throw new RuntimeException("Project NOT Exist...!");
        }
    }

    @Override
    public ProjectDTO searchProject(String id) {
        if (repo.existsById(id)){
            Project project = repo.findById(id).get();
            return mapper.map(project,ProjectDTO.class);
        }else {
            throw new RuntimeException("Project NOT Exist...!");
        }
    }

    @Override
    public List<ProjectDTO> getAllProject() {
        List<Project> all = repo.findAll();
        return mapper.map(all,new TypeToken<List<ProjectDTO>>(){}.getType());
    }
}
