package com.example.Runner;

import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyStartupRunner1 implements CommandLineRunner {

    @Autowired
    private ServletContext servletContext;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello Xanxus CommandLineRunner CommandLineRunner");
        servletContext.setAttribute("name", "Xanxus");
    }

}
