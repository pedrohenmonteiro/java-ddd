package com.pedromonteiro.javaddd.domain.entity;

import com.pedromonteiro.javaddd.domain.valueObjects.Address;

// entity. entidade é unico, não pode distinguir um objeto do outro se o ID for igual.
// entity é unica por ter um ID, mas os outros atributos podem ir mudando com o tempo

public class Customer {
    
    private String id;
    private String name;
    private Address address;
    private Boolean active = false; 
    
    
    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        this.validate();
    }

    private void validate() {
        if (this.name.length() == 0) throw new Error("Name is required");
        if (this.id.length() == 0) throw new Error("Id is required");
    }


    public void changeName(String name) {
        this.name = name;
        this.validate();
    }


    public void active() {
        if(this.address == null) throw new Error("Address is mandatory to activate a customer");
        this.active = true;
    }

    public void deactive() {
        this.active = false;
    }
    
}
