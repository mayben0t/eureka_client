package third.cloud.eureka_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String hello(@RequestParam String name){
        return "hi "+name+",i am from port:"+port;
    }
}
