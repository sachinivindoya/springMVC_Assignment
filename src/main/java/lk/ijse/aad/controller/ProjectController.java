package lk.ijse.aad.controller;

import lk.ijse.aad.dto.ProjectDTO;
import lk.ijse.aad.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
@RequestMapping("/project/*")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    // Save Project
    @PostMapping(path = "/save", consumes = {"application/json"} )
    public boolean saveProject(@RequestBody ProjectDTO  projectDTO ) {
        System.out.println("saveProject() invoked: API Layer");
        //validate received data null and regax
        if(projectDTO != null) {
            return projectService.saveProject(projectDTO);
        }
        return false;
    }
}
//
//        //Save Project
//    @PostMapping(path = "/save", consumes = {MediaType.APPLICATION_JSON_VALUE})
//    boolean saveProject(@RequestBody ProjectDTO projectDTO){
//        if(projectDTO!=null){
//            return projectService.saveProject(projectDTO);
//        }
//        return false;
//    }

