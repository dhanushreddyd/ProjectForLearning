package net.javaguides.DepartmentsService.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="departments1")
public class Departments
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false , unique = true)
  private String departmentsName;
  @Column(nullable = false , unique = true)
  private String departmentsDescription;
  @Column(nullable = false , unique = true)
  private String departmentsCode;
}
