package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phone;
    private Date birthDate;
    private String jobTitle;
    private String department;
    private String location;
    private Date startDate;
    private String employeeID;
    private String managerReporting;

    public Employee(int id, String firstName, String lastName, String emailAddress, String phone, Date birthDate,
                    String jobTitle, String department, String location, Date startDate, String employeeID,
                    String managerReporting) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.birthDate = birthDate;
        this.jobTitle = jobTitle;
        this.department = department;
        this.location = location;
        this.startDate = startDate;
        this.employeeID = employeeID;
        this.managerReporting = managerReporting;
    }

    public Employee() {

    }

    // Getters and Setters for all the fields
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getManagerReporting() {
        return managerReporting;
    }

    public void setManagerReporting(String managerReporting) {
        this.managerReporting = managerReporting;
    }
}