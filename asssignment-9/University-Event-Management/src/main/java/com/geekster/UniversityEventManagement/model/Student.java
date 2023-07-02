package com.geekster.UniversityEventManagement.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student")
public class Student {

    @Id
    private Integer studentId;

    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "First name must start with a capital letter")
    private String firstName;

    private String lastName;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 25, message = "Age cannot exceed 25")
    private Integer age;

    private Department department;

}
