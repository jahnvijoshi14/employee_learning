// package com.employee.employee.entity;

// import java.io.Serializable;
// import java.util.List;
// import java.util.Set;

// import org.springframework.data.redis.core.RedisHash;

// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @Entity
// @Table(name="department")
// @AllArgsConstructor
// @NoArgsConstructor
// @Getter
// @Setter
// public class Department implements Serializable{

//     @Id
//     @GeneratedValue(strategy= GenerationType.AUTO)
//     private Integer id;
//     private String name;

//     // @OneToMany(cascade = CascadeType.ALL)
//     // List<Employee> employee;
    
// }
