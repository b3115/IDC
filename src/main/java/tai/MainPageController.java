package tai;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainPageController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}