package greeting.micronaut.controller;

import greeting.micronaut.service.GreetingService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller("/api/v1/greetings")
public class GreetingController {

    @Inject
    GreetingService greetingService;

    @Get("/{name}")
    public String greet(String name) {
        return greetingService.greet(name);
    }
}

