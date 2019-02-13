package edu.fatec.dto;

import org.springframework.data.annotation.Id;

/**
 *
 * @author KelvinVicenteCosta
 */
public class Customer {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Address endereco;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Address endereco) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", endereco=" + endereco + '}';
    }

}
