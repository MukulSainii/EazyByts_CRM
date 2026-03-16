# create application-dev.properties (inside src/main/resources) and add below properties
spring.datasource.username=
spring.datasource.password=
spring.datasource.url=jdbc:p6spy:mysql://localhost:3306/crm
spring.datasource.driver-class-name=com.p6spy.engine.spy.P6SpyDriver


# Disable Hibernate SQL logging (P6Spy will handle it)
spring.jpa.show-sql=false
logging.level.org.hibernate.SQL=off

# Enable P6Spy logging
logging.level.p6spy=DEBUG
logging.level.com.p6spy=DEBUG


# for seeing execuation of spring on console help for debugging
logging.level.org.springframework.web=DEBUG

# for tracing all request in project
logging.level.org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping=TRACE
