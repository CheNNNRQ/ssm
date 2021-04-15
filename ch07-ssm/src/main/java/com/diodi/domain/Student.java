package com.diodi.domain;

/**
 * @author diodi
 * @create 2021-04-06-21:07
 */
public class Student {
    public Integer id;
    public String name;
    public Integer age;

    public Student() {
    }

    public Student(Integer id , String name , Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student(id="+this.getId()+", name="+this.getName()+", age="+this.getAge()+")";
    }
}
