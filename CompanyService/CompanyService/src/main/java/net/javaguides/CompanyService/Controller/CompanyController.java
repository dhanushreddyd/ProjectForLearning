package net.javaguides.CompanyService.Controller;

import lombok.AllArgsConstructor;
import net.javaguides.CompanyService.Dto.APIResponseDto;
import net.javaguides.CompanyService.Dto.CompanyDto;
import net.javaguides.CompanyService.Service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/companies")
public class CompanyController
{
    private CompanyService companyService;

    @PostMapping()
    public ResponseEntity<CompanyDto> saveCompany(@RequestBody CompanyDto companyDto)
    {
        return new ResponseEntity<>(companyService.saveCompany(companyDto), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getCompanyById(@PathVariable("id") Long id)
    {
        APIResponseDto apiResponseDto=companyService.getCompanyById(id);
        return new ResponseEntity<>(apiResponseDto,HttpStatus.OK);
    }
}
