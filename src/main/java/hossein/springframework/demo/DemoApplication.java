package hossein.springframework.demo;

import hossein.springframework.demo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        // By default, spring will go ahead and create bean
        // and gonna give it a name of the class name with the leading
        // lower case letter
        MyController myController = (MyController) ctx.getBean("myController");

        myController.hello();
    }

}
