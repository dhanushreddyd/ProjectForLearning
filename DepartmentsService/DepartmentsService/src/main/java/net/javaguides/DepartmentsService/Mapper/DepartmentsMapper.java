package net.javaguides.DepartmentsService.Mapper;

import net.javaguides.DepartmentsService.Dto.DepartmentsDto;
import net.javaguides.DepartmentsService.Entity.Departments;

public class DepartmentsMapper
{
    public static DepartmentsDto mapToDepartmentsDto(Departments departments)
    {
        DepartmentsDto departmentsDto=new DepartmentsDto(
                departments.getId(),
                departments.getDepartmentsName(),
                departments.getDepartmentsDescription(),
                departments.getDepartmentsCode()
        );
        return departmentsDto;
    }

    public static Departments mapToDepartments(DepartmentsDto departmentsDto)
    {
        Departments departments=new Departments(
                departmentsDto.getId(),
                departmentsDto.getDepartmentsName(),
                departmentsDto.getDepartmentsDescription(),
                departmentsDto.getDepartmentsCode()
        );
        return departments;
    }

}
