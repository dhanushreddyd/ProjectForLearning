package net.javaguides.DepartmentsService.Service;

import net.javaguides.DepartmentsService.Dto.DepartmentsDto;

public interface DepartmentsService
{
    DepartmentsDto saveDepartments(DepartmentsDto departmentsDto);

    DepartmentsDto getDepartmentsByCode(String departmentsCode);
}
