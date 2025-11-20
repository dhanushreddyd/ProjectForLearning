package net.javaguides.CompanyService.Repository;

import net.javaguides.CompanyService.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long>
{

}
