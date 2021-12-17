package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();

        Parrot p = new Parrot();

        p.setName("Riki");

        System.out.println("the parrot's name is " + p.getName());
    }
}
