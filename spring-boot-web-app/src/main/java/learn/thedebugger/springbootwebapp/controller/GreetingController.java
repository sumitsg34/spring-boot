package learn.thedebugger.springbootwebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greetings/{name}")
    public String getGreetings(@PathVariable String name) {
        return "Hello " + name + ", welcome to the Spring Boot Demo..!!!";
    }

}
