package com.hibernateExample.magazyn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class MagazynApplication {
        public static void main(String[] args) {
         SpringApplication.run(MagazynApplication.class, args);
     // StartController.  viewMagazynierzy();
    }
}
