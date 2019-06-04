package hossein.springframework.demo.controllers;

import org.springframework.stereotype.Controller;

//Controller annotation makes this class as spring component
//which will be managed by spring context
//So, when spring starts up, it creates an instance of it and put
//this instance into the spring context
//Controller indicate that it is a spring bean
@Controller
public class MyController {

    public void hello(){
        System.out.println("Hello World!");
    }
}
