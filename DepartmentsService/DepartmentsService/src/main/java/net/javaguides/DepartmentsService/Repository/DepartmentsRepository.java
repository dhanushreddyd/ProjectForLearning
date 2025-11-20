package net.javaguides.DepartmentsService.Repository;

import net.javaguides.DepartmentsService.Entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsRepository extends JpaRepository<Departments,Long>
{
     Departments findByDepartmentsCode(String deparmentsCode);
}
