package mvc.spring.xml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcSpringController {

    @GetMapping("/test-method") // current URL for this method(web-page)
    public String testWebMethod() {
        return "hello_world";
    }
}
