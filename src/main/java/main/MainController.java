
package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import sun.applet.Main;

@SpringBootApplication
@EnableSwagger2
public class MainController {
    public static void main(String[] args){
        SpringApplication.run(MainController.class,args);


    }
}
