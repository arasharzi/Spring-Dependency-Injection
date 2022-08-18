/*
    used annotations to set the default values
 */

package org.genspark;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        Student student = (Student)context.getBean("student");
        System.out.println(student.getInfo());
    }
}
