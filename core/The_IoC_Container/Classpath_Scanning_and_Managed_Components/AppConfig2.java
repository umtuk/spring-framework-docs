package The_IoC_Container.Classpath_Scanning_and_Managed_Components;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(basePackages = "The_IoC_Container",
        includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Stub.*Repository"),
        excludeFilters = @ComponentScan.Filter(Repository.class))
public class AppConfig2 {
    // do something ...s
}
