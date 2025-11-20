package net.javaguides.CompanyService.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto
{
    private Long id;
    private String companyName;
    private String companyLoc;
    private String email;

    private String departmentsCode;
}
