package edu.fatec.dto;

/**
 *
 * @author KelvinVicenteCosta
 */
public class Address {

    private String cep;
    private String endereco;
    private String numero;
    private String complemento;

    public Address() {
    }

    public Address(String cep, String endereco, String numero, String complemento) {
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Address{" + "cep=" + cep + ", endereco=" + endereco
                + ", numero=" + numero + ", complemento=" + complemento + '}';
    }

}
