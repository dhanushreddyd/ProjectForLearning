package net.javaguides.DepartmentsService.Dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentsDto
{
    private Long id;
    private String departmentsName;
    private String departmentsDescription;
    private String departmentsCode;
}
