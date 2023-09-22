package lk.ijse.aad.controller;

import lk.ijse.aad.dto.ProjectDTO;
import lk.ijse.aad.service.ProjectService;
import lk.ijse.aad.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
@CrossOrigin
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllProjects(){
        return new ResponseUtil(200,"OK",projectService.getAllProject());
    }

    @ResponseStatus(HttpStatus.CREATED)//201

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveProject(@RequestBody ProjectDTO dto){
        System.out.println(dto.toString());
        projectService.saveProject(dto);
        return new ResponseUtil(200,"Save..!",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateProject(ProjectDTO dto){
        projectService.updateProject(dto);
        return new ResponseUtil(200,"Updated..!",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteProject( String id){
        projectService.deleteProject(id);
        return new ResponseUtil(200,"Deleted..!",null);
    }

    @GetMapping(path = "/id",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchProject( String id){
        return new ResponseUtil(200,"OK",projectService.searchProject(id));
    }
}
