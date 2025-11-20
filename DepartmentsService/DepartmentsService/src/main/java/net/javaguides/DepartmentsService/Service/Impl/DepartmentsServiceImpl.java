package net.javaguides.DepartmentsService.Service.Impl;

import lombok.AllArgsConstructor;
import net.javaguides.DepartmentsService.DepartmentsServiceApplication;
import net.javaguides.DepartmentsService.Dto.DepartmentsDto;
import net.javaguides.DepartmentsService.Entity.Departments;
import net.javaguides.DepartmentsService.Mapper.DepartmentsMapper;
import net.javaguides.DepartmentsService.Repository.DepartmentsRepository;
import net.javaguides.DepartmentsService.Service.DepartmentsService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class DepartmentsServiceImpl implements DepartmentsService {

    private DepartmentsRepository departmentsRepository;
    private DepartmentsMapper departmentsMapper;


    @Override
    public DepartmentsDto saveDepartments(DepartmentsDto departmentsDto) {

        //convert DTO into JPA Entity
        Departments departments=DepartmentsMapper.mapToDepartments(departmentsDto);

        Departments savedDepartments=departmentsRepository.save(departments);

        DepartmentsDto updatedDepartmentsDto=DepartmentsMapper.mapToDepartmentsDto(savedDepartments);

        return updatedDepartmentsDto;
    }

    @Override
    public DepartmentsDto getDepartmentsByCode(String departmentsCode) {

        Departments departments=departmentsRepository.findByDepartmentsCode(departmentsCode);

        DepartmentsDto departmentsDto=DepartmentsMapper.mapToDepartmentsDto(departments);

        return departmentsDto;
    }


}
