package dto.department;

import com.fasterxml.jackson.annotation.JsonProperty;
import dto.employee.EmployeeFullInfoDto;
import lombok.Data;

import java.time.LocalDate;

@Data
public class DepartmentInfoDto {

    @JsonProperty(value = "id")
    private Long id;

    @JsonProperty(value = "departmentName")
    private String departmentName;

    @JsonProperty(value = "creationDate")
    private LocalDate creationDate;

    @JsonProperty(value = "headOfDepartment")
    private EmployeeFullInfoDto headOfDepartment;

    @JsonProperty(value = "quantityOfEmployees")
    private int quantityOfEmployees;

}
