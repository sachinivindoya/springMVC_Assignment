package lk.ijse.aad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TechLead {
    @Id
    private String TLId;
    private String TLName;
    @OneToMany
    private List<Project> projectID = new ArrayList();
    private double TLSalary;

}
