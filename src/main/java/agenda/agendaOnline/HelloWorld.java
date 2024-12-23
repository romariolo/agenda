package agenda.agendaOnline;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {


    //Criando hello world
    @GetMapping
    public String hello(){
        return "Hello, world!";
    }
}
