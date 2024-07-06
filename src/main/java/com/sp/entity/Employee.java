package com.sp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_details")
@NamedQuery(name="Allemployeedetails", query="SELECT e FROM Employee e")
public class Employee {
    
    @Id
    @Column(name="employee_id")
    private int employee_id;
    
    @Column(name="employee_firstname")
    private String employee_firstname;
    
    @Column(name="employee_lastname")
    private String employee_lastname;
    
    @Column(name="Address")
    private String Address;
    
    @Column(name="pincode")
    private int pincode;
    
    // Getters and setters
    public int getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    public String getEmployee_firstname() {
        return employee_firstname;
    }
    public void setEmployee_firstname(String employee_firstname) {
        this.employee_firstname = employee_firstname;
    }
    public String getEmployee_lastname() {
        return employee_lastname;
    }
    public void setEmployee_lastname(String employee_lastname) {
        this.employee_lastname = employee_lastname;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}