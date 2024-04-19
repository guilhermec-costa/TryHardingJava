package com.springIntro.quickstart;

import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springIntro.quickstart.services.IColourPrinter;

import lombok.extern.java.Log;

/*
    Maven phases: clean, default and site ( each phase has its goals )
    
    -> clean phase:
        * clean goal: remove target directory
        
    -> default phase:
        * compile
        * test
        * package
        * verify
    
    ----------------------------------------------------------------------

    Spring Boot: is built on top of Spring Framework
        -> Layers:
            * Persistence ( database interacation  [ Repositories | DAO ])
            * Service: Implement interfaces that uses the funcionalities exposed by the persistence layer
            * Presentation: gets the data returned by the services, and presents it to the final user
                !!: The presentation layer must never talk to the persistence layer directly

            Dependency Injenction: it is in the core of Spring Framework


    @Component - tells spring that it should consider that class as bean
    @Bean - to define beans as well ( but inside configuration class, with @Configuration )
        * Concrete classes that are globall accessible in the application context
    
    Componente Scanning: 
        -> Spring looks for beans, create concrete instances of the beans and place them in the application context
        -> ( think as if it was a pool of beans, where one can be plucked out and placed in another place ). This is dependency injection
        -> It checks if that bean has dependencies and check for existence, or create instances for those depedencies
        -> this process is called AUTO WIRING

        @ComponentScan: define the starting point class for Spring start looking for beans and its dependencies

    AutoConfiguration: to provide sensible defaults


    Persistency Layer:
            Database driver: the lower layer. It is provided by the DBMS. It is what makes possible to connect to a database
                -> JDBC: java database connectivity. It is possible to connect to databases via this and make queries with pure SQL
                    * Spring JDBC: it is built on top of JDBC
                -> JPA: java persistency api. 
                    It is build on top of JDBC. JPA is, technically, a specification. It defines how you query data via java objects
                        * Hibernate: it is the implementation of JPA in the Spring Ecosystem. Hibernate is referred as an ORM
                          ! Hibernate and JPA are called sinonomously among Spring devs
                        * Spring Data JPA: it is built on top of JPA. They are mentioned as synonomous. Implement feature, such as repositories
                        Hibernate is considered a ORM in the Spring ecosystem
*/

@SpringBootApplication
@Log
public class QuickstartApplication implements CommandLineRunner {

    public IColourPrinter colorPrinter;

    private final static Logger LOGGER = Logger.getLogger(QuickstartApplication.class.getName());

    
	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
    }
}
