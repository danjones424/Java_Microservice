package springbooth2.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "employee_table")

public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phone;
    private String birthDate;
    private String jobTitle;
    private String department;
    private String location;
    private String startDate;
    private String employeeID;
    private String managerReporting;
}