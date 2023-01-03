package The_IoC_Container.Annotation_based_Container_Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MovieConfiguration {

    /**
     * particular bean should be given preference when multiple beans are candidates to be autowired to a single-valued dependency.
     * @return
     */
    @Bean
    @Primary
    public MovieCatalog firstMovieCatalog() {
        return null;
    }

    @Bean
    public MovieCatalog secondMovieCatalog() {
        return null;
    }
}
