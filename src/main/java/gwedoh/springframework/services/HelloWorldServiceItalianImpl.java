package gwedoh.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Italian")
public class HelloWorldServiceItalianImpl implements HelloWorldService
{
    @Override
    public String getGreeting()
    {
        return "Ciao mondo!";
    }
}
