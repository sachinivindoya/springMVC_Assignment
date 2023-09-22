package lk.ijse.aad.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ProjectDTO {

    private String projectId;
    private String projectName;
    private String tlID;
    private String dueDate;
}
