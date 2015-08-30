package service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {


    public String getDesc() {
        return "Gradle + Spring MVC Hello World Example";
    }

    public String getTitle(String name) {
        return "Hello World";
    }

}