package com.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

public class Student
{
    private int id;
    private String name;
    @Autowired
    private List<Phone> ph;
    @Autowired
    private Address add;

    public Student()
    {

    }

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Phone> getPh()
    {
        return ph;
    }

    public void setPh(List<Phone> ph)
    {
        this.ph = ph;
    }

    public Address getAdd()
    {
        return add;
    }

    public void setAdd(Address add)
    {
        this.add = add;
    }

    public String getInfo()
    {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add.toString() +
                '}';
    }
}
