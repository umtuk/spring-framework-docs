package The_IoC_Container.Annotation_based_Container_Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {
    private final CustomerPreferenceDao customerPreferenceDao;

    @Autowired
    public  MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
        this.customerPreferenceDao = customerPreferenceDao;
    }
}
