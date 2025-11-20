package net.javaguides.CompanyService.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class APIResponseDto
{
    private CompanyDto companys;
    private DepartmentsDto departments1;
}
