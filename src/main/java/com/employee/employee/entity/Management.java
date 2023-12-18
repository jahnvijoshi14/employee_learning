package com.employee.employee.entity;

import jakarta.persistence.Id;

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
@Table(name="employee", schema="management", catalog="management")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Management implements Serializable {
     @Id
    private String id;
    
    /*Can we have department as enum?*/
    private String name;
    private String department;
    
}
