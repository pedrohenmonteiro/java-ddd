package com.pedromonteiro.javaddd.Entity;


// entity. entidade é unico, não pode distinguir um objeto do outro se o ID for igual.
// entity é unica por ter um ID, mas os outros atributos podem ir mudando com o tempo

// entidade anemica, está apenas guardando dados. nao carrega regra de negocio, apenas dados.
public class Customer {
    
    private String id;
    private String name;
    private String addressString;
    
    
    public Customer(String id, String name, String addressString) {
        this.id = id;
        this.name = name;
        this.addressString = addressString;
    }


    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getAddressString() {
        return addressString;
    }


    public void setId(String id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }

    
    
    
}
