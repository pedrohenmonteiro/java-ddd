package com.pedromonteiro.javaddd.Entity;


// entity. entidade é unico, não pode distinguir um objeto do outro se o ID for igual.
// entity é unica por ter um ID, mas os outros atributos podem ir mudando com o tempo

// entidade anemica, está apenas guardando dados. nao carrega regra de negocio, apenas dados.
public class Customer {
    
    private String id;
    private String name;
    private String addressString;
    private Boolean active = true; 
    
    
    public Customer(String id, String name, String addressString, Boolean active) {
        this.id = id;
        this.name = name;
        this.addressString = addressString;
        this.active = active;
    }


    public void changeName(String name) {
        this.name = name;
    }


    public void active() {
        this.active = true;
    }

    public void deactive() {
        this.active = false;
    }
    
}
