package com.genspark;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Phone
{
    private String mob;

    public Phone()
    {

    }

    public Phone(String mob)
    {
        this.mob = mob;
    }

    public String getMob()
    {
        return mob;
    }
    public void setMob(String mob)
    {
        this.mob = mob;
    }

    @Override
    public String toString()
    {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}