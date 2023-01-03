package The_IoC_Container.Annotation_based_Container_Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    /**
     * The default behavior is to treat annotated methods and fields as indicating required dependencies.
     * You can change this behavior enabling the framework to skip a non-satisfiable injection point through marking it as non-required.
     * @param movieFinder
     */
    @Autowired(required = false)
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
}
