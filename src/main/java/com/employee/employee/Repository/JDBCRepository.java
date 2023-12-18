package com.employee.employee.Repository;

import java.util.List;
import java.util.Optional;

import com.employee.employee.entity.EngineeringEmployee;

public interface JDBCRepository {

    public List < Object > getData();
    public int save(EngineeringEmployee employee, String id);
    public Optional<Object> findById(String id);
    
}
