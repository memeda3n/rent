
package cn.watson.rent.web.config;


import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    private String url;
    private String username;
    private String password;

    @Bean("dataSource")
    public DataSource getDataSource() {
        HikariDataSource ds = DataSourceBuilder.create().type(HikariDataSource.class).build();
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/rent");
        ds.setPassword("123456");
        ds.setUsername("root");
        return  ds;
    }

}

