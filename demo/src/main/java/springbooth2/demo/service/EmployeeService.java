package springbooth2.demo.service;

import springbooth2.demo.dao.EmployeeRepository;
import springbooth2.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> createEmployees(List<Employee> employees){
        return employeeRepository.saveAll(employees);
    }

    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id).orElse(null);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee){
        Employee oldEmployee = null;
        Optional<Employee> optionalEmployee = employeeRepository.findById(employee.getId());
        if(optionalEmployee.isPresent()){
            oldEmployee= optionalEmployee.get();
            oldEmployee.setFirstName(employee.getFirstName());
            oldEmployee.setLastName(employee.getLastName());
            oldEmployee.setEmailAddress(employee.getEmailAddress());
            oldEmployee.setPhone(employee.getPhone());
            oldEmployee.setBirthDate(employee.getBirthDate());
            oldEmployee.setJobTitle(employee.getJobTitle());
            oldEmployee.setDepartment(employee.getDepartment());
            oldEmployee.setLocation(employee.getLocation());
            oldEmployee.setStartDate(employee.getStartDate());
            oldEmployee.setEmployeeID(employee.getEmployeeID());
            oldEmployee.setManagerReporting(employee.getManagerReporting());
            employeeRepository.save(oldEmployee);
        }
        else {
            return new Employee();
        }
        return oldEmployee;
    }

    public String deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
        return "This Employee has been deleted";
    }

}
