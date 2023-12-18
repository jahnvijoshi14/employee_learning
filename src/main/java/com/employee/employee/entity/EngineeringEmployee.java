package com.employee.employee.entity;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import org.apache.catalina.User;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="employee", schema="engineering", catalog="engineering")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EngineeringEmployee implements Serializable {
    
    // @Id
    // @GeneratedValue(strategy= GenerationType.AUTO)
    // private Integer id;
    // private String name;
    // @ManyToOne(cascade = CascadeType.ALL)
    //  private Department department;
 
    
    //@UuidGenerator
    
    @Id
    private String id;
    
    /*Can we have department as enum?*/
    private String name;
    private String department;
    


    
}
