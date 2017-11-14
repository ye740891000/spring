package com.jin.spring02.Model;

import javax.persistence.*;

@Entity
@Table(name = "S_S")
public class Student {
    public Student(String name, String address, Integer age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
public  Student(){
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String address;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
