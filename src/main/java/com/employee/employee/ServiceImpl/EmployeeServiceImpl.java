package com.employee.employee.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.employee.employee.Repository.JDBCRepository;

//import com.employee.employee.Repository.EngineeringEmployeeRepository;
import lombok.extern.slf4j.Slf4j;



@Service
public class EmployeeServiceImpl {
    
    @Autowired
    public JDBCRepository dao;
    
    @Cacheable(value = "employee", cacheManager = "cacheManager", key = "#id")
    public Object getEmployeeById(String id)
    {
      
       return dao.findById(id).get();
        
       
    }
    
   // @Cacheable(value = "employee", cacheManager = "cacheManager", key = "#id")
    public List<Object> findAll()
    {
      
       return dao.getData();
        
       
    }
    
}
