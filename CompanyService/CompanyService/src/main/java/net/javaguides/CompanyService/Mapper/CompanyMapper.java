package net.javaguides.CompanyService.Mapper;

import net.javaguides.CompanyService.Dto.CompanyDto;
import net.javaguides.CompanyService.Entity.Company;

public class CompanyMapper
{
    public static CompanyDto mapToCompanyDto(Company company)
    {
        CompanyDto companyDto=new CompanyDto(
                company.getId(),
                company.getCompanyName(),
                company.getCompanyLoc(),
                company.getEmail(),
                company.getDepartmentsCode()
        );

        return companyDto;
    }

    public static Company mapToCompany(CompanyDto companyDto)
    {
        Company company=new Company(
                companyDto.getId(),
                companyDto.getCompanyName(),
                companyDto.getCompanyLoc(),
                companyDto.getEmail(),
                companyDto.getDepartmentsCode()
        );

        return company;
    }
}
