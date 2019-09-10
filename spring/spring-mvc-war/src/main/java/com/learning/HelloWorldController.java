package com.learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public ModelAndView showMessage(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        String message = "Welcome to Spring MVC!";
        ModelAndView mv = new ModelAndView("helloworld");
        mv.addObject("message", message);
        mv.addObject("name", name);
        return mv;
    }

    @RequestMapping(value = "/learning/{name}", method = RequestMethod.GET)
    public @ResponseBody Employee getTestApi(@PathVariable String name) {
        return new Employee(name, "QA Leader");
    }
}
