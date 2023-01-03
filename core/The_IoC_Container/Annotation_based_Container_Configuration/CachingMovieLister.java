package The_IoC_Container.Annotation_based_Container_Configuration;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CachingMovieLister {

    @PostConstruct
    public void populateMovieCache() {
        // do something ...
    }

    @PreDestroy
    public void clearMovieCache() {
        // do something ...
    }
}
