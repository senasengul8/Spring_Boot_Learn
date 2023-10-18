package com.amigoscode;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @SequenceGenerator(name = "customer_id_sequence",sequenceName = "customer_id_sequence")
   @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "customer_id_sequence")
    private Integer id; private String name;
    private String email;
    private Integer age;



    public Customer() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
