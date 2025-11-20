package net.javaguides.CompanyService.Service.Impl;

import lombok.AllArgsConstructor;
import net.javaguides.CompanyService.Dto.APIResponseDto;
import net.javaguides.CompanyService.Dto.CompanyDto;
import net.javaguides.CompanyService.Dto.DepartmentsDto;
import net.javaguides.CompanyService.Entity.Company;
import net.javaguides.CompanyService.Mapper.CompanyMapper;
import net.javaguides.CompanyService.Repository.CompanyRepository;
import net.javaguides.CompanyService.Service.APIClient;
import net.javaguides.CompanyService.Service.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService
{
    private CompanyRepository companyRepository;

    //REST TEMPLATES
    //private RestTemplate restTemplate;
      //private WebClient webClient;
    private APIClient apiClient;

    @Override
    public CompanyDto saveCompany(CompanyDto companyDto) {

        Company company= CompanyMapper.mapToCompany(companyDto);

        Company savedCompany=companyRepository.save(company);

        CompanyDto updatedCompany=CompanyMapper.mapToCompanyDto(savedCompany);

        return updatedCompany;
    }

    @Override
    public APIResponseDto getCompanyById(Long id) {

       Company company=companyRepository.findById(id).get();


     //  ResponseEntity<DepartmentsDto> responseEntity  =restTemplate.getForEntity("http://localhost:8080/api/departments1/" + company.getDepartmentsCode(),
         //      DepartmentsDto.class);

       //DepartmentsDto departmentsDto=responseEntity.getBody();

        /*DepartmentsDto departmentsDto = webClient.get()
                .uri("http://localhost:8080/api/departments1/" + company.getDepartmentsCode())
                .retrieve()
                .bodyToMono(DepartmentsDto.class)
                .block();*/
DepartmentsDto departmentsDto=apiClient.getDepartmentsByCode(company.getDepartmentsCode());

        CompanyDto companyDto=CompanyMapper.mapToCompanyDto(company);

           APIResponseDto apiResponseDto=new APIResponseDto();
           apiResponseDto.setCompanys(companyDto);
           apiResponseDto.setDepartments1(departmentsDto);

       return apiResponseDto;
    }

}
//restTemplate.getForEntity("http://DEPARTMENT-SERVICE/api/departments/" + employee.getDepartmentCode(),
//                DepartmentDto.class);
//"http://localhost:8080/api/departments/" +