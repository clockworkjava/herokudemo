package pl.com.clockworkjava.herokudemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("hi")
    public String hello() {
        return "hello";
    }

}
