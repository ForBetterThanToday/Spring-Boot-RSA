package shinhan.icebreaker.demoservice.rsa;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;


@Controller
public class mainController {
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Hello Spring";
    }
}
