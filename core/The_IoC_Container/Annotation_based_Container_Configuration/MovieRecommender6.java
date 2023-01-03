package The_IoC_Container.Annotation_based_Container_Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MovieRecommender6 {

    private Map<String, MovieCatalog> movieCatalogMap;

    @Autowired
    public void setMovieCatalogMap(Map<String, MovieCatalog> movieCatalogMap) {
        this.movieCatalogMap = movieCatalogMap;
    }
}
