package app.messages;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import net.sf.log4jdbc.sql.jdbcapi.DataSourceSpy;
//import org.springframework.beans.factory.annotation.*;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

//import java.beans.BeanProperty;
//import javax.sql.DataSource;

@Configuration
@ComponentScan("app.messages")
public class AppConfig {

    @Bean
    public FilterRegistrationBean<AuditingFilter> auditingFilterRegistrationBean() {
        FilterRegistrationBean<AuditingFilter> registration = new FilterRegistrationBean<>();
        AuditingFilter filter = new AuditingFilter();
        registration.setFilter(filter);
        registration.setOrder(Integer.MAX_VALUE);
        registration.setUrlPatterns(Arrays.asList("/messages/*"));
        return registration;
    }
}