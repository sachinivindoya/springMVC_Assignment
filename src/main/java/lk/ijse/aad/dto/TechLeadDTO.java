package lk.ijse.aad.dto;

import lk.ijse.aad.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TechLeadDTO {
    private String TLId;
    private String TLName;
    private List<Project> projectID = new ArrayList();
    private double TLSalary;
}
