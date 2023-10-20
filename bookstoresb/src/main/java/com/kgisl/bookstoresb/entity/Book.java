package com.kgisl.bookstoresb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String name;
//@Column(name = "description")
private String description;


public Book() {

}




public Book(String name, String description) {
super();
this.name = name;
this.description = description;
}




public Book(int id, String name, String description) {
super();
this.id = id;
this.name = name;
this.description = description;
}


public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getDescription() {
return description;
}
public void setDescription(String description) {
this.description = description;
}

}
