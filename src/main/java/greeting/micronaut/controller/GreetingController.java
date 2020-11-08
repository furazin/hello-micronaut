package greeting.micronaut.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/api/v1/greetings")
public class GreetingController {

    @Get("/{name}")
    public String greet(String name) {
        return "Hello " + name;
    }
}

