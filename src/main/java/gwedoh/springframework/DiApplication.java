package gwedoh.springframework;

import gwedoh.springframework.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication
{
    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(DiApplication.class, args);
            GreetingController greetingController = (GreetingController) context.getBean("greetingController");
                greetingController.sayHello();
    }
}
