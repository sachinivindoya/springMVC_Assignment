package lk.ijse.aad.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data
public class ProjectDTO {

    private String projectId;
    private String projectName;
    private String Details;
    private int noOfMembers;


}
