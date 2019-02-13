package edu.fatec;

import edu.fatec.dto.Address;
import edu.fatec.interfaces.CustomerRepository;
import edu.fatec.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author KelvinVicenteCosta
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        repository.save(new Customer("Kelvin", "Costa", new Address("03586-000", "Avenida Lider", "1150", "Ap 65 Bl 1")));
        repository.save(new Customer("Judy", "Costa", new Address("03586-000", "Avenida Lider", "1150", "Ap 65 Bl 1")));

        System.out.println("Customers find with findAll()");
        System.out.println("-----------------------------");
        repository.findAll().forEach((customer) -> {
            System.out.println(customer);
        });
        System.out.println();

        System.out.println("Customer find with findByFirstName()");
        System.out.println("------------------------------------");
        System.out.println(repository.findByFirstName("Kelvin"));

        System.out.println("Customer find with findByLastName()");
        System.out.println("------------------------------------");
        System.out.println(repository.findByLastName("Costa"));

    }

}
