package The_IoC_Container.Classpath_Scanning_and_Managed_Components;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "The_IoC_Container")
public class AppConfig {
    // do something
}
