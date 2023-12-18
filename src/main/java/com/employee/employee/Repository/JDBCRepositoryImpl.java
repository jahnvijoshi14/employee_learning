package com.employee.employee.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import com.employee.employee.entity.EngineeringEmployee;



@Repository
public class JDBCRepositoryImpl implements JDBCRepository {

    @Autowired
    private JdbcTemplate jdbcTemplateEng;

    @Autowired
    private JdbcTemplate jdbcTemplateMng;

    @Override
    public List<Object> getData() {

        return jdbcTemplateEng.query(
                "select * from engineering.employee",
                (rs, rowNum) ->
                        new EngineeringEmployee(
                                rs.getString("id"),
                                rs.getString("name"),
                                rs.getString("department")
                        )
        );

    }
    
    @Override
    public int save(EngineeringEmployee employee, String id) {
        return jdbcTemplateEng.update(
                "insert into engineering.employee (id, name,department) values(?,?,?)",
                id,employee.getName(), employee.getDepartment());
    }
    
    @SuppressWarnings("deprecation")
    public Optional<Object> findById(String id)
    {
      
      return jdbcTemplateEng.queryForObject("select * from engineering.employee where id = ?", 
      new Object[]{id},
      
      (rs, rowNum) ->
             Optional.of(new EngineeringEmployee(
                                rs.getString("id"),
                                rs.getString("name"),
                                rs.getString("department")
                        ))
        );

    }
}