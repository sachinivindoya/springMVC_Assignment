package lk.ijse.aad.controller;

import lk.ijse.aad.dto.TechLeadDTO;
import lk.ijse.aad.service.TechLeadService;
import lk.ijse.aad.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/techlead")
public class TechLeadController {


    @Autowired
    TechLeadService techLeadService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllTechLeads(){
        return new ResponseUtil(200,"OK",techLeadService.getAllTechLead());
    }

    @ResponseStatus(HttpStatus.CREATED)//201

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveTechLead(@RequestBody TechLeadDTO dto){

        techLeadService.saveTechLead(dto);
        return new ResponseUtil(200,"Save..!",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateTechLead(@RequestBody TechLeadDTO dto){
        techLeadService.updateTechLead(dto);
        return new ResponseUtil(200,"Updated..!",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteTechLead(@RequestParam String id){
        techLeadService.deleteTechLead(id);
        return new ResponseUtil(200,"Deleted..!",null);
    }

    @GetMapping(path = "/id",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchTechLead(@PathVariable String id){
        return new ResponseUtil(200,"OK",techLeadService.searchTechLead(id));
    }

}
