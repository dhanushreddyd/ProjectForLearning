package net.javaguides.DepartmentsService.Controller;

import lombok.AllArgsConstructor;
import net.javaguides.DepartmentsService.Dto.DepartmentsDto;
import net.javaguides.DepartmentsService.Service.DepartmentsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/departments1")
public class DepartmentsController
{
   private DepartmentsService departmentsService;

   @PostMapping()
   public ResponseEntity<DepartmentsDto> saveDepartments(@RequestBody DepartmentsDto departmentsDto)
   {
       return new ResponseEntity<>(departmentsService.saveDepartments(departmentsDto), HttpStatus.CREATED);
   }

   @GetMapping("/{departmentsCode}")
   public ResponseEntity<DepartmentsDto> getDepartmentsByCode(@PathVariable("departmentsCode") String departmentsCode)
   {
      return new ResponseEntity<>(departmentsService.getDepartmentsByCode(departmentsCode),HttpStatus.OK);
   }
}

