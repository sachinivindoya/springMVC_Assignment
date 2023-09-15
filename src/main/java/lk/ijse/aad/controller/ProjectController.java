package lk.ijse.aad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("project")
public class ProjectController {

    @GetMapping
    public String project(){
        System.out.println("Project method invoked");
        return "Hello Project";
    }
}
