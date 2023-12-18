package com.employee.employee.controller;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.Repository.JDBCRepository;
//import com.employee.employee.Repository.EngineeringEmployeeRepository;
//import com.employee.employee.Repository.ManagementRepository;
import com.employee.employee.ServiceImpl.EmployeeServiceImpl;

import com.employee.employee.entity.EngineeringEmployee;
import com.employee.employee.entity.Management;

import jakarta.persistence.Cacheable;
import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {
   
    // @Autowired
    // private EngineeringEmployeeRepository engineeringEmployeeRepository;

    // @Autowired
    // private ManagementRepository managementRepository;
    
    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    // @PostMapping("/")
    // public  String addEmployee(@RequestBody EngineeringEmployee employee)
    // {
    //     //add service later
       
    // //    ((EngineeringEmployee) employee).setId("eng"+"-"+ LocalDateTime.now()) ;
    // //    EngineeringEmployee emp= engineeringEmployeeRepository.save((EngineeringEmployee)employee);
        
    //   EngineeringEmployee emp=new EngineeringEmployee();
    //   emp.setId("eng"+"-"+ LocalDateTime.now());
    //   emp.setDepartment(((EngineeringEmployee) employee).getDepartment());
    //   emp.setName(((EngineeringEmployee) employee).getName());
    //   engineeringEmployeeRepository.save(emp);

     

    //     return emp.getId()+"  "+ emp.getDepartment();
    // }
    

    // @PostMapping("/test")
    // public  String addEmployees(@RequestBody Management employee)
    // {
    //     //add service later
       
    // //    ((EngineeringEmployee) employee).setId("eng"+"-"+ LocalDateTime.now()) ;
    // //    EngineeringEmployee emp= engineeringEmployeeRepository.save((EngineeringEmployee)employee);
        
    //  employee.setId("mng"+"-"+ LocalDateTime.now());
     
    //  Management emp=managementRepository.save(employee);

     

    //     return emp.getId()+"  "+ emp.getDepartment();
    // }

   
    // // @GetMapping("/id")
    // // public Employee findById(Integer id)  {
       
    // //    return  employeeServiceImpl.getEmployeeById(id);
       
    // // }


    @Autowired
    public JDBCRepository dao;
    
    
    @GetMapping
    public Object  findById(String id)
    {
        return employeeServiceImpl.getEmployeeById(id);
    }

    @GetMapping("/")
    public List<Object> findAll()
    {
        return employeeServiceImpl.findAll();
        

    }

    @PostMapping
    public int save(@RequestBody EngineeringEmployee employee)
    {
       return dao.save(employee,"eng"+"-"+LocalDateTime.now());
    }
    

}
