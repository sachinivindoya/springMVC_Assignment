package lk.ijse.aad.entity;

import lombok.*;

import javax.persistence.Id;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data
public class Project {
    @Id
    private String projectId;
    private String projectName;
    private String Details;
    private int noOfMembers;
}
