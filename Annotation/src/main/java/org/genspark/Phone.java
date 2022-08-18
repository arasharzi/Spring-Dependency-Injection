package org.genspark;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone
{
    @Value("123-456-7890")
    private String mob;
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
