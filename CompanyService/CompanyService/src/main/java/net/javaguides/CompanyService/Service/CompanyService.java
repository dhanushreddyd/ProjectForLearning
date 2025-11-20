package net.javaguides.CompanyService.Service;

import net.javaguides.CompanyService.Dto.APIResponseDto;
import net.javaguides.CompanyService.Dto.CompanyDto;

public interface CompanyService
{
    CompanyDto saveCompany(CompanyDto companyDto);

    APIResponseDto getCompanyById(Long id);
}
