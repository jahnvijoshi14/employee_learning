// package com.employee.employee.configuration;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Primary;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.orm.jpa.JpaTransactionManager;
// import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
// import org.springframework.transaction.PlatformTransactionManager;
// import org.springframework.transaction.annotation.EnableTransactionManagement;

// import jakarta.persistence.EntityManagerFactory;

// import javax.sql.DataSource;
// import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;


// @Configuration
// @EnableTransactionManagement
// @EnableJpaRepositories(
//         entityManagerFactoryRef = "managementEntityManagerFactory",
//         transactionManagerRef = "managementTransactionManager",
//         basePackages = { "ccom.employee.employee.Repository" })
// public class ManagementDatasourceConfiguration {

//     @Bean(name="managementProperties")
//     @ConfigurationProperties("spring.datasource.management")
//     public DataSourceProperties dataSourceProperties() {
//         return new DataSourceProperties();
//     }

//     @Bean(name="managementDatasource")
//     @ConfigurationProperties(prefix = "spring.datasource.management")
//     public DataSource datasource(@Qualifier("managementProperties") DataSourceProperties properties){
//         return properties.initializeDataSourceBuilder().build();
//     }

 

// @Bean(name="managementEntityManagerFactory")
// public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
//         (EntityManagerFactoryBuilder builder,  @Qualifier("managementDatasource") DataSource dataSource){

//     return builder.dataSource(dataSource)
//             .packages("com.employee.employee.entity.")
//             .persistenceUnit("management").build();
// }

// @Bean(name = "managementTransactionManager")
// @ConfigurationProperties("spring.jpa")
// public PlatformTransactionManager transactionManager(
//         @Qualifier("managementEntityManagerFactory") EntityManagerFactory entityManagerFactory) {

//     return new JpaTransactionManager(entityManagerFactory);
// }







// }

   