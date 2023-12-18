// package com.employee.employee.configuration;

// import javax.sql.DataSource;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
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

// @Configuration
// @EnableTransactionManagement
// @EnableJpaRepositories(
//         entityManagerFactoryRef = "engineeringEntityManagerFactory",
//         transactionManagerRef = "engineeringTransactionManager",
//         basePackages = { "com.employee.employee.Repository" })
// public class EngineeringDatasourceConfiguration {

//     @Primary
//     @Bean(name="engineeringProperties")
//     @ConfigurationProperties("spring.datasource")
//     public DataSourceProperties dataSourceProperties() {

//         return new DataSourceProperties();
//     }

// @Primary
// @Bean(name="engineeringDatasource")
// @ConfigurationProperties(prefix = "spring.datasource")
// public DataSource datasource(@Qualifier("engineeringProperties") DataSourceProperties properties){

//     return properties.initializeDataSourceBuilder().build();
// }

//  @Primary
//   @Bean(name="engineeringEntityManagerFactory")
//   public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
//         (EntityManagerFactoryBuilder builder, @Qualifier("engineeringDatasource") DataSource dataSource){

//     return builder.dataSource(dataSource)
//             .packages("com.employee.employee.entity")
//             .persistenceUnit("engineeringemployee").build();
// }

// @Primary
// @Bean(name = "engineeringTransactionManager")
// @ConfigurationProperties("spring.jpa")
// public PlatformTransactionManager transactionManager(
//     @Qualifier("engineeringEntityManagerFactory") EntityManagerFactory entityManagerFactory) {

//     return new JpaTransactionManager(entityManagerFactory);
// }


   



// }