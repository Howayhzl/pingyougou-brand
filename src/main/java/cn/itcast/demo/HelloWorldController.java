package cn.itcast.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/info")
    public String info(){
        return "HelloWorld";
    }
}
